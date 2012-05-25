package org.eclipse.modisco.kdm.kdm;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.modisco.kdm.core.KDMEntity;

/**
 * A representation of the model object '<em><b>KDMModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> A KDM model corresponds to one of the well-known architecture views of software systems. KDM
 * defines several concrete subclasses of the KDMModel class. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "kdm_KDMModel")
public abstract class KDMModel extends KDMFramework {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Instances of KDM entities owned by the
   * model. Each KDM model defines specific subclasses of KDMEntity class. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @OrderColumn()
  @JoinTable()
  @Access(AccessType.FIELD)
  private List<KDMEntity> ownedElement = new ArrayList<KDMEntity>();

  /**
   * Returns the value of '<em><b>ownedElement</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToOwnedElement(org.eclipse.modisco.kdm.core.KDMEntity value)} and
   * {@link #removeFromOwnedElement(KDMEntity value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Instances of KDM entities owned by the
   * model. Each KDM model defines specific subclasses of KDMEntity class. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>ownedElement</b></em>' feature
   * @generated
   */
  public List<KDMEntity> getOwnedElement() {
    return ownedElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "KDMModel ";
  }
}
