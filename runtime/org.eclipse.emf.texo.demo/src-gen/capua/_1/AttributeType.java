package capua._1;

/**
 * A representation of the model object '<em><b>AttributeType</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class AttributeType extends NamedObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private ObjectCollection owner = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String definition = null;

	/**
	 * Returns the value of '<em><b>owner</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>owner</b></em>' feature
	 * @generated
	 */
	public ObjectCollection getOwner() {
		return owner;
	}

	/**
	 * Sets the '{@link AttributeType#getOwner() <em>owner</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link AttributeType#getOwner() owner}'
	 *            feature.
	 * @generated
	 */
	public void setOwner(ObjectCollection newOwner) {
		owner = newOwner;
	}

	/**
	 * Returns the value of '<em><b>definition</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>definition</b></em>' feature
	 * @generated
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * Sets the '{@link AttributeType#getDefinition() <em>definition</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link AttributeType#getDefinition()
	 *            definition}' feature.
	 * @generated
	 */
	public void setDefinition(String newDefinition) {
		definition = newDefinition;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "AttributeType " + " [definition: " + getDefinition() + "]";
	}
}
