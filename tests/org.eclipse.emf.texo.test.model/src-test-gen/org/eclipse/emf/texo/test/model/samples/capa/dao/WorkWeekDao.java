package org.eclipse.emf.texo.test.model.samples.capa.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.capa.CapaModelPackage;
import org.eclipse.emf.texo.test.model.samples.capa.WorkWeek;

/**
 * The Dao implementation for the model object '<em><b>WorkWeek</b></em>'.
 * 
 * @generated
 */
public class WorkWeekDao extends BaseDao<WorkWeek> {

  /**
   * @generated
   */
  @Override
  public Class<WorkWeek> getEntityClass() {
    return WorkWeek.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CapaModelPackage.INSTANCE.getWorkWeekEClass();
  }
}
