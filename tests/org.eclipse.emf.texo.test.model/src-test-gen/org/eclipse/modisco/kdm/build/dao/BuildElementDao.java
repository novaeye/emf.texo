package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildElement;
import org.eclipse.modisco.kdm.build.BuildModelPackage;

/** 
 * The Dao implementation for the model object '<em><b>BuildElement</b></em>'.
 * 
 * @generated 
 */
public class BuildElementDao extends BaseDao<BuildElement> {

  /**
   * @generated
   */
  @Override
  public Class<BuildElement> getEntityClass() {
    return BuildElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getBuildElementEClass();
  }
}
