package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.BuildStep;

/** 
 * The Dao implementation for the model object '<em><b>BuildStep</b></em>'.
 * 
 * @generated 
 */
public class BuildStepDao extends BaseDao<BuildStep> {

  /**
   * @generated
   */
  @Override
  public Class<BuildStep> getEntityClass() {
    return BuildStep.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getBuildStepEClass();
  }
}
