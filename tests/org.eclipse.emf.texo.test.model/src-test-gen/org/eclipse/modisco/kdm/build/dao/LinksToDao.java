package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.LinksTo;

/**
 * The Dao implementation for the model object '<em><b>LinksTo</b></em>'.
 * 
 * @generated
 */
public class LinksToDao extends BaseDao<LinksTo> {

  /**
   * @generated
   */
  @Override
  public Class<LinksTo> getEntityClass() {
    return LinksTo.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getLinksToEClass();
  }
}
