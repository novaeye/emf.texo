package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.SymbolicLink;

/** 
 * The Dao implementation for the model object '<em><b>SymbolicLink</b></em>'.
 * 
 * @generated 
 */
public class SymbolicLinkDao extends BaseDao<SymbolicLink> {

  /**
   * @generated
   */
  @Override
  public Class<SymbolicLink> getEntityClass() {
    return SymbolicLink.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getSymbolicLinkEClass();
  }
}
