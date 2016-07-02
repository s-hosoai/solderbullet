/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Concurrency Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getConcurrencyKind()
 * @model
 * @generated
 */
public final class ConcurrencyKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Reader</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reader</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READER_LITERAL
	 * @model name="reader"
	 * @generated
	 * @ordered
	 */
	public static final int READER = 0;

	/**
	 * The '<em><b>Writer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Writer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITER_LITERAL
	 * @model name="writer"
	 * @generated
	 * @ordered
	 */
	public static final int WRITER = 1;

	/**
	 * The '<em><b>Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_LITERAL
	 * @model name="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL = 2;

	/**
	 * The '<em><b>Reader</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READER
	 * @generated
	 * @ordered
	 */
	public static final ConcurrencyKind READER_LITERAL = new ConcurrencyKind(READER, "reader", "reader");

	/**
	 * The '<em><b>Writer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITER
	 * @generated
	 * @ordered
	 */
	public static final ConcurrencyKind WRITER_LITERAL = new ConcurrencyKind(WRITER, "writer", "writer");

	/**
	 * The '<em><b>Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @generated
	 * @ordered
	 */
	public static final ConcurrencyKind PARALLEL_LITERAL = new ConcurrencyKind(PARALLEL, "parallel", "parallel");

	/**
	 * An array of all the '<em><b>Concurrency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConcurrencyKind[] VALUES_ARRAY =
		new ConcurrencyKind[] {
			READER_LITERAL,
			WRITER_LITERAL,
			PARALLEL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Concurrency Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Concurrency Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConcurrencyKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConcurrencyKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concurrency Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConcurrencyKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConcurrencyKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Concurrency Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConcurrencyKind get(int value) {
		switch (value) {
			case READER: return READER_LITERAL;
			case WRITER: return WRITER_LITERAL;
			case PARALLEL: return PARALLEL_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConcurrencyKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ConcurrencyKind
