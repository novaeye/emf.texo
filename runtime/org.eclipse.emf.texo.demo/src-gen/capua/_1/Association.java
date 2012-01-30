package capua._1;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>Association</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Association extends Link {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private Link link = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private AttributedObject associatedObject = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Link> inLinks = new ArrayList<Link>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Link> outLinks = new ArrayList<Link>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Association> participatedAssociations = new ArrayList<Association>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<AttributeInstance> attributeInstances = new ArrayList<AttributeInstance>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<ObjectCollection> collections = new ArrayList<ObjectCollection>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<AttributedObject> children = new ArrayList<AttributedObject>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private AttributedObject parent = null;

	/**
	 * Returns the value of '<em><b>link</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>link</b></em>' feature
	 * @generated
	 */
	public Link getLink() {
		return link;
	}

	/**
	 * Sets the '{@link Association#getLink() <em>link</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Association#getLink() link}' feature.
	 * @generated
	 */
	public void setLink(Link newLink) {
		link = newLink;
	}

	/**
	 * Returns the value of '<em><b>associatedObject</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>associatedObject</b></em>' feature
	 * @generated
	 */
	public AttributedObject getAssociatedObject() {
		return associatedObject;
	}

	/**
	 * Sets the '{@link Association#getAssociatedObject()
	 * <em>associatedObject</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Association#getAssociatedObject()
	 *            associatedObject}' feature.
	 * @generated
	 */
	public void setAssociatedObject(AttributedObject newAssociatedObject) {
		associatedObject = newAssociatedObject;
	}

	/**
	 * Returns the value of '<em><b>inLinks</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>inLinks</b></em>' feature
	 * @generated
	 */
	public List<Link> getInLinks() {
		return inLinks;
	}

	/**
	 * Adds to the <em>inLinks</em> feature.
	 * 
	 * @generated
	 */
	public void addToInLinks(Link inLinksValue) {
		if (!inLinks.contains(inLinksValue)) {

			inLinks.add(inLinksValue);
		}

	}

	/**
	 * Removes from the <em>inLinks</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromInLinks(Link inLinksValue) {
		if (inLinks.contains(inLinksValue)) {
			inLinks.remove(inLinksValue);
		}
	}

	/**
	 * Clears the <em>inLinks</em> feature.
	 * 
	 * @generated
	 */
	public void clearInLinks() {
		while (!inLinks.isEmpty()) {
			removeFromInLinks(inLinks.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Association#getInLinks() <em>inLinks</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Association#getInLinks() inLinks}'
	 *            feature.
	 * @generated
	 */
	public void setInLinks(List<Link> newInLinks) {
		inLinks = newInLinks;
	}

	/**
	 * Returns the value of '<em><b>outLinks</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>outLinks</b></em>' feature
	 * @generated
	 */
	public List<Link> getOutLinks() {
		return outLinks;
	}

	/**
	 * Adds to the <em>outLinks</em> feature.
	 * 
	 * @generated
	 */
	public void addToOutLinks(Link outLinksValue) {
		if (!outLinks.contains(outLinksValue)) {

			outLinks.add(outLinksValue);
		}

	}

	/**
	 * Removes from the <em>outLinks</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromOutLinks(Link outLinksValue) {
		if (outLinks.contains(outLinksValue)) {
			outLinks.remove(outLinksValue);
		}
	}

	/**
	 * Clears the <em>outLinks</em> feature.
	 * 
	 * @generated
	 */
	public void clearOutLinks() {
		while (!outLinks.isEmpty()) {
			removeFromOutLinks(outLinks.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Association#getOutLinks() <em>outLinks</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Association#getOutLinks() outLinks}'
	 *            feature.
	 * @generated
	 */
	public void setOutLinks(List<Link> newOutLinks) {
		outLinks = newOutLinks;
	}

	/**
	 * Returns the value of '<em><b>participatedAssociations</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>participatedAssociations</b></em>' feature
	 * @generated
	 */
	public List<Association> getParticipatedAssociations() {
		return participatedAssociations;
	}

	/**
	 * Adds to the <em>participatedAssociations</em> feature.
	 * 
	 * @generated
	 */
	public void addToParticipatedAssociations(
			Association participatedAssociationsValue) {
		if (!participatedAssociations.contains(participatedAssociationsValue)) {

			participatedAssociations.add(participatedAssociationsValue);
		}

	}

	/**
	 * Removes from the <em>participatedAssociations</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromParticipatedAssociations(
			Association participatedAssociationsValue) {
		if (participatedAssociations.contains(participatedAssociationsValue)) {
			participatedAssociations.remove(participatedAssociationsValue);
		}
	}

	/**
	 * Clears the <em>participatedAssociations</em> feature.
	 * 
	 * @generated
	 */
	public void clearParticipatedAssociations() {
		while (!participatedAssociations.isEmpty()) {
			removeFromParticipatedAssociations(participatedAssociations
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Association#getParticipatedAssociations()
	 * <em>participatedAssociations</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '
	 *            {@link Association#getParticipatedAssociations()
	 *            participatedAssociations}' feature.
	 * @generated
	 */
	public void setParticipatedAssociations(
			List<Association> newParticipatedAssociations) {
		participatedAssociations = newParticipatedAssociations;
	}

	/**
	 * Returns the value of '<em><b>attributeInstances</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>attributeInstances</b></em>' feature
	 * @generated
	 */
	public List<AttributeInstance> getAttributeInstances() {
		return attributeInstances;
	}

	/**
	 * Adds to the <em>attributeInstances</em> feature.
	 * 
	 * @generated
	 */
	public void addToAttributeInstances(
			AttributeInstance attributeInstancesValue) {
		if (!attributeInstances.contains(attributeInstancesValue)) {

			attributeInstances.add(attributeInstancesValue);
		}

	}

	/**
	 * Removes from the <em>attributeInstances</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromAttributeInstances(
			AttributeInstance attributeInstancesValue) {
		if (attributeInstances.contains(attributeInstancesValue)) {
			attributeInstances.remove(attributeInstancesValue);
		}
	}

	/**
	 * Clears the <em>attributeInstances</em> feature.
	 * 
	 * @generated
	 */
	public void clearAttributeInstances() {
		while (!attributeInstances.isEmpty()) {
			removeFromAttributeInstances(attributeInstances.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Association#getAttributeInstances()
	 * <em>attributeInstances</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Association#getAttributeInstances()
	 *            attributeInstances}' feature.
	 * @generated
	 */
	public void setAttributeInstances(
			List<AttributeInstance> newAttributeInstances) {
		attributeInstances = newAttributeInstances;
	}

	/**
	 * Returns the value of '<em><b>collections</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>collections</b></em>' feature
	 * @generated
	 */
	public List<ObjectCollection> getCollections() {
		return collections;
	}

	/**
	 * Adds to the <em>collections</em> feature.
	 * 
	 * @generated
	 */
	public void addToCollections(ObjectCollection collectionsValue) {
		if (!collections.contains(collectionsValue)) {

			collections.add(collectionsValue);
		}

	}

	/**
	 * Removes from the <em>collections</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromCollections(ObjectCollection collectionsValue) {
		if (collections.contains(collectionsValue)) {
			collections.remove(collectionsValue);
		}
	}

	/**
	 * Clears the <em>collections</em> feature.
	 * 
	 * @generated
	 */
	public void clearCollections() {
		while (!collections.isEmpty()) {
			removeFromCollections(collections.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Association#getCollections() <em>collections</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Association#getCollections()
	 *            collections}' feature.
	 * @generated
	 */
	public void setCollections(List<ObjectCollection> newCollections) {
		collections = newCollections;
	}

	/**
	 * Returns the value of '<em><b>children</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>children</b></em>' feature
	 * @generated
	 */
	public List<AttributedObject> getChildren() {
		return children;
	}

	/**
	 * Adds to the <em>children</em> feature.
	 * 
	 * @generated
	 */
	public void addToChildren(AttributedObject childrenValue) {
		if (!children.contains(childrenValue)) {

			children.add(childrenValue);
		}

	}

	/**
	 * Removes from the <em>children</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromChildren(AttributedObject childrenValue) {
		if (children.contains(childrenValue)) {
			children.remove(childrenValue);
		}
	}

	/**
	 * Clears the <em>children</em> feature.
	 * 
	 * @generated
	 */
	public void clearChildren() {
		while (!children.isEmpty()) {
			removeFromChildren(children.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Association#getChildren() <em>children</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Association#getChildren() children}'
	 *            feature.
	 * @generated
	 */
	public void setChildren(List<AttributedObject> newChildren) {
		children = newChildren;
	}

	/**
	 * Returns the value of '<em><b>parent</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>parent</b></em>' feature
	 * @generated
	 */
	public AttributedObject getParent() {
		return parent;
	}

	/**
	 * Sets the '{@link Association#getParent() <em>parent</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Association#getParent() parent}'
	 *            feature.
	 * @generated
	 */
	public void setParent(AttributedObject newParent) {
		parent = newParent;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Association ";
	}
}
