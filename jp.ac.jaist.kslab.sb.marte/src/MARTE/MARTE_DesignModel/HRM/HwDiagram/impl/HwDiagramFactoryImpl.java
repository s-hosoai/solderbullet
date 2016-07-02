/**
 */
package MARTE.MARTE_DesignModel.HRM.HwDiagram.impl;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.*;

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
public class HwDiagramFactoryImpl extends EFactoryImpl implements HwDiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwDiagramFactory init() {
		try {
			HwDiagramFactory theHwDiagramFactory = (HwDiagramFactory)EPackage.Registry.INSTANCE.getEFactory(HwDiagramPackage.eNS_URI);
			if (theHwDiagramFactory != null) {
				return theHwDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwDiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwDiagramPackage.HW_BLOCK_DIAGRAM: return createHwBlockDiagram();
			case HwDiagramPackage.HW_CIRCUIT_DIAGRAM: return createHwCircuitDiagram();
			case HwDiagramPackage.HW_HRM_DIAGRAM: return createHwHRMDiagram();
			case HwDiagramPackage.SRM_DIAGRAM: return createSRMDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwBlockDiagram createHwBlockDiagram() {
		HwBlockDiagramImpl hwBlockDiagram = new HwBlockDiagramImpl();
		return hwBlockDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwCircuitDiagram createHwCircuitDiagram() {
		HwCircuitDiagramImpl hwCircuitDiagram = new HwCircuitDiagramImpl();
		return hwCircuitDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwHRMDiagram createHwHRMDiagram() {
		HwHRMDiagramImpl hwHRMDiagram = new HwHRMDiagramImpl();
		return hwHRMDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRMDiagram createSRMDiagram() {
		SRMDiagramImpl srmDiagram = new SRMDiagramImpl();
		return srmDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwDiagramPackage getHwDiagramPackage() {
		return (HwDiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwDiagramPackage getPackage() {
		return HwDiagramPackage.eINSTANCE;
	}

} //HwDiagramFactoryImpl
