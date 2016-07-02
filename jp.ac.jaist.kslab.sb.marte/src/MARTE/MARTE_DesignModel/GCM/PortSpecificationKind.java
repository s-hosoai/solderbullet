/**
 */
package MARTE.MARTE_DesignModel.GCM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Port Specification Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getPortSpecificationKind()
 * @model
 * @generated
 */
public final class PortSpecificationKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Atomic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Atomic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATOMIC_LITERAL
	 * @model name="atomic"
	 * @generated
	 * @ordered
	 */
	public static final int ATOMIC = 0;

	/**
	 * The '<em><b>Interface Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interface Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_BASED_LITERAL
	 * @model name="interfaceBased"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_BASED = 1;

	/**
	 * The '<em><b>Feature Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Feature Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEATURE_BASED_LITERAL
	 * @model name="featureBased"
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_BASED = 2;

	/**
	 * The '<em><b>Atomic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATOMIC
	 * @generated
	 * @ordered
	 */
	public static final PortSpecificationKind ATOMIC_LITERAL = new PortSpecificationKind(ATOMIC, "atomic", "atomic");

	/**
	 * The '<em><b>Interface Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_BASED
	 * @generated
	 * @ordered
	 */
	public static final PortSpecificationKind INTERFACE_BASED_LITERAL = new PortSpecificationKind(INTERFACE_BASED, "interfaceBased", "interfaceBased");

	/**
	 * The '<em><b>Feature Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_BASED
	 * @generated
	 * @ordered
	 */
	public static final PortSpecificationKind FEATURE_BASED_LITERAL = new PortSpecificationKind(FEATURE_BASED, "featureBased", "featureBased");

	/**
	 * An array of all the '<em><b>Port Specification Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PortSpecificationKind[] VALUES_ARRAY =
		new PortSpecificationKind[] {
			ATOMIC_LITERAL,
			INTERFACE_BASED_LITERAL,
			FEATURE_BASED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Port Specification Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Port Specification Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortSpecificationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortSpecificationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Specification Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortSpecificationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortSpecificationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Port Specification Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortSpecificationKind get(int value) {
		switch (value) {
			case ATOMIC: return ATOMIC_LITERAL;
			case INTERFACE_BASED: return INTERFACE_BASED_LITERAL;
			case FEATURE_BASED: return FEATURE_BASED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PortSpecificationKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PortSpecificationKind
