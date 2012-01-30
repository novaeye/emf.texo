package capua._1;

import java.util.ArrayList;
import java.util.List;

/**
 * A representation of the model object '<em><b>ModelInfo</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModelInfo extends NamedObject {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String version = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private List<String> notes = new ArrayList<String>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private String description = null;

	/**
	 * Returns the value of '<em><b>version</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>version</b></em>' feature
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the '{@link ModelInfo#getVersion() <em>version</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ModelInfo#getVersion() version}'
	 *            feature.
	 * @generated
	 */
	public void setVersion(String newVersion) {
		version = newVersion;
	}

	/**
	 * Returns the value of '<em><b>notes</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>notes</b></em>' feature
	 * @generated
	 */
	public List<String> getNotes() {
		return notes;
	}

	/**
	 * Sets the '{@link ModelInfo#getNotes() <em>notes</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ModelInfo#getNotes() notes}' feature.
	 * @generated
	 */
	public void setNotes(List<String> newNotes) {
		notes = newNotes;
	}

	/**
	 * Returns the value of '<em><b>description</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>description</b></em>' feature
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the '{@link ModelInfo#getDescription() <em>description</em>}'
	 * feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link ModelInfo#getDescription()
	 *            description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ModelInfo " + " [version: " + getVersion() + "]"
				+ " [description: " + getDescription() + "]";
	}
}
