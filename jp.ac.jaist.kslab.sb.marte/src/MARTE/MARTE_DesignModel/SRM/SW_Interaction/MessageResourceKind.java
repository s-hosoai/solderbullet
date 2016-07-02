/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Message Resource Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMessageResourceKind()
 * @model
 * @generated
 */
public final class MessageResourceKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Message Queue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Message Queue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_QUEUE_LITERAL
	 * @model name="MessageQueue"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_QUEUE = 0;

	/**
	 * The '<em><b>Pipe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pipe</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIPE_LITERAL
	 * @model name="Pipe"
	 * @generated
	 * @ordered
	 */
	public static final int PIPE = 1;

	/**
	 * The '<em><b>Blackboard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blackboard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACKBOARD_LITERAL
	 * @model name="Blackboard"
	 * @generated
	 * @ordered
	 */
	public static final int BLACKBOARD = 2;

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
	 * The '<em><b>Message Queue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_QUEUE
	 * @generated
	 * @ordered
	 */
	public static final MessageResourceKind MESSAGE_QUEUE_LITERAL = new MessageResourceKind(MESSAGE_QUEUE, "MessageQueue", "MessageQueue");

	/**
	 * The '<em><b>Pipe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIPE
	 * @generated
	 * @ordered
	 */
	public static final MessageResourceKind PIPE_LITERAL = new MessageResourceKind(PIPE, "Pipe", "Pipe");

	/**
	 * The '<em><b>Blackboard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACKBOARD
	 * @generated
	 * @ordered
	 */
	public static final MessageResourceKind BLACKBOARD_LITERAL = new MessageResourceKind(BLACKBOARD, "Blackboard", "Blackboard");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final MessageResourceKind UNDEF_LITERAL = new MessageResourceKind(UNDEF, "Undef", "Undef");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final MessageResourceKind OTHER_LITERAL = new MessageResourceKind(OTHER, "Other", "Other");

	/**
	 * An array of all the '<em><b>Message Resource Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MessageResourceKind[] VALUES_ARRAY =
		new MessageResourceKind[] {
			MESSAGE_QUEUE_LITERAL,
			PIPE_LITERAL,
			BLACKBOARD_LITERAL,
			UNDEF_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Message Resource Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Message Resource Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageResourceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageResourceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Resource Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageResourceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MessageResourceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Message Resource Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MessageResourceKind get(int value) {
		switch (value) {
			case MESSAGE_QUEUE: return MESSAGE_QUEUE_LITERAL;
			case PIPE: return PIPE_LITERAL;
			case BLACKBOARD: return BLACKBOARD_LITERAL;
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
	private MessageResourceKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //MessageResourceKind
