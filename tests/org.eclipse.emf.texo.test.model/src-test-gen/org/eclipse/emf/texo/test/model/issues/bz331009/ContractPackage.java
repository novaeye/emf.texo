package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>ContractPackage</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> Пакет контрактов <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "ContractPackage")
public class ContractPackage extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = Person.class)
  @JoinColumns({ @JoinColumn() })
  private Person client = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = User.class)
  @JoinColumns({ @JoinColumn() })
  private User user = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Контракты <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Contract.class)
  @OrderColumn()
  @JoinTable(name = "ContractPackage_contracts")
  @Access(AccessType.FIELD)
  private List<Contract> contracts = new ArrayList<Contract>();

  /**
   * Returns the value of '<em><b>client</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>client</b></em>' feature
   * @generated
   */
  public Person getClient() {
    return client;
  }

  /**
   * Sets the '{@link ContractPackage#getClient() <em>client</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ContractPackage#getClient() client}' feature.
   * @generated
   */
  public void setClient(Person newClient) {
    client = newClient;
  }

  /**
   * Returns the value of '<em><b>user</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>user</b></em>' feature
   * @generated
   */
  public User getUser() {
    return user;
  }

  /**
   * Sets the '{@link ContractPackage#getUser() <em>user</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ContractPackage#getUser() user}' feature.
   * @generated
   */
  public void setUser(User newUser) {
    user = newUser;
  }

  /**
   * Returns the value of '<em><b>contracts</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Контракты <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>contracts</b></em>' feature
   * @generated
   */
  public List<Contract> getContracts() {
    return contracts;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ContractPackage ";
  }
}
