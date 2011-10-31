package org.eclipse.emf.texo.test.model.samples.extendedpo2.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.GlobalLocation;

/** 
 * The Dao implementation for the model object '<em><b>GlobalLocation</b></em>'.
 * 
 * @generated 
 */
public class GlobalLocationDao extends BaseDao<GlobalLocation> {

  /**
   * @generated
   */
  @Override
  public Class<GlobalLocation> getEntityClass() {
    return GlobalLocation.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Epo2ModelPackage.INSTANCE.getGlobalLocationEClass();
  }
}
