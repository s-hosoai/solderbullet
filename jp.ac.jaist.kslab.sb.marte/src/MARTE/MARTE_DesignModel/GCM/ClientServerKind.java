/**
 */
package MARTE.MARTE_DesignModel.GCM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Client Server Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.GCM.GCMPackage#getClientServerKind()
 * @model
 * @generated
 */
public final class ClientServerKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Required</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_LITERAL
	 * @model name="required"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED = 0;

	/**
	 * The '<em><b>Provided</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provided</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDED_LITERAL
	 * @model name="provided"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDED = 1;

	/**
	 * The '<em><b>Proreq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proreq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROREQ_LITERAL
	 * @model name="proreq"
	 * @generated
	 * @ordered
	 */
	public static final int PROREQ = 2;

	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @generated
	 * @ordered
	 */
	public static final ClientServerKind REQUIRED_LITERAL = new ClientServerKind(REQUIRED, "required", "required");

	/**
	 * The '<em><b>Provided</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDED
	 * @generated
	 * @ordered
	 */
	public static final ClientServerKind PROVIDED_LITERAL = new ClientServerKind(PROVIDED, "provided", "provided");

	/**
	 * The '<em><b>Proreq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROREQ
	 * @generated
	 * @ordered
	 */
	public static final ClientServerKind PROREQ_LITERAL = new ClientServerKind(PROREQ, "proreq", "proreq");

	/**
	 * An array of all the '<em><b>Client Server Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClientServerKind[] VALUES_ARRAY =
		new ClientServerKind[] {
			REQUIRED_LITERAL,
			PROVIDED_LITERAL,
			PROREQ_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Client Server Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Client Server Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClientServerKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientServerKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Server Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClientServerKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientServerKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Server Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ClientServerKind get(int value) {
		switch (value) {
			case REQUIRED: return REQUIRED_LITERAL;
			case PROVIDED: return PROVIDED_LITERAL;
			case PROREQ: return PROREQ_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ClientServerKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ClientServerKind
