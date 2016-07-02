/**
 */
package MARTE.MARTE_DesignModel.HLAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Synchronization Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.HLAM.HLAMPackage#getSynchronizationKind()
 * @model
 * @generated
 */
public final class SynchronizationKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Synchronous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Synchronous</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCHRONOUS_LITERAL
	 * @model name="synchronous"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRONOUS = 0;

	/**
	 * The '<em><b>Asynchronous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asynchronous</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNCHRONOUS_LITERAL
	 * @model name="asynchronous"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCHRONOUS = 1;

	/**
	 * The '<em><b>Delayed Synchronous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delayed Synchronous</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELAYED_SYNCHRONOUS_LITERAL
	 * @model name="delayedSynchronous"
	 * @generated
	 * @ordered
	 */
	public static final int DELAYED_SYNCHRONOUS = 2;

	/**
	 * The '<em><b>Rendez Vous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rendez Vous</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RENDEZ_VOUS_LITERAL
	 * @model name="rendezVous"
	 * @generated
	 * @ordered
	 */
	public static final int RENDEZ_VOUS = 3;

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
	public static final int OTHER = 4;

	/**
	 * The '<em><b>Synchronous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCHRONOUS
	 * @generated
	 * @ordered
	 */
	public static final SynchronizationKind SYNCHRONOUS_LITERAL = new SynchronizationKind(SYNCHRONOUS, "synchronous", "synchronous");

	/**
	 * The '<em><b>Asynchronous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCHRONOUS
	 * @generated
	 * @ordered
	 */
	public static final SynchronizationKind ASYNCHRONOUS_LITERAL = new SynchronizationKind(ASYNCHRONOUS, "asynchronous", "asynchronous");

	/**
	 * The '<em><b>Delayed Synchronous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAYED_SYNCHRONOUS
	 * @generated
	 * @ordered
	 */
	public static final SynchronizationKind DELAYED_SYNCHRONOUS_LITERAL = new SynchronizationKind(DELAYED_SYNCHRONOUS, "delayedSynchronous", "delayedSynchronous");

	/**
	 * The '<em><b>Rendez Vous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RENDEZ_VOUS
	 * @generated
	 * @ordered
	 */
	public static final SynchronizationKind RENDEZ_VOUS_LITERAL = new SynchronizationKind(RENDEZ_VOUS, "rendezVous", "rendezVous");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final SynchronizationKind OTHER_LITERAL = new SynchronizationKind(OTHER, "other", "other");

	/**
	 * An array of all the '<em><b>Synchronization Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SynchronizationKind[] VALUES_ARRAY =
		new SynchronizationKind[] {
			SYNCHRONOUS_LITERAL,
			ASYNCHRONOUS_LITERAL,
			DELAYED_SYNCHRONOUS_LITERAL,
			RENDEZ_VOUS_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Synchronization Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Synchronization Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SynchronizationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SynchronizationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Synchronization Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SynchronizationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SynchronizationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Synchronization Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SynchronizationKind get(int value) {
		switch (value) {
			case SYNCHRONOUS: return SYNCHRONOUS_LITERAL;
			case ASYNCHRONOUS: return ASYNCHRONOUS_LITERAL;
			case DELAYED_SYNCHRONOUS: return DELAYED_SYNCHRONOUS_LITERAL;
			case RENDEZ_VOUS: return RENDEZ_VOUS_LITERAL;
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
	private SynchronizationKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SynchronizationKind
