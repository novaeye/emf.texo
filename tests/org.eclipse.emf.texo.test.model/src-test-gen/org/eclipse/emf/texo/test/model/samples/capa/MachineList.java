package org.eclipse.emf.texo.test.model.samples.capa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>MachineList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "MachineList")
public class MachineList extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private List<Machine> machines = new ArrayList<Machine>();

  /**
   * Returns the value of '<em><b>machines</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>machines</b></em>' feature
   * @generated
   */
  public List<Machine> getMachines() {
    return machines;
  }

  /**
   * Adds to the <em>machines</em> feature.
   * 
   * @generated
   */
  public void addToMachines(Machine machinesValue) {
    if (!machines.contains(machinesValue)) {
      machines.add(machinesValue);
    }
  }

  /**
   * Removes from the <em>machines</em> feature.
   * 
   * @generated
   */
  public void removeFromMachines(Machine machinesValue) {
    if (machines.contains(machinesValue)) {
      machines.remove(machinesValue);
    }
  }

  /**
   * Clears the <em>machines</em> feature.
   * 
   * @generated
   */
  public void clearMachines() {
    while (!machines.isEmpty()) {
      removeFromMachines(machines.iterator().next());
    }
  }

  /**
   * Sets the '{@link MachineList#getMachines() <em>machines</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link MachineList#getMachines() machines}' feature.
   * @generated
   */
  public void setMachines(List<Machine> newMachines) {
    machines = newMachines;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "MachineList ";
  }
}
