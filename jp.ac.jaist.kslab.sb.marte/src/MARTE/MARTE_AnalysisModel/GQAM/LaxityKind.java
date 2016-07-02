/**
 */
package MARTE.MARTE_AnalysisModel.GQAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Laxity Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage#getLaxityKind()
 * @model
 * @generated
 */
public final class LaxityKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Hard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARD_LITERAL
	 * @model name="hard"
	 * @generated
	 * @ordered
	 */
	public static final int HARD = 0;

	/**
	 * The '<em><b>Soft</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Soft</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFT_LITERAL
	 * @model name="soft"
	 * @generated
	 * @ordered
	 */
	public static final int SOFT = 1;

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
	 * The '<em><b>Hard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARD
	 * @generated
	 * @ordered
	 */
	public static final LaxityKind HARD_LITERAL = new LaxityKind(HARD, "hard", "hard");

	/**
	 * The '<em><b>Soft</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFT
	 * @generated
	 * @ordered
	 */
	public static final LaxityKind SOFT_LITERAL = new LaxityKind(SOFT, "soft", "soft");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final LaxityKind OTHER_LITERAL = new LaxityKind(OTHER, "other", "other");

	/**
	 * An array of all the '<em><b>Laxity Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LaxityKind[] VALUES_ARRAY =
		new LaxityKind[] {
			HARD_LITERAL,
			SOFT_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Laxity Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Laxity Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LaxityKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LaxityKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Laxity Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LaxityKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LaxityKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Laxity Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LaxityKind get(int value) {
		switch (value) {
			case HARD: return HARD_LITERAL;
			case SOFT: return SOFT_LITERAL;
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
	private LaxityKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //LaxityKind
