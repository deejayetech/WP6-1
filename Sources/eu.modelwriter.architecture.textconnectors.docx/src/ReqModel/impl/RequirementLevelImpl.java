/**
 */
package ReqModel.impl;

import ReqModel.Definition;
import ReqModel.ReqModelPackage;
import ReqModel.RequirementLevel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ReqModel.impl.RequirementLevelImpl#getOwnedDefinition <em>Owned Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementLevelImpl extends DefinitionImpl implements RequirementLevel {
	/**
	 * The cached value of the '{@link #getOwnedDefinition() <em>Owned Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Definition> ownedDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqModelPackage.Literals.REQU�REMENT_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Definition> getOwnedDefinition() {
		if (ownedDefinition == null) {
			ownedDefinition = new EObjectContainmentEList<Definition>(Definition.class, this, ReqModelPackage.REQU�REMENT_LEVEL__OWNED_DEF�N�T�ON);
		}
		return ownedDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqModelPackage.REQU�REMENT_LEVEL__OWNED_DEF�N�T�ON:
				return ((InternalEList<?>)getOwnedDefinition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqModelPackage.REQU�REMENT_LEVEL__OWNED_DEF�N�T�ON:
				return getOwnedDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReqModelPackage.REQU�REMENT_LEVEL__OWNED_DEF�N�T�ON:
				getOwnedDefinition().clear();
				getOwnedDefinition().addAll((Collection<? extends Definition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReqModelPackage.REQU�REMENT_LEVEL__OWNED_DEF�N�T�ON:
				getOwnedDefinition().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReqModelPackage.REQU�REMENT_LEVEL__OWNED_DEF�N�T�ON:
				return ownedDefinition != null && !ownedDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementLevelImpl