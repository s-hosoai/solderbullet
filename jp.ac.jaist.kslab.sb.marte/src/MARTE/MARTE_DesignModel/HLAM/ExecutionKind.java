/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Execution Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getExecutionKind()
 * @model
 * @generated
 */
public final class ExecutionKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Deferred</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deferred</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFERRED_LITERAL
	 * @model name="deferred"
	 * @generated
	 * @ordered
	 */
	public static final int DEFERRED = 0;

	/**
	 * The '<em><b>Remote Immediate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Remote Immediate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_IMMEDIATE_LITERAL
	 * @model name="remoteImmediate"
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_IMMEDIATE = 1;

	/**
	 * The '<em><b>Local Immediate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Immediate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_IMMEDIATE_LITERAL
	 * @model name="localImmediate"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_IMMEDIATE = 2;

	/**
	 * The '<em><b>Deferred</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFERRED
	 * @generated
	 * @ordered
	 */
	public static final ExecutionKind DEFERRED_LITERAL = new ExecutionKind(DEFERRED, "deferred", "deferred");

	/**
	 * The '<em><b>Remote Immediate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_IMMEDIATE
	 * @generated
	 * @ordered
	 */
	public static final ExecutionKind REMOTE_IMMEDIATE_LITERAL = new ExecutionKind(REMOTE_IMMEDIATE, "remoteImmediate", "remoteImmediate");

	/**
	 * The '<em><b>Local Immediate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_IMMEDIATE
	 * @generated
	 * @ordered
	 */
	public static final ExecutionKind LOCAL_IMMEDIATE_LITERAL = new ExecutionKind(LOCAL_IMMEDIATE, "localImmediate", "localImmediate");

	/**
	 * An array of all the '<em><b>Execution Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExecutionKind[] VALUES_ARRAY =
		new ExecutionKind[] {
			DEFERRED_LITERAL,
			REMOTE_IMMEDIATE_LITERAL,
			LOCAL_IMMEDIATE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Execution Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Execution Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExecutionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Execution Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExecutionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Execution Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExecutionKind get(int value) {
		switch (value) {
			case DEFERRED: return DEFERRED_LITERAL;
			case REMOTE_IMMEDIATE: return REMOTE_IMMEDIATE_LITERAL;
			case LOCAL_IMMEDIATE: return LOCAL_IMMEDIATE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExecutionKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ExecutionKind
