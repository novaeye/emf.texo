package org.eclipse.emf.texo.server.model.request;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>QueryType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "request_QueryType")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter") })
public class QueryType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String query = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private String namedQuery = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Parameter> parameters = new ArrayList<Parameter>();

  /**
   * Returns the value of '<em><b>query</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>query</b></em>' feature
   * @generated
   */
  public String getQuery() {
    return query;
  }

  /**
   * Sets the '{@link QueryType#getQuery() <em>query</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link QueryType#getQuery() query}' feature.
   * @generated
   */
  public void setQuery(String newQuery) {
    query = newQuery;
  }

  /**
   * Returns the value of '<em><b>namedQuery</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>namedQuery</b></em>' feature
   * @generated
   */
  public String getNamedQuery() {
    return namedQuery;
  }

  /**
   * Sets the '{@link QueryType#getNamedQuery() <em>namedQuery</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link QueryType#getNamedQuery() namedQuery}' feature.
   * @generated
   */
  public void setNamedQuery(String newNamedQuery) {
    namedQuery = newNamedQuery;
  }

  /**
   * Returns the value of '<em><b>parameters</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>parameters</b></em>' feature
   * @generated
   */
  public List<Parameter> getParameters() {
    return parameters;
  }

  /**
   * Adds to the <em>parameters</em> feature.
   * 
   * @generated
   */
  public void addToParameters(Parameter parametersValue) {
    if (!parameters.contains(parametersValue)) {
      parameters.add(parametersValue);
    }
  }

  /**
   * Removes from the <em>parameters</em> feature.
   * 
   * @generated
   */
  public void removeFromParameters(Parameter parametersValue) {
    if (parameters.contains(parametersValue)) {
      parameters.remove(parametersValue);
    }
  }

  /**
   * Clears the <em>parameters</em> feature.
   * 
   * @generated
   */
  public void clearParameters() {
    while (!parameters.isEmpty()) {
      removeFromParameters(parameters.iterator().next());
    }
  }

  /**
   * Sets the '{@link QueryType#getParameters() <em>parameters</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link QueryType#getParameters() parameters}' feature.
   * @generated
   */
  public void setParameters(List<Parameter> newParameters) {
    parameters = newParameters;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "QueryType " + " [namedQuery: " + getNamedQuery() + "]" + " [query: " + getQuery() + "]";
  }
}
