package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.Library;

/**
 * The Dao implementation for the model object '<em><b>Library</b></em>'.
 * 
 * @generated
 */
public class LibraryDao extends BaseDao<Library> {

  /**
   * @generated
   */
  @Override
  public Class<Library> getEntityClass() {
    return Library.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getLibraryEClass();
  }
}
