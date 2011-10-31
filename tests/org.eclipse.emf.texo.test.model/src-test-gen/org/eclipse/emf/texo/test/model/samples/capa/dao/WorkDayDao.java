package org.eclipse.emf.texo.test.model.samples.capa.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.capa.CapaModelPackage;
import org.eclipse.emf.texo.test.model.samples.capa.WorkDay;

/** 
 * The Dao implementation for the model object '<em><b>WorkDay</b></em>'.
 * 
 * @generated 
 */
public class WorkDayDao extends BaseDao<WorkDay> {

  /**
   * @generated
   */
  @Override
  public Class<WorkDay> getEntityClass() {
    return WorkDay.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CapaModelPackage.INSTANCE.getWorkDayEClass();
  }
}
