/**
 */
package useCase;


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
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see useCase.UseCasePackage#getInterest_Actor()
	 * @model required="true"
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link useCase.Interest#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

} // Interest