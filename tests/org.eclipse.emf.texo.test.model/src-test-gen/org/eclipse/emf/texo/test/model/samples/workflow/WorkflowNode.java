package org.eclipse.emf.texo.test.model.samples.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>WorkflowNode</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "WorkflowNode")
public abstract class WorkflowNode extends WorkflowElement {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = Workflow.class)
  @JoinColumns({ @JoinColumn() })
  private Workflow workflow = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = OutputPort.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<OutputPort> outputs = new ArrayList<OutputPort>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = InputPort.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<InputPort> inputs = new ArrayList<InputPort>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private boolean isStart = false;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private boolean isFinish = false;

  /**
   * Returns the value of '<em><b>workflow</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>workflow</b></em>' feature
   * @generated
   */
  public Workflow getWorkflow() {
    return workflow;
  }

  /**
   * Sets the '{@link WorkflowNode#getWorkflow() <em>workflow</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link WorkflowNode#getWorkflow() workflow}' feature.
   * @generated
   */
  public void setWorkflow(Workflow newWorkflow) {
    workflow = newWorkflow;
  }

  /**
   * Returns the value of '<em><b>outputs</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>outputs</b></em>' feature
   * @generated
   */
  public List<OutputPort> getOutputs() {
    return outputs;
  }

  /**
   * Adds to the <em>outputs</em> feature.
   * @generated
   */
  public void addToOutputs(OutputPort outputsValue) {
    if (!outputs.contains(outputsValue)) {

      outputs.add(outputsValue);
    }

  }

  /**			
   * Removes from the <em>outputs</em> feature.
   * @generated
   */
  public void removeFromOutputs(OutputPort outputsValue) {
    if (outputs.contains(outputsValue)) {
      outputs.remove(outputsValue);
    }
  }

  /**			
   * Clears the <em>outputs</em> feature.
   * @generated
   */
  public void clearOutputs() {
    for (OutputPort outputsElement : outputs) {
      removeFromOutputs(outputsElement);
    }
  }

  /**
   * Sets the '{@link WorkflowNode#getOutputs() <em>outputs</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link WorkflowNode#getOutputs() outputs}' feature.
   * @generated
   */
  public void setOutputs(List<OutputPort> newOutputs) {
    outputs = newOutputs;
  }

  /**
   * Returns the value of '<em><b>inputs</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>inputs</b></em>' feature
   * @generated
   */
  public List<InputPort> getInputs() {
    return inputs;
  }

  /**
   * Adds to the <em>inputs</em> feature.
   * @generated
   */
  public void addToInputs(InputPort inputsValue) {
    if (!inputs.contains(inputsValue)) {

      inputs.add(inputsValue);
    }

  }

  /**			
   * Removes from the <em>inputs</em> feature.
   * @generated
   */
  public void removeFromInputs(InputPort inputsValue) {
    if (inputs.contains(inputsValue)) {
      inputs.remove(inputsValue);
    }
  }

  /**			
   * Clears the <em>inputs</em> feature.
   * @generated
   */
  public void clearInputs() {
    for (InputPort inputsElement : inputs) {
      removeFromInputs(inputsElement);
    }
  }

  /**
   * Sets the '{@link WorkflowNode#getInputs() <em>inputs</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link WorkflowNode#getInputs() inputs}' feature.
   * @generated
   */
  public void setInputs(List<InputPort> newInputs) {
    inputs = newInputs;
  }

  /**
   * Returns the value of '<em><b>isStart</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>isStart</b></em>' feature
   * @generated
   */
  public boolean isIsStart() {
    return isStart;
  }

  /**
   * Sets the '{@link WorkflowNode#isIsStart() <em>isStart</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link WorkflowNode#isIsStart() isStart}' feature.
   * @generated
   */
  public void setIsStart(boolean newIsStart) {
    isStart = newIsStart;
  }

  /**
   * Returns the value of '<em><b>isFinish</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>isFinish</b></em>' feature
   * @generated
   */
  public boolean isIsFinish() {
    return isFinish;
  }

  /**
   * Sets the '{@link WorkflowNode#isIsFinish() <em>isFinish</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link WorkflowNode#isIsFinish() isFinish}' feature.
   * @generated
   */
  public void setIsFinish(boolean newIsFinish) {
    isFinish = newIsFinish;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "WorkflowNode " + " [isStart: " + isIsStart() + "]" + " [isFinish: " + isIsFinish() + "]";
  }
}
