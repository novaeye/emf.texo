package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.Supplier;

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
    return BuildModelPackage.INSTANCE.getSupplierEClass();
  }
}
