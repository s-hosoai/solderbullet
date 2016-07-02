/**
 */
package MARTE.MARTE_DesignModel.GCM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Pool Ordering Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getDataPoolOrderingKind()
 * @model
 * @generated
 */
public final class DataPoolOrderingKind extends AbstractEnumerator {
	/**
	 * The '<em><b>FIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIFO_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIFO = 0;

	/**
	 * The '<em><b>LIFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIFO_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIFO = 1;

	/**
	 * The '<em><b>User Defined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>User Defined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_DEFINED_LITERAL
	 * @model name="UserDefined"
	 * @generated
	 * @ordered
	 */
	public static final int USER_DEFINED = 2;

	/**
	 * The '<em><b>FIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFO
	 * @generated
	 * @ordered
	 */
	public static final DataPoolOrderingKind FIFO_LITERAL = new DataPoolOrderingKind(FIFO, "FIFO", "FIFO");

	/**
	 * The '<em><b>LIFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFO
	 * @generated
	 * @ordered
	 */
	public static final DataPoolOrderingKind LIFO_LITERAL = new DataPoolOrderingKind(LIFO, "LIFO", "LIFO");

	/**
	 * The '<em><b>User Defined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_DEFINED
	 * @generated
	 * @ordered
	 */
	public static final DataPoolOrderingKind USER_DEFINED_LITERAL = new DataPoolOrderingKind(USER_DEFINED, "UserDefined", "UserDefined");

	/**
	 * An array of all the '<em><b>Data Pool Ordering Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataPoolOrderingKind[] VALUES_ARRAY =
		new DataPoolOrderingKind[] {
			FIFO_LITERAL,
			LIFO_LITERAL,
			USER_DEFINED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Pool Ordering Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Pool Ordering Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPoolOrderingKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataPoolOrderingKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Pool Ordering Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPoolOrderingKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataPoolOrderingKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Pool Ordering Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPoolOrderingKind get(int value) {
		switch (value) {
			case FIFO: return FIFO_LITERAL;
			case LIFO: return LIFO_LITERAL;
			case USER_DEFINED: return USER_DEFINED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataPoolOrderingKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //DataPoolOrderingKind
