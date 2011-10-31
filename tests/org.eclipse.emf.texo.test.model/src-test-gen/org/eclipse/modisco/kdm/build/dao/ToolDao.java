package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.Tool;

/** 
 * The Dao implementation for the model object '<em><b>Tool</b></em>'.
 * 
 * @generated 
 */
public class ToolDao extends BaseDao<Tool> {

  /**
   * @generated
   */
  @Override
  public Class<Tool> getEntityClass() {
    return Tool.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getToolEClass();
  }
}
