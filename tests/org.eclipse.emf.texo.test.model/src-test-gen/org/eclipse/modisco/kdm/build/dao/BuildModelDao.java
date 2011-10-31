package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModel;
import org.eclipse.modisco.kdm.build.BuildModelPackage;

/** 
 * The Dao implementation for the model object '<em><b>BuildModel</b></em>'.
 * 
 * @generated 
 */
public class BuildModelDao extends BaseDao<BuildModel> {

  /**
   * @generated
   */
  @Override
  public Class<BuildModel> getEntityClass() {
    return BuildModel.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getBuildModelEClass();
  }
}
