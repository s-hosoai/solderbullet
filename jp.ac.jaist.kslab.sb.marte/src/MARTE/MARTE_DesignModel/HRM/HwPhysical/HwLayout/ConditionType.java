/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getConditionType()
 * @model
 * @generated
 */
public final class ConditionType extends AbstractEnumerator {
	/**
	 * The '<em><b>Temperature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Temperature</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_LITERAL
	 * @model name="temperature"
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE = 0;

	/**
	 * The '<em><b>Humidity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Humidity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUMIDITY_LITERAL
	 * @model name="humidity"
	 * @generated
	 * @ordered
	 */
	public static final int HUMIDITY = 1;

	/**
	 * The '<em><b>Altitude</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Altitude</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALTITUDE_LITERAL
	 * @model name="altitude"
	 * @generated
	 * @ordered
	 */
	public static final int ALTITUDE = 2;

	/**
	 * The '<em><b>Vibration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vibration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIBRATION_LITERAL
	 * @model name="vibration"
	 * @generated
	 * @ordered
	 */
	public static final int VIBRATION = 3;

	/**
	 * The '<em><b>Shock</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shock</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHOCK_LITERAL
	 * @model name="shock"
	 * @generated
	 * @ordered
	 */
	public static final int SHOCK = 4;

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
	 * The '<em><b>Temperature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @generated
	 * @ordered
	 */
	public static final ConditionType TEMPERATURE_LITERAL = new ConditionType(TEMPERATURE, "temperature", "temperature");

	/**
	 * The '<em><b>Humidity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMIDITY
	 * @generated
	 * @ordered
	 */
	public static final ConditionType HUMIDITY_LITERAL = new ConditionType(HUMIDITY, "humidity", "humidity");

	/**
	 * The '<em><b>Altitude</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTITUDE
	 * @generated
	 * @ordered
	 */
	public static final ConditionType ALTITUDE_LITERAL = new ConditionType(ALTITUDE, "altitude", "altitude");

	/**
	 * The '<em><b>Vibration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIBRATION
	 * @generated
	 * @ordered
	 */
	public static final ConditionType VIBRATION_LITERAL = new ConditionType(VIBRATION, "vibration", "vibration");

	/**
	 * The '<em><b>Shock</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOCK
	 * @generated
	 * @ordered
	 */
	public static final ConditionType SHOCK_LITERAL = new ConditionType(SHOCK, "shock", "shock");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final ConditionType OTHER_LITERAL = new ConditionType(OTHER, "other", "other");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final ConditionType UNDEF_LITERAL = new ConditionType(UNDEF, "undef", "undef");

	/**
	 * An array of all the '<em><b>Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionType[] VALUES_ARRAY =
		new ConditionType[] {
			TEMPERATURE_LITERAL,
			HUMIDITY_LITERAL,
			ALTITUDE_LITERAL,
			VIBRATION_LITERAL,
			SHOCK_LITERAL,
			OTHER_LITERAL,
			UNDEF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionType get(int value) {
		switch (value) {
			case TEMPERATURE: return TEMPERATURE_LITERAL;
			case HUMIDITY: return HUMIDITY_LITERAL;
			case ALTITUDE: return ALTITUDE_LITERAL;
			case VIBRATION: return VIBRATION_LITERAL;
			case SHOCK: return SHOCK_LITERAL;
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
	private ConditionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ConditionType
