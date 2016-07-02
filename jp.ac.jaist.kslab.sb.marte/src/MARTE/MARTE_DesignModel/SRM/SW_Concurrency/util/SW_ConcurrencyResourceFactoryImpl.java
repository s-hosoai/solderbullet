/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.util.SW_ConcurrencyResourceImpl
 * @generated
 */
public class SW_ConcurrencyResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SW_ConcurrencyResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource(URI uri) {
		Resource result = new SW_ConcurrencyResourceImpl(uri);
		return result;
	}

} //SW_ConcurrencyResourceFactoryImpl
