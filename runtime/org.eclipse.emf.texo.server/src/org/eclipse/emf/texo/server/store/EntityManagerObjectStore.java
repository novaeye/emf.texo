package org.eclipse.emf.texo.server.store;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.model.ModelResolver;

/**
 * An {@link ObjectStore} backed by an EntityManager.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class EntityManagerObjectStore extends ObjectStore {

  private static final String FROM = " from "; //$NON-NLS-1$
  private static final String START_FROM = "from "; //$NON-NLS-1$
  private static final int FROM_LENGTH = FROM.length();
  private static final int START_FROM_LENGTH = START_FROM.length();

  @PersistenceContext
  private EntityManager entityManager;

  public EntityManager getEntityManager() {
    if (entityManager == null) {
      entityManager = EntityManagerProvider.getInstance().getEntityManager();
    }

    return entityManager;
  }

  public void setEntityManager(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectStore#get(org.eclipse.emf.ecore.EClass, java.lang.Object)
   */
  @Override
  public Object get(EClass eClass, Object id) {
    final Class<?> clz = ModelResolver.getInstance().getImplementationClass(eClass);
    return getDao(clz).get(id);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.server.store.ObjectStore#get(java.lang.Class, java.lang.Object)
   */
  @Override
  public <T extends Object> T get(Class<T> clz, Object id) {
    return getDao(clz).get(id);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectStore#update(java.lang.Object)
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T extends Object> T update(T object) {
    return ((BaseDao<T>) getDao(object.getClass())).update(object);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectStore#delete(java.lang.Object)
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T extends Object> void remove(T object) {
    ((BaseDao<T>) getDao(object.getClass())).remove(object);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.server.store.ObjectStore#refresh(java.lang.Object)
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T extends Object> void refresh(T object) {
    ((BaseDao<T>) getDao(object.getClass())).refresh(object);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectStore#insert(java.lang.Object)
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T extends Object> void insert(T object) {
    ((BaseDao<T>) getDao(object.getClass())).insert(object);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectStore#query(java.lang.String, java.util.Map)
   */
  @Override
  public List<?> query(String qryStr, Map<String, Object> namedParameters, int firstResult, int maxResults) {
    final Query qry = getEntityManager().createQuery(qryStr);
    if (firstResult != -1) {
      qry.setFirstResult(firstResult);
    }
    if (maxResults != -1) {
      qry.setMaxResults(maxResults);
    }
    for (String key : namedParameters.keySet()) {
      qry.setParameter(key, namedParameters.get(key));
    }
    return qry.getResultList();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectStore#count(java.lang.String, java.util.Map)
   */
  @Override
  public long count(String qryStr, Map<String, Object> namedParameters) {
    final String subQryStr;
    if (qryStr.toLowerCase().contains(FROM)) {
      final int index = qryStr.toLowerCase().indexOf(FROM);
      subQryStr = qryStr.substring(index + FROM_LENGTH);
    } else if (qryStr.toLowerCase().startsWith(START_FROM)) {
      subQryStr = qryStr.substring(START_FROM_LENGTH);
    } else {
      subQryStr = qryStr;
    }
    final Query qry = getEntityManager().createQuery("select count(e) from " + subQryStr); //$NON-NLS-1$
    for (String key : namedParameters.keySet()) {
      qry.setParameter(key, namedParameters.get(key));
    }
    return ((Number) qry.getSingleResult()).longValue();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.store.ObjectStore#query(org.eclipse.emf.ecore.EClass)
   */
  @Override
  public List<?> query(EClass eClass, int firstResult, int maxResults) {
    final Class<?> clz = ModelResolver.getInstance().getImplementationClass(eClass);
    final CriteriaBuilder queryBuilder = getEntityManager().getCriteriaBuilder();
    final CriteriaQuery<?> qdef = queryBuilder.createQuery(clz);
    qdef.from(clz);
    final Query query = getEntityManager().createQuery(qdef);
    if (firstResult > -1) {
      query.setFirstResult(firstResult);
    }
    if (maxResults > -1) {
      query.setMaxResults(maxResults);
    }
    return query.getResultList();
  }

  /**
   * Calls {@link EntityManager#getTransaction()#begin()}.
   */
  @Override
  public void begin() {
    if (getEntityManager().getTransaction().isActive()) {
      // already begun
      return;
    }
    getEntityManager().getTransaction().begin();
  }

  /**
   * Calls {@link EntityManager#getTransaction()#commit()}.
   */
  @Override
  public void commit() {
    getEntityManager().getTransaction().commit();
  }

  /**
   * Calls {@link EntityManager#flush()}.
   */
  @Override
  public void flush() {
    getEntityManager().flush();
  }

  /**
   * Calls {@link EntityManager#getTransaction()#rollback()}.
   */
  @Override
  public void rollback() {
    if (getEntityManager().getTransaction() != null && getEntityManager().getTransaction().isActive()) {
      getEntityManager().getTransaction().rollback();
    }
  }

  /**
   * Calls {@link EntityManager#close()}.
   */
  @Override
  public void close() {
    getEntityManager().close();
  }

  /**
   * @return the {@link EntityManager}
   */
  @Override
  public Object getDelegate() {
    return getEntityManager();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.server.store.ObjectStore#getReferingObjects(java.lang.Object, int, boolean)
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T extends Object> List<Object> getReferingObjects(T target, int maxResult,
      boolean includeContainmentReferences) {
    return ((BaseDao<T>) getDao(target.getClass())).getReferingObjects(target, maxResult, includeContainmentReferences);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.server.store.ObjectStore#isReferenced(java.lang.Object, boolean)
   */
  @SuppressWarnings("unchecked")
  @Override
  public <T extends Object> boolean isReferenced(T target, boolean includeContainmentReferences) {
    return ((BaseDao<T>) getDao(target.getClass())).isReferenced(target, includeContainmentReferences);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.server.store.ObjectStore#getEntityName(org.eclipse.emf.ecore.EClass)
   */
  @Override
  public String getEntityName(EClass eClass) {
    final Metamodel metaModel = getEntityManager().getMetamodel();
    final EntityType<?> entityType = metaModel.entity(ModelResolver.getInstance().getImplementationClass(eClass));
    return entityType.getName();
  }

  private <T extends Object> BaseDao<T> getDao(Class<T> entityClass) {
    final BaseDao<T> dao = DaoRegistry.getInstance().getDaoForEntity(entityClass);
    dao.setEntityManager(getEntityManager());
    return dao;
  }
}
