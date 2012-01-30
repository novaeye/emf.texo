package org.eclipse.emf.texo.test.model.samples.extendedpo2.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Supplier;

/**
 * The Dao implementation for the model object '<em><b>Supplier</b></em>'.
 * 
 * @generated
 */
public class SupplierDao extends BaseDao<Supplier> {

  /**
   * @generated
   */
  @Override
  public Class<Supplier> getEntityClass() {
    return Supplier.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Epo2ModelPackage.INSTANCE.getSupplierEClass();
  }
}
