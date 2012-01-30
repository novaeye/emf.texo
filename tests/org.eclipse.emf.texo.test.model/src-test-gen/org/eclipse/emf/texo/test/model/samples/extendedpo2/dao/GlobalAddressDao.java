package org.eclipse.emf.texo.test.model.samples.extendedpo2.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.GlobalAddress;

/**
 * The Dao implementation for the model object '<em><b>GlobalAddress</b></em>'.
 * 
 * @generated
 */
public class GlobalAddressDao extends BaseDao<GlobalAddress> {

  /**
   * @generated
   */
  @Override
  public Class<GlobalAddress> getEntityClass() {
    return GlobalAddress.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Epo2ModelPackage.INSTANCE.getGlobalAddressEClass();
  }
}
