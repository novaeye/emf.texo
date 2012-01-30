package org.eclipse.emf.texo.test.model.samples.employee.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.employee.Department;
import org.eclipse.emf.texo.test.model.samples.employee.EmployeeModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Department</b></em>'.
 * 
 * @generated
 */
public class DepartmentDao extends BaseDao<Department> {

  /**
   * @generated
   */
  @Override
  public Class<Department> getEntityClass() {
    return Department.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return EmployeeModelPackage.INSTANCE.getDepartmentEClass();
  }
}
