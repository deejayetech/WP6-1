/**
 */
package useCase;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link useCase.Interest#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see useCase.UseCasePackage#getInterest()
 * @model
 * @generated
 */
public interface Interest extends Element {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference list.
	 * The list contents are of type {@link useCase.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference list.
	 * @see useCase.UseCasePackage#getInterest_Actor()
	 * @model required="true"
	 * @generated
	 */
	EList<Actor> getActor();

} // Interest