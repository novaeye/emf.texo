package org.eclipse.emf.texo.test.model.samples.capa.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.capa.CapaModelPackage;
import org.eclipse.emf.texo.test.model.samples.capa.Production;

/** 
 * The Dao implementation for the model object '<em><b>Production</b></em>'.
 * 
 * @generated 
 */
public class ProductionDao extends BaseDao<Production> {

  /**
   * @generated
   */
  @Override
  public Class<Production> getEntityClass() {
    return Production.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CapaModelPackage.INSTANCE.getProductionEClass();
  }
}
