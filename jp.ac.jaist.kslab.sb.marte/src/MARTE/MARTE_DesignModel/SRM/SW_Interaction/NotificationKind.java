/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Notification Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getNotificationKind()
 * @model
 * @generated
 */
public final class NotificationKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Memorized</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memorized</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORIZED_LITERAL
	 * @model name="Memorized"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORIZED = 0;

	/**
	 * The '<em><b>Bounded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bounded</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOUNDED_LITERAL
	 * @model name="Bounded"
	 * @generated
	 * @ordered
	 */
	public static final int BOUNDED = 1;

	/**
	 * The '<em><b>Memoryless</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memoryless</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORYLESS_LITERAL
	 * @model name="Memoryless"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORYLESS = 2;

	/**
	 * The '<em><b>Undef</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undef</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEF_LITERAL
	 * @model name="Undef"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEF = 3;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_LITERAL
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER = 4;

	/**
	 * The '<em><b>Memorized</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORIZED
	 * @generated
	 * @ordered
	 */
	public static final NotificationKind MEMORIZED_LITERAL = new NotificationKind(MEMORIZED, "Memorized", "Memorized");

	/**
	 * The '<em><b>Bounded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUNDED
	 * @generated
	 * @ordered
	 */
	public static final NotificationKind BOUNDED_LITERAL = new NotificationKind(BOUNDED, "Bounded", "Bounded");

	/**
	 * The '<em><b>Memoryless</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORYLESS
	 * @generated
	 * @ordered
	 */
	public static final NotificationKind MEMORYLESS_LITERAL = new NotificationKind(MEMORYLESS, "Memoryless", "Memoryless");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final NotificationKind UNDEF_LITERAL = new NotificationKind(UNDEF, "Undef", "Undef");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final NotificationKind OTHER_LITERAL = new NotificationKind(OTHER, "Other", "Other");

	/**
	 * An array of all the '<em><b>Notification Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NotificationKind[] VALUES_ARRAY =
		new NotificationKind[] {
			MEMORIZED_LITERAL,
			BOUNDED_LITERAL,
			MEMORYLESS_LITERAL,
			UNDEF_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Notification Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Notification Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationKind get(int value) {
		switch (value) {
			case MEMORIZED: return MEMORIZED_LITERAL;
			case BOUNDED: return BOUNDED_LITERAL;
			case MEMORYLESS: return MEMORYLESS_LITERAL;
			case UNDEF: return UNDEF_LITERAL;
			case OTHER: return OTHER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NotificationKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //NotificationKind
