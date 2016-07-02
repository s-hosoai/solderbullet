/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Interaction;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mutual Exclusion Resource Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_Interaction.SW_InteractionPackage#getMutualExclusionResourceKind()
 * @model
 * @generated
 */
public final class MutualExclusionResourceKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Boolean Semaphore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean Semaphore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_SEMAPHORE_LITERAL
	 * @model name="BooleanSemaphore"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_SEMAPHORE = 0;

	/**
	 * The '<em><b>Count Semaphore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Count Semaphore</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNT_SEMAPHORE_LITERAL
	 * @model name="CountSemaphore"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_SEMAPHORE = 1;

	/**
	 * The '<em><b>Mutex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mutex</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUTEX_LITERAL
	 * @model name="Mutex"
	 * @generated
	 * @ordered
	 */
	public static final int MUTEX = 2;

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
	 * The '<em><b>Boolean Semaphore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_SEMAPHORE
	 * @generated
	 * @ordered
	 */
	public static final MutualExclusionResourceKind BOOLEAN_SEMAPHORE_LITERAL = new MutualExclusionResourceKind(BOOLEAN_SEMAPHORE, "BooleanSemaphore", "BooleanSemaphore");

	/**
	 * The '<em><b>Count Semaphore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_SEMAPHORE
	 * @generated
	 * @ordered
	 */
	public static final MutualExclusionResourceKind COUNT_SEMAPHORE_LITERAL = new MutualExclusionResourceKind(COUNT_SEMAPHORE, "CountSemaphore", "CountSemaphore");

	/**
	 * The '<em><b>Mutex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUTEX
	 * @generated
	 * @ordered
	 */
	public static final MutualExclusionResourceKind MUTEX_LITERAL = new MutualExclusionResourceKind(MUTEX, "Mutex", "Mutex");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final MutualExclusionResourceKind UNDEF_LITERAL = new MutualExclusionResourceKind(UNDEF, "Undef", "Undef");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final MutualExclusionResourceKind OTHER_LITERAL = new MutualExclusionResourceKind(OTHER, "Other", "Other");

	/**
	 * An array of all the '<em><b>Mutual Exclusion Resource Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MutualExclusionResourceKind[] VALUES_ARRAY =
		new MutualExclusionResourceKind[] {
			BOOLEAN_SEMAPHORE_LITERAL,
			COUNT_SEMAPHORE_LITERAL,
			MUTEX_LITERAL,
			UNDEF_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Mutual Exclusion Resource Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mutual Exclusion Resource Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MutualExclusionResourceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MutualExclusionResourceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mutual Exclusion Resource Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MutualExclusionResourceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MutualExclusionResourceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mutual Exclusion Resource Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MutualExclusionResourceKind get(int value) {
		switch (value) {
			case BOOLEAN_SEMAPHORE: return BOOLEAN_SEMAPHORE_LITERAL;
			case COUNT_SEMAPHORE: return COUNT_SEMAPHORE_LITERAL;
			case MUTEX: return MUTEX_LITERAL;
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
	private MutualExclusionResourceKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //MutualExclusionResourceKind
