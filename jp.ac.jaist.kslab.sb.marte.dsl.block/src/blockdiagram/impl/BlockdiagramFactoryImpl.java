/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package blockdiagram.impl;

import blockdiagram.*;

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
public class BlockdiagramFactoryImpl extends EFactoryImpl implements BlockdiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlockdiagramFactory init() {
		try {
			BlockdiagramFactory theBlockdiagramFactory = (BlockdiagramFactory)EPackage.Registry.INSTANCE.getEFactory("http://blockdiagram/1.0"); 
			if (theBlockdiagramFactory != null) {
				return theBlockdiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BlockdiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockdiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BlockdiagramPackage.DIAGRAM: return createDiagram();
			case BlockdiagramPackage.HW_COMPONENT: return createHwComponent();
			case BlockdiagramPackage.CONNECTION: return createConnection();
			case BlockdiagramPackage.MCU: return createMCU();
			case BlockdiagramPackage.DEVICE: return createDevice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwComponent createHwComponent() {
		HwComponentImpl hwComponent = new HwComponentImpl();
		return hwComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCU createMCU() {
		MCUImpl mcu = new MCUImpl();
		return mcu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockdiagramPackage getBlockdiagramPackage() {
		return (BlockdiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static BlockdiagramPackage getPackage() {
		return BlockdiagramPackage.eINSTANCE;
	}

} //BlockdiagramFactoryImpl
