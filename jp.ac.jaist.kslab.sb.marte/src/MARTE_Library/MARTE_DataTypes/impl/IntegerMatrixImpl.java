/**
 */
package MARTE_Library.MARTE_DataTypes.impl;

import MARTE_Library.MARTE_DataTypes.IntegerMatrix;
import MARTE_Library.MARTE_DataTypes.IntegerVector;
import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.impl.IntegerMatrixImpl#getMatrixElem <em>Matrix Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerMatrixImpl extends EObjectImpl implements IntegerMatrix {
	/**
	 * The cached value of the '{@link #getMatrixElem() <em>Matrix Elem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixElem()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerVector> matrixElem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTE_DataTypesPackage.Literals.INTEGER_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerVector> getMatrixElem() {
		if (matrixElem == null) {
			matrixElem = new EObjectContainmentEList<IntegerVector>(IntegerVector.class, this, MARTE_DataTypesPackage.INTEGER_MATRIX__MATRIX_ELEM);
		}
		return matrixElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVector at(int i) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MARTE_DataTypesPackage.INTEGER_MATRIX__MATRIX_ELEM:
				return ((InternalEList<?>)getMatrixElem()).basicRemove(otherEnd, msgs);
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
			case MARTE_DataTypesPackage.INTEGER_MATRIX__MATRIX_ELEM:
				return getMatrixElem();
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
			case MARTE_DataTypesPackage.INTEGER_MATRIX__MATRIX_ELEM:
				getMatrixElem().clear();
				getMatrixElem().addAll((Collection<? extends IntegerVector>)newValue);
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
			case MARTE_DataTypesPackage.INTEGER_MATRIX__MATRIX_ELEM:
				getMatrixElem().clear();
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
			case MARTE_DataTypesPackage.INTEGER_MATRIX__MATRIX_ELEM:
				return matrixElem != null && !matrixElem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntegerMatrixImpl
