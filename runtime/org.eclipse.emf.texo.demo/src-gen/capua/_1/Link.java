package capua._1;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>Link</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class Link extends AttributedObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private AttributedObject target = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private AttributedObject source = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Association> associations = new ArrayList<Association>();

	/**
	 * Returns the value of '<em><b>target</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>target</b></em>' feature
	 * @generated
	 */
	public AttributedObject getTarget() {
		return target;
	}

	/**
	 * Sets the '{@link Link#getTarget() <em>target</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Link#getTarget() target}' feature.
	 * @generated
	 */
	public void setTarget(AttributedObject newTarget) {
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
	public AttributedObject getSource() {
		return source;
	}

	/**
	 * Sets the '{@link Link#getSource() <em>source</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Link#getSource() source}' feature.
	 * @generated
	 */
	public void setSource(AttributedObject newSource) {
		source = newSource;
	}

	/**
	 * Returns the value of '<em><b>associations</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>associations</b></em>' feature
	 * @generated
	 */
	public List<Association> getAssociations() {
		return associations;
	}

	/**
	 * Adds to the <em>associations</em> feature.
	 * 
	 * @generated
	 */
	public void addToAssociations(Association associationsValue) {
		if (!associations.contains(associationsValue)) {

			associations.add(associationsValue);
		}

	}

	/**
	 * Removes from the <em>associations</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromAssociations(Association associationsValue) {
		if (associations.contains(associationsValue)) {
			associations.remove(associationsValue);
		}
	}

	/**
	 * Clears the <em>associations</em> feature.
	 * 
	 * @generated
	 */
	public void clearAssociations() {
		while (!associations.isEmpty()) {
			removeFromAssociations(associations.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Link#getAssociations() <em>associations</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Link#getAssociations() associations}'
	 *            feature.
	 * @generated
	 */
	public void setAssociations(List<Association> newAssociations) {
		associations = newAssociations;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Link ";
	}
}
