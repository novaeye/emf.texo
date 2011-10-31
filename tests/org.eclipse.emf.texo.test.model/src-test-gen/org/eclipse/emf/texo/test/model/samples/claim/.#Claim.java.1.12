package org.eclipse.emf.texo.test.model.samples.claim;

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
 * A representation of the model object '<em><b>Claim</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Claim Information <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "Claim")
public class Claim {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false, targetEntity = ClaimCompositeKey.class)
  @JoinColumns({ @JoinColumn() })
  private ClaimCompositeKey claimCompositeKey = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Billing Name <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String billingName = "";

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Claim Group VSP Id <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String claimGroupVSPId = "";

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String claimStatus = "";

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = ClaimLine.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<ClaimLine> claimLine = new ArrayList<ClaimLine>();

  /**
   * Returns the value of '<em><b>claimCompositeKey</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>claimCompositeKey</b></em>' feature
   * @generated
   */
  public ClaimCompositeKey getClaimCompositeKey() {
    return claimCompositeKey;
  }

  /**
   * Sets the '{@link Claim#getClaimCompositeKey() <em>claimCompositeKey</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Claim#getClaimCompositeKey() claimCompositeKey}' feature.
   * @generated
   */
  public void setClaimCompositeKey(ClaimCompositeKey newClaimCompositeKey) {
    claimCompositeKey = newClaimCompositeKey;
  }

  /**
   * Returns the value of '<em><b>billingName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Billing Name <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>billingName</b></em>' feature
   * @generated
   */
  public String getBillingName() {
    return billingName;
  }

  /**
   * Sets the '{@link Claim#getBillingName() <em>billingName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Billing Name <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link Claim#getBillingName() billingName}' feature.
   * @generated
   */
  public void setBillingName(String newBillingName) {
    billingName = newBillingName;
  }

  /**
   * Returns the value of '<em><b>claimGroupVSPId</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Claim Group VSP Id <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>claimGroupVSPId</b></em>' feature
   * @generated
   */
  public String getClaimGroupVSPId() {
    return claimGroupVSPId;
  }

  /**
   * Sets the '{@link Claim#getClaimGroupVSPId() <em>claimGroupVSPId</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Claim Group VSP Id <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link Claim#getClaimGroupVSPId() claimGroupVSPId}' feature.
   * @generated
   */
  public void setClaimGroupVSPId(String newClaimGroupVSPId) {
    claimGroupVSPId = newClaimGroupVSPId;
  }

  /**
   * Returns the value of '<em><b>claimStatus</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>claimStatus</b></em>' feature
   * @generated
   */
  public String getClaimStatus() {
    return claimStatus;
  }

  /**
   * Sets the '{@link Claim#getClaimStatus() <em>claimStatus</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
   * 
   * <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link Claim#getClaimStatus() claimStatus}' feature.
   * @generated
   */
  public void setClaimStatus(String newClaimStatus) {
    claimStatus = newClaimStatus;
  }

  /**
   * Returns the value of '<em><b>claimLine</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>claimLine</b></em>' feature
   * @generated
   */
  public List<ClaimLine> getClaimLine() {
    return claimLine;
  }

  /**
   * Adds to the <em>claimLine</em> feature.
   * @generated
   */
  public void addToClaimLine(ClaimLine claimLineValue) {
    if (!claimLine.contains(claimLineValue)) {

      claimLine.add(claimLineValue);
    }

  }

  /**			
   * Removes from the <em>claimLine</em> feature.
   * @generated
   */
  public void removeFromClaimLine(ClaimLine claimLineValue) {
    if (claimLine.contains(claimLineValue)) {
      claimLine.remove(claimLineValue);
    }
  }

  /**			
   * Clears the <em>claimLine</em> feature.
   * @generated
   */
  public void clearClaimLine() {
    for (ClaimLine claimLineElement : claimLine) {
      removeFromClaimLine(claimLineElement);
    }
  }

  /**
   * Sets the '{@link Claim#getClaimLine() <em>claimLine</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Claim#getClaimLine() claimLine}' feature.
   * @generated
   */
  public void setClaimLine(List<ClaimLine> newClaimLine) {
    claimLine = newClaimLine;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Claim " + " [billingName: " + getBillingName() + "]" + " [claimGroupVSPId: " + getClaimGroupVSPId() + "]"
        + " [claimStatus: " + getClaimStatus() + "]";
  }
}
