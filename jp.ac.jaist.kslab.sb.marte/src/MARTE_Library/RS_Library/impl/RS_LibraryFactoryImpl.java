/**
 */
package MARTE_Library.RS_Library.impl;

import MARTE_Library.RS_Library.*;

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
public class RS_LibraryFactoryImpl extends EFactoryImpl implements RS_LibraryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RS_LibraryFactory init() {
		try {
			RS_LibraryFactory theRS_LibraryFactory = (RS_LibraryFactory)EPackage.Registry.INSTANCE.getEFactory(RS_LibraryPackage.eNS_URI);
			if (theRS_LibraryFactory != null) {
				return theRS_LibraryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RS_LibraryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RS_LibraryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RS_LibraryPackage.TILER_SPECIFICATION: return createTilerSpecification();
			case RS_LibraryPackage.SHAPE_SPECIFICATION: return createShapeSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilerSpecification createTilerSpecification() {
		TilerSpecificationImpl tilerSpecification = new TilerSpecificationImpl();
		return tilerSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeSpecification createShapeSpecification() {
		ShapeSpecificationImpl shapeSpecification = new ShapeSpecificationImpl();
		return shapeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RS_LibraryPackage getRS_LibraryPackage() {
		return (RS_LibraryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RS_LibraryPackage getPackage() {
		return RS_LibraryPackage.eINSTANCE;
	}

} //RS_LibraryFactoryImpl
