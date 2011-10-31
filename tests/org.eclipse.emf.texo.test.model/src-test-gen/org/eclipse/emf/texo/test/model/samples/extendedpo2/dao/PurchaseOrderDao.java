package org.eclipse.emf.texo.test.model.samples.extendedpo2.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.PurchaseOrder;

/** 
 * The Dao implementation for the model object '<em><b>PurchaseOrder</b></em>'.
 * 
 * @generated 
 */
public class PurchaseOrderDao extends BaseDao<PurchaseOrder> {

  /**
   * @generated
   */
  @Override
  public Class<PurchaseOrder> getEntityClass() {
    return PurchaseOrder.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Epo2ModelPackage.INSTANCE.getPurchaseOrderEClass();
  }
}
