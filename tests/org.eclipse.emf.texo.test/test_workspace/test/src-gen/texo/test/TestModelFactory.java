package texo.test;

/**
 * The <b>{@link org.eclipse.emf.texo.model.ModelFactory}</b> for the types of this model: test.
 * It contains code to create instances {@link org.eclipse.emf.texo.model.ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML) representation.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TestModelFactory implements
		org.eclipse.emf.texo.model.ModelFactory {

	/**
	 * Creates an instance for an {@link org.eclipse.emf.ecore.EClass}
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(org.eclipse.emf.ecore.EClass eClass) {
		switch (eClass.getClassifierID()) {
		case texo.test.TestModelPackage.PERSON_CLASSIFIER_ID:
			return createPerson();
		case texo.test.TestModelPackage.ADDRESS_CLASSIFIER_ID:
			return createAddress();
		case texo.test.TestModelPackage.CONTACT_CLASSIFIER_ID:
			return createContact();
		}
		throw new IllegalArgumentException("The EClass '" + eClass.getName()
				+ "' is not a valid EClass for this EPackage");
	}

	/**
	 * Wraps an object in a {@link ModelObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModelObject createModelObject(org.eclipse.emf.ecore.EClass eClass,
			Object adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case texo.test.TestModelPackage.PERSON_CLASSIFIER_ID:
			modelObject = new PersonModelObject();
			break;
		case texo.test.TestModelPackage.ADDRESS_CLASSIFIER_ID:
			modelObject = new AddressModelObject();
			break;
		case texo.test.TestModelPackage.CONTACT_CLASSIFIER_ID:
			modelObject = new ContactModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 * 
	 * @param eStructuralFeature
	 *          the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map
	 * entry is null then a new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eStructuralFeature
	 *          the feature map feature of the object
	 * @param adaptee
	 *          the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public org.eclipse.emf.texo.model.ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the model object representing the EClass Person
	 * @generated
	 */
	public texo.test.Person createPerson() {
		return new texo.test.Person();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the model object representing the EClass Address
	 * @generated
	 */
	public texo.test.Address createAddress() {
		return new texo.test.Address();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the model object representing the EClass Contact
	 * @generated
	 */
	public texo.test.Contact createContact() {
		return new texo.test.Contact();
	}

	/**
	 * Converts an instance of an {@link org.eclipse.emf.ecore.EDataType} to a String.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eDataType the {@link org.eclipse.emf.ecore.EDataType} defining the type
	 * @param value the object to convert, if the value is null then null is returned.
	 * @generated
	 */
	public Object createFromString(org.eclipse.emf.ecore.EDataType eDataType,
			String value) {
		switch (eDataType.getClassifierID()) {
		case texo.test.TestModelPackage.CONTACTTYPE_CLASSIFIER_ID:
			return createContactTypeFromString(value);
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage");
	}

	/**
	 * Converts an instance of an {@link org.eclipse.emf.ecore.EDataType} to a String.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eDataType the {@link org.eclipse.emf.ecore.EDataType} defining the type
	 * @param value the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(org.eclipse.emf.ecore.EDataType eDataType,
			Object value) {
		switch (eDataType.getClassifierID()) {
		case texo.test.TestModelPackage.CONTACTTYPE_CLASSIFIER_ID:
			return convertContactTypeToString((texo.test.ContactType) value);
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage.");
	}

	/**
	 * Converts the EDataType: ContactType to a String.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the object to convert
	 * @return the String representing the value, if value == null then null is returned
	 * @generated
	 */
	public String convertContactTypeToString(texo.test.ContactType value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: ContactType from a String.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is returned
	 * @generated
	 */
	public texo.test.ContactType createContactTypeFromString(String value) {
		if (value == null) {
			return null;
		}
		return texo.test.ContactType.get(value);
	}

	/** 
	 * The adapter/wrapper for the EClass '<em><b>Person</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	public static class PersonModelObject<E extends texo.test.Person> extends
			org.eclipse.emf.texo.model.AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public org.eclipse.emf.ecore.EClass eClass() {
			return texo.test.TestModelPackage.INSTANCE.getPersonEClass();
		}

		/**
		 * @generated
		 */
		public org.eclipse.emf.texo.model.ModelPackage getModelPackage() {
			return texo.test.TestModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case texo.test.TestModelPackage.PERSON_FIRSTNAME_FEATURE_ID:
				return getTarget().getFirstname();
			case texo.test.TestModelPackage.PERSON_LASTNAME_FEATURE_ID:
				return getTarget().getLastname();
			case texo.test.TestModelPackage.PERSON_ADDRESS_FEATURE_ID:
				return getTarget().getAddress();
			case texo.test.TestModelPackage.PERSON_CONTACTS_FEATURE_ID:
				return getTarget().getContacts();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case texo.test.TestModelPackage.PERSON_FIRSTNAME_FEATURE_ID:
				getTarget().setFirstname((java.lang.String) value);
				return;
			case texo.test.TestModelPackage.PERSON_LASTNAME_FEATURE_ID:
				getTarget().setLastname((java.lang.String) value);
				return;
			case texo.test.TestModelPackage.PERSON_ADDRESS_FEATURE_ID:
				getTarget().setAddress((texo.test.Address) value);
				return;
			case texo.test.TestModelPackage.PERSON_CONTACTS_FEATURE_ID:
				getTarget().setContacts(
						(java.util.List<texo.test.Contact>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case texo.test.TestModelPackage.PERSON_CONTACTS_FEATURE_ID:
				getTarget().addToContacts((texo.test.Contact) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case texo.test.TestModelPackage.PERSON_CONTACTS_FEATURE_ID:
				getTarget().removeFromContacts((texo.test.Contact) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/** 
	 * The adapter/wrapper for the EClass '<em><b>Address</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	public static class AddressModelObject<E extends texo.test.Address> extends
			org.eclipse.emf.texo.model.AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public org.eclipse.emf.ecore.EClass eClass() {
			return texo.test.TestModelPackage.INSTANCE.getAddressEClass();
		}

		/**
		 * @generated
		 */
		public org.eclipse.emf.texo.model.ModelPackage getModelPackage() {
			return texo.test.TestModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case texo.test.TestModelPackage.ADDRESS_STREET_FEATURE_ID:
				return getTarget().getStreet();
			case texo.test.TestModelPackage.ADDRESS_CITY_FEATURE_ID:
				return getTarget().getCity();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case texo.test.TestModelPackage.ADDRESS_STREET_FEATURE_ID:
				getTarget().setStreet((java.lang.String) value);
				return;
			case texo.test.TestModelPackage.ADDRESS_CITY_FEATURE_ID:
				getTarget().setCity((java.lang.String) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/** 
	 * The adapter/wrapper for the EClass '<em><b>Contact</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	public static class ContactModelObject<E extends texo.test.Contact> extends
			org.eclipse.emf.texo.model.AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public org.eclipse.emf.ecore.EClass eClass() {
			return texo.test.TestModelPackage.INSTANCE.getContactEClass();
		}

		/**
		 * @generated
		 */
		public org.eclipse.emf.texo.model.ModelPackage getModelPackage() {
			return texo.test.TestModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case texo.test.TestModelPackage.CONTACT_VALUE_FEATURE_ID:
				return getTarget().getValue();
			case texo.test.TestModelPackage.CONTACT_TYPE_FEATURE_ID:
				return getTarget().getType();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case texo.test.TestModelPackage.CONTACT_VALUE_FEATURE_ID:
				getTarget().setValue((java.lang.String) value);
				return;
			case texo.test.TestModelPackage.CONTACT_TYPE_FEATURE_ID:
				getTarget().setType((texo.test.ContactType) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(
				org.eclipse.emf.ecore.EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

}
