/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Call Concurrency Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getCallConcurrencyKind()
 * @model
 * @generated
 */
public final class CallConcurrencyKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Sequential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_LITERAL
	 * @model name="sequential"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENTIAL = 0;

	/**
	 * The '<em><b>Guarded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guarded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUARDED_LITERAL
	 * @model name="guarded"
	 * @generated
	 * @ordered
	 */
	public static final int GUARDED = 1;

	/**
	 * The '<em><b>Concurrent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concurrent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT_LITERAL
	 * @model name="concurrent"
	 * @generated
	 * @ordered
	 */
	public static final int CONCURRENT = 2;

	/**
	 * The '<em><b>Sequential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL
	 * @generated
	 * @ordered
	 */
	public static final CallConcurrencyKind SEQUENTIAL_LITERAL = new CallConcurrencyKind(SEQUENTIAL, "sequential", "sequential");

	/**
	 * The '<em><b>Guarded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUARDED
	 * @generated
	 * @ordered
	 */
	public static final CallConcurrencyKind GUARDED_LITERAL = new CallConcurrencyKind(GUARDED, "guarded", "guarded");

	/**
	 * The '<em><b>Concurrent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCURRENT
	 * @generated
	 * @ordered
	 */
	public static final CallConcurrencyKind CONCURRENT_LITERAL = new CallConcurrencyKind(CONCURRENT, "concurrent", "concurrent");

	/**
	 * An array of all the '<em><b>Call Concurrency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CallConcurrencyKind[] VALUES_ARRAY =
		new CallConcurrencyKind[] {
			SEQUENTIAL_LITERAL,
			GUARDED_LITERAL,
			CONCURRENT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Call Concurrency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CallConcurrencyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CallConcurrencyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CallConcurrencyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CallConcurrencyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Call Concurrency Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CallConcurrencyKind get(int value) {
		switch (value) {
			case SEQUENTIAL: return SEQUENTIAL_LITERAL;
			case GUARDED: return GUARDED_LITERAL;
			case CONCURRENT: return CONCURRENT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CallConcurrencyKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CallConcurrencyKind
