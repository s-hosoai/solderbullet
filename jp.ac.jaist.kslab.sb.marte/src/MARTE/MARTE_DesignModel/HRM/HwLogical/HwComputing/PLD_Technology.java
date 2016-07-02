/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PLD Technology</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage#getPLD_Technology()
 * @model
 * @generated
 */
public final class PLD_Technology extends AbstractEnumerator {
	/**
	 * The '<em><b>SRAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SRAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SRAM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SRAM = 0;

	/**
	 * The '<em><b>Antifuse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Antifuse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANTIFUSE_LITERAL
	 * @model name="antifuse"
	 * @generated
	 * @ordered
	 */
	public static final int ANTIFUSE = 1;

	/**
	 * The '<em><b>Flash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLASH_LITERAL
	 * @model name="flash"
	 * @generated
	 * @ordered
	 */
	public static final int FLASH = 2;

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
	 * The '<em><b>SRAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SRAM
	 * @generated
	 * @ordered
	 */
	public static final PLD_Technology SRAM_LITERAL = new PLD_Technology(SRAM, "SRAM", "SRAM");

	/**
	 * The '<em><b>Antifuse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANTIFUSE
	 * @generated
	 * @ordered
	 */
	public static final PLD_Technology ANTIFUSE_LITERAL = new PLD_Technology(ANTIFUSE, "antifuse", "antifuse");

	/**
	 * The '<em><b>Flash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLASH
	 * @generated
	 * @ordered
	 */
	public static final PLD_Technology FLASH_LITERAL = new PLD_Technology(FLASH, "flash", "flash");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final PLD_Technology OTHER_LITERAL = new PLD_Technology(OTHER, "other", "other");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final PLD_Technology UNDEF_LITERAL = new PLD_Technology(UNDEF, "undef", "undef");

	/**
	 * An array of all the '<em><b>PLD Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PLD_Technology[] VALUES_ARRAY =
		new PLD_Technology[] {
			SRAM_LITERAL,
			ANTIFUSE_LITERAL,
			FLASH_LITERAL,
			OTHER_LITERAL,
			UNDEF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>PLD Technology</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PLD Technology</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PLD_Technology get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PLD_Technology result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PLD Technology</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PLD_Technology getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PLD_Technology result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PLD Technology</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PLD_Technology get(int value) {
		switch (value) {
			case SRAM: return SRAM_LITERAL;
			case ANTIFUSE: return ANTIFUSE_LITERAL;
			case FLASH: return FLASH_LITERAL;
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
	private PLD_Technology(int value, String name, String literal) {
		super(value, name, literal);
	}

} //PLD_Technology
