package capua._1;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>ElementCollection</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public abstract class ElementCollection extends ObjectCollection {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<Element> elements = new ArrayList<Element>();

	/**
	 * Returns the value of '<em><b>elements</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>elements</b></em>' feature
	 * @generated
	 */
	public List<Element> getElements() {
		return elements;
	}

	/**
	 * Adds to the <em>elements</em> feature.
	 * 
	 * @generated
	 */
	public void addToElements(Element elementsValue) {
		if (!elements.contains(elementsValue)) {

			elements.add(elementsValue);
		}

	}

	/**
	 * Removes from the <em>elements</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromElements(Element elementsValue) {
		if (elements.contains(elementsValue)) {
			elements.remove(elementsValue);
		}
	}

	/**
	 * Clears the <em>elements</em> feature.
	 * 
	 * @generated
	 */
	public void clearElements() {
		while (!elements.isEmpty()) {
			removeFromElements(elements.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ElementCollection#getElements() <em>elements</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ElementCollection#getElements()
	 *            elements}' feature.
	 * @generated
	 */
	public void setElements(List<Element> newElements) {
		elements = newElements;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ElementCollection ";
	}
}
