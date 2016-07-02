/**
 */
package MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Component State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HRM.HwPhysical.HwLayout.HwLayoutPackage#getComponentState()
 * @model
 * @generated
 */
public final class ComponentState extends AbstractEnumerator {
	/**
	 * The '<em><b>Operating</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operating</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATING_LITERAL
	 * @model name="operating"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING = 0;

	/**
	 * The '<em><b>Storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORAGE_LITERAL
	 * @model name="storage"
	 * @generated
	 * @ordered
	 */
	public static final int STORAGE = 1;

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
	public static final int OTHER = 2;

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
	public static final int UNDEF = 3;

	/**
	 * The '<em><b>Operating</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATING
	 * @generated
	 * @ordered
	 */
	public static final ComponentState OPERATING_LITERAL = new ComponentState(OPERATING, "operating", "operating");

	/**
	 * The '<em><b>Storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORAGE
	 * @generated
	 * @ordered
	 */
	public static final ComponentState STORAGE_LITERAL = new ComponentState(STORAGE, "storage", "storage");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final ComponentState OTHER_LITERAL = new ComponentState(OTHER, "other", "other");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final ComponentState UNDEF_LITERAL = new ComponentState(UNDEF, "undef", "undef");

	/**
	 * An array of all the '<em><b>Component State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComponentState[] VALUES_ARRAY =
		new ComponentState[] {
			OPERATING_LITERAL,
			STORAGE_LITERAL,
			OTHER_LITERAL,
			UNDEF_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Component State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Component State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComponentState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Component State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComponentState get(int value) {
		switch (value) {
			case OPERATING: return OPERATING_LITERAL;
			case STORAGE: return STORAGE_LITERAL;
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
	private ComponentState(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ComponentState
