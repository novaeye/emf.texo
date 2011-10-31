package org.eclipse.emf.texo.test.model.samples.extendedpo2.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.USAddress;

/** 
 * The Dao implementation for the model object '<em><b>USAddress</b></em>'.
 * 
 * @generated 
 */
public class USAddressDao extends BaseDao<USAddress> {

  /**
   * @generated
   */
  @Override
  public Class<USAddress> getEntityClass() {
    return USAddress.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Epo2ModelPackage.INSTANCE.getUSAddressEClass();
  }
}
