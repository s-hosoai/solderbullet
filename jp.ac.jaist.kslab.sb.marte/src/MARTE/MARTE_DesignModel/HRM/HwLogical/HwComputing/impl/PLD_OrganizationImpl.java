/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Class;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.PLD_Organization;

import MARTE_Library.BasicNFP_Types.NFP_Integer;
import MARTE_Library.BasicNFP_Types.NFP_Natural;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PLD Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.PLD_OrganizationImpl#getNbRows <em>Nb Rows</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.PLD_OrganizationImpl#getNbColumns <em>Nb Columns</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.PLD_OrganizationImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PLD_OrganizationImpl extends EObjectImpl implements PLD_Organization {
	/**
	 * The cached value of the '{@link #getNbRows() <em>Nb Rows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRows()
	 * @generated
	 * @ordered
	 */
	protected NFP_Integer nbRows;

	/**
	 * The cached value of the '{@link #getNbColumns() <em>Nb Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbColumns()
	 * @generated
	 * @ordered
	 */
	protected NFP_Natural nbColumns;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final PLD_Class CLASS_EDEFAULT = PLD_Class.SYMETRICAL_ARRAY_LITERAL;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected PLD_Class class_ = CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLD_OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwComputingPackage.Literals.PLD_ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Integer getNbRows() {
		return nbRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbRows(NFP_Integer newNbRows, NotificationChain msgs) {
		NFP_Integer oldNbRows = nbRows;
		nbRows = newNbRows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.PLD_ORGANIZATION__NB_ROWS, oldNbRows, newNbRows);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbRows(NFP_Integer newNbRows) {
		if (newNbRows != nbRows) {
			NotificationChain msgs = null;
			if (nbRows != null)
				msgs = ((InternalEObject)nbRows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.PLD_ORGANIZATION__NB_ROWS, null, msgs);
			if (newNbRows != null)
				msgs = ((InternalEObject)newNbRows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.PLD_ORGANIZATION__NB_ROWS, null, msgs);
			msgs = basicSetNbRows(newNbRows, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.PLD_ORGANIZATION__NB_ROWS, newNbRows, newNbRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_Natural getNbColumns() {
		return nbColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNbColumns(NFP_Natural newNbColumns, NotificationChain msgs) {
		NFP_Natural oldNbColumns = nbColumns;
		nbColumns = newNbColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.PLD_ORGANIZATION__NB_COLUMNS, oldNbColumns, newNbColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbColumns(NFP_Natural newNbColumns) {
		if (newNbColumns != nbColumns) {
			NotificationChain msgs = null;
			if (nbColumns != null)
				msgs = ((InternalEObject)nbColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.PLD_ORGANIZATION__NB_COLUMNS, null, msgs);
			if (newNbColumns != null)
				msgs = ((InternalEObject)newNbColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.PLD_ORGANIZATION__NB_COLUMNS, null, msgs);
			msgs = basicSetNbColumns(newNbColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.PLD_ORGANIZATION__NB_COLUMNS, newNbColumns, newNbColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLD_Class getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(PLD_Class newClass) {
		PLD_Class oldClass = class_;
		class_ = newClass == null ? CLASS_EDEFAULT : newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.PLD_ORGANIZATION__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwComputingPackage.PLD_ORGANIZATION__NB_ROWS:
				return basicSetNbRows(null, msgs);
			case HwComputingPackage.PLD_ORGANIZATION__NB_COLUMNS:
				return basicSetNbColumns(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HwComputingPackage.PLD_ORGANIZATION__NB_ROWS:
				return getNbRows();
			case HwComputingPackage.PLD_ORGANIZATION__NB_COLUMNS:
				return getNbColumns();
			case HwComputingPackage.PLD_ORGANIZATION__CLASS:
				return getClass_();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HwComputingPackage.PLD_ORGANIZATION__NB_ROWS:
				setNbRows((NFP_Integer)newValue);
				return;
			case HwComputingPackage.PLD_ORGANIZATION__NB_COLUMNS:
				setNbColumns((NFP_Natural)newValue);
				return;
			case HwComputingPackage.PLD_ORGANIZATION__CLASS:
				setClass((PLD_Class)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case HwComputingPackage.PLD_ORGANIZATION__NB_ROWS:
				setNbRows((NFP_Integer)null);
				return;
			case HwComputingPackage.PLD_ORGANIZATION__NB_COLUMNS:
				setNbColumns((NFP_Natural)null);
				return;
			case HwComputingPackage.PLD_ORGANIZATION__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HwComputingPackage.PLD_ORGANIZATION__NB_ROWS:
				return nbRows != null;
			case HwComputingPackage.PLD_ORGANIZATION__NB_COLUMNS:
				return nbColumns != null;
			case HwComputingPackage.PLD_ORGANIZATION__CLASS:
				return class_ != CLASS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (class: ");
		result.append(class_);
		result.append(')');
		return result.toString();
	}

} //PLD_OrganizationImpl
