/**
 */
package MARTE.MARTE_AnalysisModel.PAM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_AnalysisModel.PAM.PAMPackage
 * @generated
 */
public interface PAMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PAMFactory eINSTANCE = MARTE.MARTE_AnalysisModel.PAM.impl.PAMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pa Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pa Step</em>'.
	 * @generated
	 */
	PaStep createPaStep();

	/**
	 * Returns a new object of class '<em>Pa Requested Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pa Requested Step</em>'.
	 * @generated
	 */
	PaRequestedStep createPaRequestedStep();

	/**
	 * Returns a new object of class '<em>Pa Comm Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pa Comm Step</em>'.
	 * @generated
	 */
	PaCommStep createPaCommStep();

	/**
	 * Returns a new object of class '<em>Pa Res Pass Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pa Res Pass Step</em>'.
	 * @generated
	 */
	PaResPassStep createPaResPassStep();

	/**
	 * Returns a new object of class '<em>Pa Logical Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pa Logical Resource</em>'.
	 * @generated
	 */
	PaLogicalResource createPaLogicalResource();

	/**
	 * Returns a new object of class '<em>Pa Run TInstance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pa Run TInstance</em>'.
	 * @generated
	 */
	PaRunTInstance createPaRunTInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PAMPackage getPAMPackage();

} //PAMFactory
