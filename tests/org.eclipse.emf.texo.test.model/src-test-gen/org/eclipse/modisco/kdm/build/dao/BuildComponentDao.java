package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildComponent;
import org.eclipse.modisco.kdm.build.BuildModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BuildComponent</b></em>'.
 * 
 * @generated
 */
public class BuildComponentDao extends BaseDao<BuildComponent> {

  /**
   * @generated
   */
  @Override
  public Class<BuildComponent> getEntityClass() {
    return BuildComponent.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getBuildComponentEClass();
  }
}
