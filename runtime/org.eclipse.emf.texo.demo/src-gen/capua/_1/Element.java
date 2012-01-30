package capua._1;

/**
 * A representation of the model object '<em><b>Element</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class Element extends AttributedObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private ElementCollection ownerCollection = null;

	/**
	 * Returns the value of '<em><b>ownerCollection</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>ownerCollection</b></em>' feature
	 * @generated
	 */
	public ElementCollection getOwnerCollection() {
		return ownerCollection;
	}

	/**
	 * Sets the '{@link Element#getOwnerCollection() <em>ownerCollection</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Element#getOwnerCollection()
	 *            ownerCollection}' feature.
	 * @generated
	 */
	public void setOwnerCollection(ElementCollection newOwnerCollection) {
		ownerCollection = newOwnerCollection;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Element ";
	}
}
