package capua._1;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>ObjectCollection</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class ObjectCollection extends AttributedObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<AttributedObject> objects = new ArrayList<AttributedObject>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Boolean root = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Attribute> attributes = new ArrayList<Attribute>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<AttributeType> types = new ArrayList<AttributeType>();

	/**
	 * Returns the value of '<em><b>objects</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>objects</b></em>' feature
	 * @generated
	 */
	public List<AttributedObject> getObjects() {
		return objects;
	}

	/**
	 * Adds to the <em>objects</em> feature.
	 * 
	 * @generated
	 */
	public void addToObjects(AttributedObject objectsValue) {
		if (!objects.contains(objectsValue)) {

			objects.add(objectsValue);
		}

	}

	/**
	 * Removes from the <em>objects</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromObjects(AttributedObject objectsValue) {
		if (objects.contains(objectsValue)) {
			objects.remove(objectsValue);
		}
	}

	/**
	 * Clears the <em>objects</em> feature.
	 * 
	 * @generated
	 */
	public void clearObjects() {
		while (!objects.isEmpty()) {
			removeFromObjects(objects.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ObjectCollection#getObjects() <em>objects</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ObjectCollection#getObjects()
	 *            objects}' feature.
	 * @generated
	 */
	public void setObjects(List<AttributedObject> newObjects) {
		objects = newObjects;
	}

	/**
	 * Returns the value of '<em><b>root</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>root</b></em>' feature
	 * @generated
	 */
	public Boolean getRoot() {
		return root;
	}

	/**
	 * Sets the '{@link ObjectCollection#getRoot() <em>root</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ObjectCollection#getRoot() root}'
	 *            feature.
	 * @generated
	 */
	public void setRoot(Boolean newRoot) {
		root = newRoot;
	}

	/**
	 * Returns the value of '<em><b>attributes</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>attributes</b></em>' feature
	 * @generated
	 */
	public List<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * Adds to the <em>attributes</em> feature.
	 * 
	 * @generated
	 */
	public void addToAttributes(Attribute attributesValue) {
		if (!attributes.contains(attributesValue)) {

			attributes.add(attributesValue);
		}

	}

	/**
	 * Removes from the <em>attributes</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromAttributes(Attribute attributesValue) {
		if (attributes.contains(attributesValue)) {
			attributes.remove(attributesValue);
		}
	}

	/**
	 * Clears the <em>attributes</em> feature.
	 * 
	 * @generated
	 */
	public void clearAttributes() {
		while (!attributes.isEmpty()) {
			removeFromAttributes(attributes.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ObjectCollection#getAttributes() <em>attributes</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ObjectCollection#getAttributes()
	 *            attributes}' feature.
	 * @generated
	 */
	public void setAttributes(List<Attribute> newAttributes) {
		attributes = newAttributes;
	}

	/**
	 * Returns the value of '<em><b>types</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>types</b></em>' feature
	 * @generated
	 */
	public List<AttributeType> getTypes() {
		return types;
	}

	/**
	 * Adds to the <em>types</em> feature.
	 * 
	 * @generated
	 */
	public void addToTypes(AttributeType typesValue) {
		if (!types.contains(typesValue)) {

			types.add(typesValue);
		}

	}

	/**
	 * Removes from the <em>types</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromTypes(AttributeType typesValue) {
		if (types.contains(typesValue)) {
			types.remove(typesValue);
		}
	}

	/**
	 * Clears the <em>types</em> feature.
	 * 
	 * @generated
	 */
	public void clearTypes() {
		while (!types.isEmpty()) {
			removeFromTypes(types.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ObjectCollection#getTypes() <em>types</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ObjectCollection#getTypes() types}'
	 *            feature.
	 * @generated
	 */
	public void setTypes(List<AttributeType> newTypes) {
		types = newTypes;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ObjectCollection " + " [root: " + getRoot() + "]";
	}
}
