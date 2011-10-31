package org.eclipse.emf.texo.test.model.samples.capa.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.capa.CapaModelPackage;
import org.eclipse.emf.texo.test.model.samples.capa.CapacityEntry;

/** 
 * The Dao implementation for the model object '<em><b>CapacityEntry</b></em>'.
 * 
 * @generated 
 */
public class CapacityEntryDao extends BaseDao<CapacityEntry> {

  /**
   * @generated
   */
  @Override
  public Class<CapacityEntry> getEntityClass() {
    return CapacityEntry.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CapaModelPackage.INSTANCE.getCapacityEntryEClass();
  }
}
