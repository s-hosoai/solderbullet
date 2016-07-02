/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwDatasheet.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HwDatasheetFactoryImpl extends EFactoryImpl implements HwDatasheetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwDatasheetFactory init() {
		try {
			HwDatasheetFactory theHwDatasheetFactory = (HwDatasheetFactory)EPackage.Registry.INSTANCE.getEFactory(HwDatasheetPackage.eNS_URI);
			if (theHwDatasheetFactory != null) {
				return theHwDatasheetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwDatasheetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDatasheetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwDatasheetPackage.HW_DATASHEET: return createHwDatasheet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDatasheet createHwDatasheet() {
		HwDatasheetImpl hwDatasheet = new HwDatasheetImpl();
		return hwDatasheet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDatasheetPackage getHwDatasheetPackage() {
		return (HwDatasheetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwDatasheetPackage getPackage() {
		return HwDatasheetPackage.eINSTANCE;
	}

} //HwDatasheetFactoryImpl
