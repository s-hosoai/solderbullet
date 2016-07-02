/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Notification Resource Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getNotificationResourceKind()
 * @model
 * @generated
 */
public final class NotificationResourceKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_LITERAL
	 * @model name="Event"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT = 0;

	/**
	 * The '<em><b>Barrier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Barrier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARRIER_LITERAL
	 * @model name="Barrier"
	 * @generated
	 * @ordered
	 */
	public static final int BARRIER = 1;

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
	public static final int UNDEF = 2;

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
	public static final int OTHER = 3;

	/**
	 * The '<em><b>Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT
	 * @generated
	 * @ordered
	 */
	public static final NotificationResourceKind EVENT_LITERAL = new NotificationResourceKind(EVENT, "Event", "Event");

	/**
	 * The '<em><b>Barrier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARRIER
	 * @generated
	 * @ordered
	 */
	public static final NotificationResourceKind BARRIER_LITERAL = new NotificationResourceKind(BARRIER, "Barrier", "Barrier");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final NotificationResourceKind UNDEF_LITERAL = new NotificationResourceKind(UNDEF, "Undef", "Undef");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final NotificationResourceKind OTHER_LITERAL = new NotificationResourceKind(OTHER, "Other", "Other");

	/**
	 * An array of all the '<em><b>Notification Resource Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NotificationResourceKind[] VALUES_ARRAY =
		new NotificationResourceKind[] {
			EVENT_LITERAL,
			BARRIER_LITERAL,
			UNDEF_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Notification Resource Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Notification Resource Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationResourceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationResourceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Resource Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationResourceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NotificationResourceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Notification Resource Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NotificationResourceKind get(int value) {
		switch (value) {
			case EVENT: return EVENT_LITERAL;
			case BARRIER: return BARRIER_LITERAL;
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
	private NotificationResourceKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //NotificationResourceKind
