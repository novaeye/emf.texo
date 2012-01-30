package org.eclipse.emf.texo.test.model.samples.capa.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.capa.CapaModelPackage;
import org.eclipse.emf.texo.test.model.samples.capa.MachineList;

/**
 * The Dao implementation for the model object '<em><b>MachineList</b></em>'.
 * 
 * @generated
 */
public class MachineListDao extends BaseDao<MachineList> {

  /**
   * @generated
   */
  @Override
  public Class<MachineList> getEntityClass() {
    return MachineList.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return CapaModelPackage.INSTANCE.getMachineListEClass();
  }
}
