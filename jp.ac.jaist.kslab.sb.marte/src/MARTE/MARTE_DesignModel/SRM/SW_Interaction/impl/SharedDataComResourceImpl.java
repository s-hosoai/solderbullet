/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl;

import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage;
import MARTE.MARTE_DesignModel.SRM.SW_Interaction.SharedDataComResource;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.BehavioralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Data Com Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SharedDataComResourceImpl#getReadServices <em>Read Services</em>}</li>
 *   <li>{@link MARTE.MARTE_DesignModel.SRM.SW_Interaction.impl.SharedDataComResourceImpl#getWriteServices <em>Write Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedDataComResourceImpl extends SwCommunicationResourceImpl implements SharedDataComResource {
	/**
	 * The cached value of the '{@link #getReadServices() <em>Read Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadServices()
	 * @generated
	 * @ordered
	 */
	protected EList readServices;

	/**
	 * The cached value of the '{@link #getWriteServices() <em>Write Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteServices()
	 * @generated
	 * @ordered
	 */
	protected EList writeServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedDataComResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SW_InteractionPackage.Literals.SHARED_DATA_COM_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReadServices() {
		if (readServices == null) {
			readServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES);
		}
		return readServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getWriteServices() {
		if (writeServices == null) {
			writeServices = new EObjectResolvingEList(BehavioralFeature.class, this, SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES);
		}
		return writeServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES:
				return getReadServices();
			case SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES:
				return getWriteServices();
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
			case SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES:
				getReadServices().clear();
				getReadServices().addAll((Collection)newValue);
				return;
			case SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES:
				getWriteServices().clear();
				getWriteServices().addAll((Collection)newValue);
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
			case SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES:
				getReadServices().clear();
				return;
			case SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES:
				getWriteServices().clear();
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
			case SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__READ_SERVICES:
				return readServices != null && !readServices.isEmpty();
			case SW_InteractionPackage.SHARED_DATA_COM_RESOURCE__WRITE_SERVICES:
				return writeServices != null && !writeServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SharedDataComResourceImpl
