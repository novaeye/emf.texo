package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.BuildResource;

/**
 * The Dao implementation for the model object '<em><b>BuildResource</b></em>'.
 * 
 * @generated
 */
public class BuildResourceDao extends BaseDao<BuildResource> {

  /**
   * @generated
   */
  @Override
  public Class<BuildResource> getEntityClass() {
    return BuildResource.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getBuildResourceEClass();
  }
}
