/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getComponentKind()
 * @model
 * @generated
 */
public final class ComponentKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Card</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARD_LITERAL
	 * @model name="card"
	 * @generated
	 * @ordered
	 */
	public static final int CARD = 0;

	/**
	 * The '<em><b>Channel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Channel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANNEL_LITERAL
	 * @model name="channel"
	 * @generated
	 * @ordered
	 */
	public static final int CHANNEL = 1;

	/**
	 * The '<em><b>Chip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chip</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHIP_LITERAL
	 * @model name="chip"
	 * @generated
	 * @ordered
	 */
	public static final int CHIP = 2;

	/**
	 * The '<em><b>Port</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Port</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORT_LITERAL
	 * @model name="port"
	 * @generated
	 * @ordered
	 */
	public static final int PORT = 3;

	/**
	 * The '<em><b>Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT_LITERAL
	 * @model name="unit"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT = 4;

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
	 * The '<em><b>Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARD
	 * @generated
	 * @ordered
	 */
	public static final ComponentKind CARD_LITERAL = new ComponentKind(CARD, "card", "card");

	/**
	 * The '<em><b>Channel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANNEL
	 * @generated
	 * @ordered
	 */
	public static final ComponentKind CHANNEL_LITERAL = new ComponentKind(CHANNEL, "channel", "channel");

	/**
	 * The '<em><b>Chip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHIP
	 * @generated
	 * @ordered
	 */
	public static final ComponentKind CHIP_LITERAL = new ComponentKind(CHIP, "chip", "chip");

	/**
	 * The '<em><b>Port</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT
	 * @generated
	 * @ordered
	 */
	public static final ComponentKind PORT_LITERAL = new ComponentKind(PORT, "port", "port");

	/**
	 * The '<em><b>Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT
	 * @generated
	 * @ordered
	 */
	public static final ComponentKind UNIT_LITERAL = new ComponentKind(UNIT, "unit", "unit");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final ComponentKind OTHER_LITERAL = new ComponentKind(OTHER, "other", "other");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final ComponentKind UNDEF_LITERAL = new ComponentKind(UNDEF, "undef", "undef");

	/**
	 * An array of all the '<em><b>Component Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentKind[] VALUES_ARRAY =
		new ComponentKind[] {
			CARD_LITERAL,
			CHANNEL_LITERAL,
			CHIP_LITERAL,
			PORT_LITERAL,
			UNIT_LITERAL,
			OTHER_LITERAL,
			UNDEF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Component Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentKind get(int value) {
		switch (value) {
			case CARD: return CARD_LITERAL;
			case CHANNEL: return CHANNEL_LITERAL;
			case CHIP: return CHIP_LITERAL;
			case PORT: return PORT_LITERAL;
			case UNIT: return UNIT_LITERAL;
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
	private ComponentKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ComponentKind
