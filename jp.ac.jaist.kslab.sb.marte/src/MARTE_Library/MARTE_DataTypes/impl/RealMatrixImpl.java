/**
 */
package MARTE_Library.MARTE_DataTypes.impl;

import MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;
import MARTE_Library.MARTE_DataTypes.RealMatrix;
import MARTE_Library.MARTE_DataTypes.RealVector;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE_Library.MARTE_DataTypes.impl.RealMatrixImpl#getMatrixElem <em>Matrix Elem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RealMatrixImpl extends EObjectImpl implements RealMatrix {
	/**
	 * The cached value of the '{@link #getMatrixElem() <em>Matrix Elem</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrixElem()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> matrixElem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MARTE_DataTypesPackage.Literals.REAL_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getMatrixElem() {
		if (matrixElem == null) {
			matrixElem = new EDataTypeEList<Object>(Object.class, this, MARTE_DataTypesPackage.REAL_MATRIX__MATRIX_ELEM);
		}
		return matrixElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void at(int i, RealVector p) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MARTE_DataTypesPackage.REAL_MATRIX__MATRIX_ELEM:
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
			case MARTE_DataTypesPackage.REAL_MATRIX__MATRIX_ELEM:
				getMatrixElem().clear();
				getMatrixElem().addAll((Collection<? extends Object>)newValue);
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
			case MARTE_DataTypesPackage.REAL_MATRIX__MATRIX_ELEM:
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
			case MARTE_DataTypesPackage.REAL_MATRIX__MATRIX_ELEM:
				return matrixElem != null && !matrixElem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (matrixElem: ");
		result.append(matrixElem);
		result.append(')');
		return result.toString();
	}

} //RealMatrixImpl
