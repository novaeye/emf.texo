package capua._1;

/**
 * A representation of the model object '<em><b>Attribute</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Attribute extends NamedObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private AttributeType type = null;

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
	private Element defaultValue = null;

	/**
	 * Returns the value of '<em><b>type</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>type</b></em>' feature
	 * @generated
	 */
	public AttributeType getType() {
		return type;
	}

	/**
	 * Sets the '{@link Attribute#getType() <em>type</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Attribute#getType() type}' feature.
	 * @generated
	 */
	public void setType(AttributeType newType) {
		type = newType;
	}

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
	 * Sets the '{@link Attribute#getOwner() <em>owner</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Attribute#getOwner() owner}' feature.
	 * @generated
	 */
	public void setOwner(ObjectCollection newOwner) {
		owner = newOwner;
	}

	/**
	 * Returns the value of '<em><b>defaultValue</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>defaultValue</b></em>' feature
	 * @generated
	 */
	public Element getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Sets the '{@link Attribute#getDefaultValue() <em>defaultValue</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Attribute#getDefaultValue()
	 *            defaultValue}' feature.
	 * @generated
	 */
	public void setDefaultValue(Element newDefaultValue) {
		defaultValue = newDefaultValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Attribute ";
	}
}
