package org.eclipse.emf.texo.test.model.samples.workflow;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>Edge</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Edge")
public class Edge extends WorkflowElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = Workflow.class)
  @JoinColumns({ @JoinColumn() })
  private Workflow workflow = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = InputPort.class)
  @JoinColumns({ @JoinColumn() })
  private InputPort target = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = OutputPort.class)
  @JoinColumns({ @JoinColumn() })
  private OutputPort source = null;

  /**
   * Returns the value of '<em><b>workflow</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>workflow</b></em>' feature
   * @generated
   */
  public Workflow getWorkflow() {
    return workflow;
  }

  /**
   * Sets the '{@link Edge#getWorkflow() <em>workflow</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Edge#getWorkflow() workflow}' feature.
   * @generated
   */
  public void setWorkflow(Workflow newWorkflow) {
    workflow = newWorkflow;
  }

  /**
   * Returns the value of '<em><b>target</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>target</b></em>' feature
   * @generated
   */
  public InputPort getTarget() {
    return target;
  }

  /**
   * Sets the '{@link Edge#getTarget() <em>target</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Edge#getTarget() target}' feature.
   * @generated
   */
  public void setTarget(InputPort newTarget) {
    target = newTarget;
  }

  /**
   * Returns the value of '<em><b>source</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>source</b></em>' feature
   * @generated
   */
  public OutputPort getSource() {
    return source;
  }

  /**
   * Sets the '{@link Edge#getSource() <em>source</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Edge#getSource() source}' feature.
   * @generated
   */
  public void setSource(OutputPort newSource) {
    source = newSource;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Edge ";
  }
}
