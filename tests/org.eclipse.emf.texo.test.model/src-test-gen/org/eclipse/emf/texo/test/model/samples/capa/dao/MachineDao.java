package org.eclipse.emf.texo.test.model.samples.capa.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.capa.CapaModelPackage;
import org.eclipse.emf.texo.test.model.samples.capa.Machine;

/** 
 * The Dao implementation for the model object '<em><b>Machine</b></em>'.
 * 
 * @generated 
 */
public class MachineDao extends BaseDao<Machine> {

  /**
   * @generated
   */
  @Override
  public Class<Machine> getEntityClass() {
    return Machine.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CapaModelPackage.INSTANCE.getMachineEClass();
  }
}
