package org.eclipse.emf.texo.test.model.samples.extendedpo2.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Item;

/**
 * The Dao implementation for the model object '<em><b>Item</b></em>'.
 * 
 * @generated
 */
public class ItemDao extends BaseDao<Item> {

  /**
   * @generated
   */
  @Override
  public Class<Item> getEntityClass() {
    return Item.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return Epo2ModelPackage.INSTANCE.getItemEClass();
  }
}
