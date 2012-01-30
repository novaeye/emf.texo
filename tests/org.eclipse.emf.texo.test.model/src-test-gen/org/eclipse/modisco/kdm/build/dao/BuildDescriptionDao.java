package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildDescription;
import org.eclipse.modisco.kdm.build.BuildModelPackage;

/**
 * The Dao implementation for the model object '<em><b>BuildDescription</b></em>'.
 * 
 * @generated
 */
public class BuildDescriptionDao extends BaseDao<BuildDescription> {

  /**
   * @generated
   */
  @Override
  public Class<BuildDescription> getEntityClass() {
    return BuildDescription.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getBuildDescriptionEClass();
  }
}
