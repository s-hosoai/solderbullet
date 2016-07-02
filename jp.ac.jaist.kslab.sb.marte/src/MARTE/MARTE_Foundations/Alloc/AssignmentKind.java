/**
 */
package MARTE.MARTE_Foundations.Alloc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assignment Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAssignmentKind()
 * @model
 * @generated
 */
public final class AssignmentKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Structural</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Structural</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCTURAL_LITERAL
	 * @model name="structural"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURAL = 0;

	/**
	 * The '<em><b>Behavioral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Behavioral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEHAVIORAL_LITERAL
	 * @model name="behavioral"
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIORAL = 1;

	/**
	 * The '<em><b>Hybrid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hybrid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYBRID_LITERAL
	 * @model name="hybrid"
	 * @generated
	 * @ordered
	 */
	public static final int HYBRID = 2;

	/**
	 * The '<em><b>Structural</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURAL
	 * @generated
	 * @ordered
	 */
	public static final AssignmentKind STRUCTURAL_LITERAL = new AssignmentKind(STRUCTURAL, "structural", "structural");

	/**
	 * The '<em><b>Behavioral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIORAL
	 * @generated
	 * @ordered
	 */
	public static final AssignmentKind BEHAVIORAL_LITERAL = new AssignmentKind(BEHAVIORAL, "behavioral", "behavioral");

	/**
	 * The '<em><b>Hybrid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYBRID
	 * @generated
	 * @ordered
	 */
	public static final AssignmentKind HYBRID_LITERAL = new AssignmentKind(HYBRID, "hybrid", "hybrid");

	/**
	 * An array of all the '<em><b>Assignment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssignmentKind[] VALUES_ARRAY =
		new AssignmentKind[] {
			STRUCTURAL_LITERAL,
			BEHAVIORAL_LITERAL,
			HYBRID_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Assignment Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assignment Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssignmentKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignmentKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assignment Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssignmentKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssignmentKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assignment Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssignmentKind get(int value) {
		switch (value) {
			case STRUCTURAL: return STRUCTURAL_LITERAL;
			case BEHAVIORAL: return BEHAVIORAL_LITERAL;
			case HYBRID: return HYBRID_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AssignmentKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AssignmentKind
