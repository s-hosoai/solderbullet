/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.impl.HwResourceImpl;

import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwISA;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.ISA_Type;

import MARTE_Library.BasicNFP_Types.NFP_DataSize;
import MARTE_Library.BasicNFP_Types.NFP_String;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw ISA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwISAImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwISAImpl#getInst_Width <em>Inst Width</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.impl.HwISAImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwISAImpl extends HwResourceImpl implements HwISA {
	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected NFP_String family;

	/**
	 * The cached value of the '{@link #getInst_Width() <em>Inst Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInst_Width()
	 * @generated
	 * @ordered
	 */
	protected NFP_DataSize inst_Width;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ISA_Type TYPE_EDEFAULT = ISA_Type.RISC_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ISA_Type type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwISAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return HwComputingPackage.Literals.HW_ISA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamily(NFP_String newFamily, NotificationChain msgs) {
		NFP_String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_ISA__FAMILY, oldFamily, newFamily);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(NFP_String newFamily) {
		if (newFamily != family) {
			NotificationChain msgs = null;
			if (family != null)
				msgs = ((InternalEObject)family).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_ISA__FAMILY, null, msgs);
			if (newFamily != null)
				msgs = ((InternalEObject)newFamily).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_ISA__FAMILY, null, msgs);
			msgs = basicSetFamily(newFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_ISA__FAMILY, newFamily, newFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFP_DataSize getInst_Width() {
		return inst_Width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInst_Width(NFP_DataSize newInst_Width, NotificationChain msgs) {
		NFP_DataSize oldInst_Width = inst_Width;
		inst_Width = newInst_Width;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_ISA__INST_WIDTH, oldInst_Width, newInst_Width);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInst_Width(NFP_DataSize newInst_Width) {
		if (newInst_Width != inst_Width) {
			NotificationChain msgs = null;
			if (inst_Width != null)
				msgs = ((InternalEObject)inst_Width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_ISA__INST_WIDTH, null, msgs);
			if (newInst_Width != null)
				msgs = ((InternalEObject)newInst_Width).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HwComputingPackage.HW_ISA__INST_WIDTH, null, msgs);
			msgs = basicSetInst_Width(newInst_Width, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_ISA__INST_WIDTH, newInst_Width, newInst_Width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISA_Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ISA_Type newType) {
		ISA_Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HwComputingPackage.HW_ISA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HwComputingPackage.HW_ISA__FAMILY:
				return basicSetFamily(null, msgs);
			case HwComputingPackage.HW_ISA__INST_WIDTH:
				return basicSetInst_Width(null, msgs);
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
			case HwComputingPackage.HW_ISA__FAMILY:
				return getFamily();
			case HwComputingPackage.HW_ISA__INST_WIDTH:
				return getInst_Width();
			case HwComputingPackage.HW_ISA__TYPE:
				return getType();
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
			case HwComputingPackage.HW_ISA__FAMILY:
				setFamily((NFP_String)newValue);
				return;
			case HwComputingPackage.HW_ISA__INST_WIDTH:
				setInst_Width((NFP_DataSize)newValue);
				return;
			case HwComputingPackage.HW_ISA__TYPE:
				setType((ISA_Type)newValue);
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
			case HwComputingPackage.HW_ISA__FAMILY:
				setFamily((NFP_String)null);
				return;
			case HwComputingPackage.HW_ISA__INST_WIDTH:
				setInst_Width((NFP_DataSize)null);
				return;
			case HwComputingPackage.HW_ISA__TYPE:
				setType(TYPE_EDEFAULT);
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
			case HwComputingPackage.HW_ISA__FAMILY:
				return family != null;
			case HwComputingPackage.HW_ISA__INST_WIDTH:
				return inst_Width != null;
			case HwComputingPackage.HW_ISA__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //HwISAImpl
