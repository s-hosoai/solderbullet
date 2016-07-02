/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cache Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getCacheType()
 * @model
 * @generated
 */
public final class CacheType extends AbstractEnumerator {
	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_LITERAL
	 * @model name="data"
	 * @generated
	 * @ordered
	 */
	public static final int DATA = 0;

	/**
	 * The '<em><b>Instruction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instruction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTION_LITERAL
	 * @model name="instruction"
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUCTION = 1;

	/**
	 * The '<em><b>Unified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIFIED_LITERAL
	 * @model name="unified"
	 * @generated
	 * @ordered
	 */
	public static final int UNIFIED = 2;

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
	public static final int OTHER = 3;

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
	public static final int UNDEF = 4;

	/**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @generated
	 * @ordered
	 */
	public static final CacheType DATA_LITERAL = new CacheType(DATA, "data", "data");

	/**
	 * The '<em><b>Instruction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTION
	 * @generated
	 * @ordered
	 */
	public static final CacheType INSTRUCTION_LITERAL = new CacheType(INSTRUCTION, "instruction", "instruction");

	/**
	 * The '<em><b>Unified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIFIED
	 * @generated
	 * @ordered
	 */
	public static final CacheType UNIFIED_LITERAL = new CacheType(UNIFIED, "unified", "unified");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final CacheType OTHER_LITERAL = new CacheType(OTHER, "other", "other");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final CacheType UNDEF_LITERAL = new CacheType(UNDEF, "undef", "undef");

	/**
	 * An array of all the '<em><b>Cache Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CacheType[] VALUES_ARRAY =
		new CacheType[] {
			DATA_LITERAL,
			INSTRUCTION_LITERAL,
			UNIFIED_LITERAL,
			OTHER_LITERAL,
			UNDEF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Cache Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cache Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheType get(int value) {
		switch (value) {
			case DATA: return DATA_LITERAL;
			case INSTRUCTION: return INSTRUCTION_LITERAL;
			case UNIFIED: return UNIFIED_LITERAL;
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
	private CacheType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //CacheType
