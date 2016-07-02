/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PLD Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getPLD_Class()
 * @model
 * @generated
 */
public final class PLD_Class extends AbstractEnumerator {
	/**
	 * The '<em><b>Symetrical Array</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Symetrical Array</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYMETRICAL_ARRAY_LITERAL
	 * @model name="symetricalArray"
	 * @generated
	 * @ordered
	 */
	public static final int SYMETRICAL_ARRAY = 0;

	/**
	 * The '<em><b>Row Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Row Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROW_BASED_LITERAL
	 * @model name="rowBased"
	 * @generated
	 * @ordered
	 */
	public static final int ROW_BASED = 1;

	/**
	 * The '<em><b>Sea Of Gates</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sea Of Gates</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEA_OF_GATES_LITERAL
	 * @model name="seaOfGates"
	 * @generated
	 * @ordered
	 */
	public static final int SEA_OF_GATES = 2;

	/**
	 * The '<em><b>Hierarchical PLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hierarchical PLD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIERARCHICAL_PLD_LITERAL
	 * @model name="hierarchicalPLD"
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHICAL_PLD = 3;

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
	 * The '<em><b>Undef</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undef</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEF_LITERAL
	 * @model name="undef"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEF = 5;

	/**
	 * The '<em><b>Symetrical Array</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYMETRICAL_ARRAY
	 * @generated
	 * @ordered
	 */
	public static final PLD_Class SYMETRICAL_ARRAY_LITERAL = new PLD_Class(SYMETRICAL_ARRAY, "symetricalArray", "symetricalArray");

	/**
	 * The '<em><b>Row Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROW_BASED
	 * @generated
	 * @ordered
	 */
	public static final PLD_Class ROW_BASED_LITERAL = new PLD_Class(ROW_BASED, "rowBased", "rowBased");

	/**
	 * The '<em><b>Sea Of Gates</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEA_OF_GATES
	 * @generated
	 * @ordered
	 */
	public static final PLD_Class SEA_OF_GATES_LITERAL = new PLD_Class(SEA_OF_GATES, "seaOfGates", "seaOfGates");

	/**
	 * The '<em><b>Hierarchical PLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHICAL_PLD
	 * @generated
	 * @ordered
	 */
	public static final PLD_Class HIERARCHICAL_PLD_LITERAL = new PLD_Class(HIERARCHICAL_PLD, "hierarchicalPLD", "hierarchicalPLD");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final PLD_Class OTHER_LITERAL = new PLD_Class(OTHER, "other", "other");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final PLD_Class UNDEF_LITERAL = new PLD_Class(UNDEF, "undef", "undef");

	/**
	 * An array of all the '<em><b>PLD Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PLD_Class[] VALUES_ARRAY =
		new PLD_Class[] {
			SYMETRICAL_ARRAY_LITERAL,
			ROW_BASED_LITERAL,
			SEA_OF_GATES_LITERAL,
			HIERARCHICAL_PLD_LITERAL,
			OTHER_LITERAL,
			UNDEF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>PLD Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PLD Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PLD_Class get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PLD_Class result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PLD Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PLD_Class getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PLD_Class result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PLD Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PLD_Class get(int value) {
		switch (value) {
			case SYMETRICAL_ARRAY: return SYMETRICAL_ARRAY_LITERAL;
			case ROW_BASED: return ROW_BASED_LITERAL;
			case SEA_OF_GATES: return SEA_OF_GATES_LITERAL;
			case HIERARCHICAL_PLD: return HIERARCHICAL_PLD_LITERAL;
			case OTHER: return OTHER_LITERAL;
			case UNDEF: return UNDEF_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PLD_Class(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PLD_Class
