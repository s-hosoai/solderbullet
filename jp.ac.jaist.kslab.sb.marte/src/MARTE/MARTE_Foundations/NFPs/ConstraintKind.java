/**
 */
package MARTE.MARTE_Foundations.NFPs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_Foundations.NFPs.NFPsPackage#getConstraintKind()
 * @model
 * @generated
 */
public final class ConstraintKind extends AbstractEnumerator {
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
	 * The '<em><b>Offered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Offered</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFFERED_LITERAL
	 * @model name="offered"
	 * @generated
	 * @ordered
	 */
	public static final int OFFERED = 1;

	/**
	 * The '<em><b>Contract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contract</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_LITERAL
	 * @model name="contract"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT = 2;

	/**
	 * The '<em><b>Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @generated
	 * @ordered
	 */
	public static final ConstraintKind REQUIRED_LITERAL = new ConstraintKind(REQUIRED, "required", "required");

	/**
	 * The '<em><b>Offered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFFERED
	 * @generated
	 * @ordered
	 */
	public static final ConstraintKind OFFERED_LITERAL = new ConstraintKind(OFFERED, "offered", "offered");

	/**
	 * The '<em><b>Contract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT
	 * @generated
	 * @ordered
	 */
	public static final ConstraintKind CONTRACT_LITERAL = new ConstraintKind(CONTRACT, "contract", "contract");

	/**
	 * An array of all the '<em><b>Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConstraintKind[] VALUES_ARRAY =
		new ConstraintKind[] {
			REQUIRED_LITERAL,
			OFFERED_LITERAL,
			CONTRACT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintKind get(int value) {
		switch (value) {
			case REQUIRED: return REQUIRED_LITERAL;
			case OFFERED: return OFFERED_LITERAL;
			case CONTRACT: return CONTRACT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConstraintKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ConstraintKind
