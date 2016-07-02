/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ISA Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getISA_Type()
 * @model
 * @generated
 */
public final class ISA_Type extends AbstractEnumerator {
	/**
	 * The '<em><b>RISC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RISC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RISC_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RISC = 0;

	/**
	 * The '<em><b>CISC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CISC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CISC_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CISC = 1;

	/**
	 * The '<em><b>VLIW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VLIW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VLIW_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VLIW = 2;

	/**
	 * The '<em><b>SIMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMD_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMD = 3;

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
	 * The '<em><b>RISC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISC
	 * @generated
	 * @ordered
	 */
	public static final ISA_Type RISC_LITERAL = new ISA_Type(RISC, "RISC", "RISC");

	/**
	 * The '<em><b>CISC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CISC
	 * @generated
	 * @ordered
	 */
	public static final ISA_Type CISC_LITERAL = new ISA_Type(CISC, "CISC", "CISC");

	/**
	 * The '<em><b>VLIW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VLIW
	 * @generated
	 * @ordered
	 */
	public static final ISA_Type VLIW_LITERAL = new ISA_Type(VLIW, "VLIW", "VLIW");

	/**
	 * The '<em><b>SIMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMD
	 * @generated
	 * @ordered
	 */
	public static final ISA_Type SIMD_LITERAL = new ISA_Type(SIMD, "SIMD", "SIMD");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final ISA_Type OTHER_LITERAL = new ISA_Type(OTHER, "other", "other");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final ISA_Type UNDEF_LITERAL = new ISA_Type(UNDEF, "undef", "undef");

	/**
	 * An array of all the '<em><b>ISA Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ISA_Type[] VALUES_ARRAY =
		new ISA_Type[] {
			RISC_LITERAL,
			CISC_LITERAL,
			VLIW_LITERAL,
			SIMD_LITERAL,
			OTHER_LITERAL,
			UNDEF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ISA Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ISA Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ISA_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ISA_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ISA Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ISA_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ISA_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ISA Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ISA_Type get(int value) {
		switch (value) {
			case RISC: return RISC_LITERAL;
			case CISC: return CISC_LITERAL;
			case VLIW: return VLIW_LITERAL;
			case SIMD: return SIMD_LITERAL;
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
	private ISA_Type(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ISA_Type
