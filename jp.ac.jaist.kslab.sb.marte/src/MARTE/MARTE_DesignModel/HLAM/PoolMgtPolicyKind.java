/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pool Mgt Policy Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getPoolMgtPolicyKind()
 * @model
 * @generated
 */
public final class PoolMgtPolicyKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Infinite Wait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infinite Wait</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFINITE_WAIT_LITERAL
	 * @model name="infiniteWait"
	 * @generated
	 * @ordered
	 */
	public static final int INFINITE_WAIT = 0;

	/**
	 * The '<em><b>Timed Wait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Timed Wait</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIMED_WAIT_LITERAL
	 * @model name="timedWait"
	 * @generated
	 * @ordered
	 */
	public static final int TIMED_WAIT = 1;

	/**
	 * The '<em><b>Dynamic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dynamic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC_LITERAL
	 * @model name="dynamic"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMIC = 2;

	/**
	 * The '<em><b>Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exception</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION_LITERAL
	 * @model name="exception"
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTION = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_LITERAL
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER = 4;

	/**
	 * The '<em><b>Infinite Wait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFINITE_WAIT
	 * @generated
	 * @ordered
	 */
	public static final PoolMgtPolicyKind INFINITE_WAIT_LITERAL = new PoolMgtPolicyKind(INFINITE_WAIT, "infiniteWait", "infiniteWait");

	/**
	 * The '<em><b>Timed Wait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMED_WAIT
	 * @generated
	 * @ordered
	 */
	public static final PoolMgtPolicyKind TIMED_WAIT_LITERAL = new PoolMgtPolicyKind(TIMED_WAIT, "timedWait", "timedWait");

	/**
	 * The '<em><b>Dynamic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMIC
	 * @generated
	 * @ordered
	 */
	public static final PoolMgtPolicyKind DYNAMIC_LITERAL = new PoolMgtPolicyKind(DYNAMIC, "dynamic", "dynamic");

	/**
	 * The '<em><b>Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION
	 * @generated
	 * @ordered
	 */
	public static final PoolMgtPolicyKind EXCEPTION_LITERAL = new PoolMgtPolicyKind(EXCEPTION, "exception", "exception");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final PoolMgtPolicyKind OTHER_LITERAL = new PoolMgtPolicyKind(OTHER, "other", "other");

	/**
	 * An array of all the '<em><b>Pool Mgt Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PoolMgtPolicyKind[] VALUES_ARRAY =
		new PoolMgtPolicyKind[] {
			INFINITE_WAIT_LITERAL,
			TIMED_WAIT_LITERAL,
			DYNAMIC_LITERAL,
			EXCEPTION_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Pool Mgt Policy Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pool Mgt Policy Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PoolMgtPolicyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PoolMgtPolicyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pool Mgt Policy Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PoolMgtPolicyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PoolMgtPolicyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pool Mgt Policy Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PoolMgtPolicyKind get(int value) {
		switch (value) {
			case INFINITE_WAIT: return INFINITE_WAIT_LITERAL;
			case TIMED_WAIT: return TIMED_WAIT_LITERAL;
			case DYNAMIC: return DYNAMIC_LITERAL;
			case EXCEPTION: return EXCEPTION_LITERAL;
			case OTHER: return OTHER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PoolMgtPolicyKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PoolMgtPolicyKind
