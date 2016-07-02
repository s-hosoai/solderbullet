/**
 */
package MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.impl;

import MARTE.MARTE_DesignModel.HRM.HwSpecification.HwPeripheral.*;

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
public class HwPeripheralFactoryImpl extends EFactoryImpl implements HwPeripheralFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HwPeripheralFactory init() {
		try {
			HwPeripheralFactory theHwPeripheralFactory = (HwPeripheralFactory)EPackage.Registry.INSTANCE.getEFactory(HwPeripheralPackage.eNS_URI);
			if (theHwPeripheralFactory != null) {
				return theHwPeripheralFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HwPeripheralFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPeripheralFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HwPeripheralPackage.OPERATION_IMPL: return createOperationImpl();
			case HwPeripheralPackage.WRITE_REGISTER_ACTION: return createWriteRegisterAction();
			case HwPeripheralPackage.READ_REGISTER_ACTION: return createReadRegisterAction();
			case HwPeripheralPackage.PERIPHERAL_ACTIVITY: return createPeripheralActivity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationImpl createOperationImpl() {
		OperationImplImpl operationImpl = new OperationImplImpl();
		return operationImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteRegisterAction createWriteRegisterAction() {
		WriteRegisterActionImpl writeRegisterAction = new WriteRegisterActionImpl();
		return writeRegisterAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadRegisterAction createReadRegisterAction() {
		ReadRegisterActionImpl readRegisterAction = new ReadRegisterActionImpl();
		return readRegisterAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeripheralActivity createPeripheralActivity() {
		PeripheralActivityImpl peripheralActivity = new PeripheralActivityImpl();
		return peripheralActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwPeripheralPackage getHwPeripheralPackage() {
		return (HwPeripheralPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static HwPeripheralPackage getPackage() {
		return HwPeripheralPackage.eINSTANCE;
	}

} //HwPeripheralFactoryImpl
