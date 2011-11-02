package org.eclipse.emf.texo.test.model.samples.library;

import org.eclipse.emf.texo.test.model.base.identifiable;
import org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne;
import org.eclipse.emf.texo.test.models.annotations.TestAnnotationTwo;

/** 
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
@TestAnnotationOne("test")
public class Book extends identifiable {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	@TestAnnotationOne("field")
	@TestAnnotationTwo("field")
	private String title = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	@TestAnnotationOne("test")
	private int pages = 100;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	@TestAnnotationOne("test")
	private BookCategory category = BookCategory.SCIENCEFICTION;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	@TestAnnotationOne("test")
	private Writer author = null;

	/**
	 * Returns the value of '<em><b>title</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>title</b></em>' feature
	 * @generated
	 */
	@TestAnnotationOne("test")
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the '{@link Book#getTitle() <em>title</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Book#getTitle() title}' feature.
	 * @generated
	 */
	@TestAnnotationOne("test")
	public void setTitle(String newTitle) {
		title = newTitle;
	}

	/**
	 * Returns the value of '<em><b>pages</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pages</b></em>' feature
	 * @generated
	 */
	@TestAnnotationOne("getter")
	public int getPages() {
		return pages;
	}

	/**
	 * Sets the '{@link Book#getPages() <em>pages</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Book#getPages() pages}' feature.
	 * @generated
	 */
	@TestAnnotationOne("test")
	public void setPages(int newPages) {
		pages = newPages;
	}

	/**
	 * Returns the value of '<em><b>category</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>category</b></em>' feature
	 * @generated
	 */
	@TestAnnotationOne("test")
	public BookCategory getCategory() {
		return category;
	}

	/**
	 * Sets the '{@link Book#getCategory() <em>category</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Book#getCategory() category}' feature.
	 * @generated
	 */
	@TestAnnotationOne("test")
	public void setCategory(BookCategory newCategory) {
		category = newCategory;
	}

	/**
	 * Returns the value of '<em><b>author</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>author</b></em>' feature
	 * @generated
	 */
	@TestAnnotationOne("test")
	public Writer getAuthor() {
		return author;
	}

	/**
	 * Sets the '{@link Book#getAuthor() <em>author</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Book#getAuthor() author}' feature.
	 * @generated
	 */
	@TestAnnotationOne("setter")
	public void setAuthor(Writer newAuthor) {
		author = newAuthor;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Book " + " [title: " + getTitle() + "]" + " [pages: "
				+ getPages() + "]" + " [category: " + getCategory() + "]";
	}
}
