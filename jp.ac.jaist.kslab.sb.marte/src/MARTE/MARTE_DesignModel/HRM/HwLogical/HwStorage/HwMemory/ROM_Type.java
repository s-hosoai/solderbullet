/**
 */
package MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ROM Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwLogical.HwStorage.HwMemory.HwMemoryPackage#getROM_Type()
 * @model
 * @generated
 */
public final class ROM_Type extends AbstractEnumerator {
	/**
	 * The '<em><b>Masked ROM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Masked ROM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASKED_ROM_LITERAL
	 * @model name="maskedROM"
	 * @generated
	 * @ordered
	 */
	public static final int MASKED_ROM = 0;

	/**
	 * The '<em><b>EPROM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EPROM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EPROM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EPROM = 1;

	/**
	 * The '<em><b>OTP EPROM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTP EPROM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTP_EPROM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTP_EPROM = 2;

	/**
	 * The '<em><b>EEPROM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EEPROM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EEPROM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EEPROM = 3;

	/**
	 * The '<em><b>Flash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLASH_LITERAL
	 * @model name="Flash"
	 * @generated
	 * @ordered
	 */
	public static final int FLASH = 4;

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
	public static final int OTHER = 5;

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
	public static final int UNDEF = 6;

	/**
	 * The '<em><b>Masked ROM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASKED_ROM
	 * @generated
	 * @ordered
	 */
	public static final ROM_Type MASKED_ROM_LITERAL = new ROM_Type(MASKED_ROM, "maskedROM", "maskedROM");

	/**
	 * The '<em><b>EPROM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPROM
	 * @generated
	 * @ordered
	 */
	public static final ROM_Type EPROM_LITERAL = new ROM_Type(EPROM, "EPROM", "EPROM");

	/**
	 * The '<em><b>OTP EPROM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTP_EPROM
	 * @generated
	 * @ordered
	 */
	public static final ROM_Type OTP_EPROM_LITERAL = new ROM_Type(OTP_EPROM, "OTP_EPROM", "OTP_EPROM");

	/**
	 * The '<em><b>EEPROM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EEPROM
	 * @generated
	 * @ordered
	 */
	public static final ROM_Type EEPROM_LITERAL = new ROM_Type(EEPROM, "EEPROM", "EEPROM");

	/**
	 * The '<em><b>Flash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLASH
	 * @generated
	 * @ordered
	 */
	public static final ROM_Type FLASH_LITERAL = new ROM_Type(FLASH, "Flash", "Flash");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final ROM_Type OTHER_LITERAL = new ROM_Type(OTHER, "other", "other");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final ROM_Type UNDEF_LITERAL = new ROM_Type(UNDEF, "undef", "undef");

	/**
	 * An array of all the '<em><b>ROM Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ROM_Type[] VALUES_ARRAY =
		new ROM_Type[] {
			MASKED_ROM_LITERAL,
			EPROM_LITERAL,
			OTP_EPROM_LITERAL,
			EEPROM_LITERAL,
			FLASH_LITERAL,
			OTHER_LITERAL,
			UNDEF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ROM Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ROM Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ROM_Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ROM_Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ROM Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ROM_Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ROM_Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ROM Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ROM_Type get(int value) {
		switch (value) {
			case MASKED_ROM: return MASKED_ROM_LITERAL;
			case EPROM: return EPROM_LITERAL;
			case OTP_EPROM: return OTP_EPROM_LITERAL;
			case EEPROM: return EEPROM_LITERAL;
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
	private ROM_Type(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ROM_Type
