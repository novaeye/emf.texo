package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.AbstractBuildElement;
import org.eclipse.modisco.kdm.build.BuildModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractBuildElement</b></em>'.
 * 
 * @generated
 */
public class AbstractBuildElementDao extends BaseDao<AbstractBuildElement> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractBuildElement> getEntityClass() {
    return AbstractBuildElement.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getAbstractBuildElementEClass();
  }
}
