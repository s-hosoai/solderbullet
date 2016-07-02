/**
 */
package MARTE.MARTE_AnalysisModel.SAM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Optimallity Criterion Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_AnalysisModel.SAM.SAMPackage#getOptimallityCriterionKind()
 * @model
 * @generated
 */
public final class OptimallityCriterionKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Meet Hard Deadlines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meet Hard Deadlines</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEET_HARD_DEADLINES_LITERAL
	 * @model name="meetHardDeadlines"
	 * @generated
	 * @ordered
	 */
	public static final int MEET_HARD_DEADLINES = 0;

	/**
	 * The '<em><b>Minimize Missed Deadlines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minimize Missed Deadlines</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINIMIZE_MISSED_DEADLINES_LITERAL
	 * @model name="minimizeMissedDeadlines"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMIZE_MISSED_DEADLINES = 1;

	/**
	 * The '<em><b>Minimized Mean Tardiness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minimized Mean Tardiness</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINIMIZED_MEAN_TARDINESS_LITERAL
	 * @model name="minimizedMeanTardiness"
	 * @generated
	 * @ordered
	 */
	public static final int MINIMIZED_MEAN_TARDINESS = 2;

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
	 * The '<em><b>Meet Hard Deadlines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEET_HARD_DEADLINES
	 * @generated
	 * @ordered
	 */
	public static final OptimallityCriterionKind MEET_HARD_DEADLINES_LITERAL = new OptimallityCriterionKind(MEET_HARD_DEADLINES, "meetHardDeadlines", "meetHardDeadlines");

	/**
	 * The '<em><b>Minimize Missed Deadlines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMIZE_MISSED_DEADLINES
	 * @generated
	 * @ordered
	 */
	public static final OptimallityCriterionKind MINIMIZE_MISSED_DEADLINES_LITERAL = new OptimallityCriterionKind(MINIMIZE_MISSED_DEADLINES, "minimizeMissedDeadlines", "minimizeMissedDeadlines");

	/**
	 * The '<em><b>Minimized Mean Tardiness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINIMIZED_MEAN_TARDINESS
	 * @generated
	 * @ordered
	 */
	public static final OptimallityCriterionKind MINIMIZED_MEAN_TARDINESS_LITERAL = new OptimallityCriterionKind(MINIMIZED_MEAN_TARDINESS, "minimizedMeanTardiness", "minimizedMeanTardiness");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final OptimallityCriterionKind UNDEF_LITERAL = new OptimallityCriterionKind(UNDEF, "undef", "undef");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final OptimallityCriterionKind OTHER_LITERAL = new OptimallityCriterionKind(OTHER, "other", "other");

	/**
	 * An array of all the '<em><b>Optimallity Criterion Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OptimallityCriterionKind[] VALUES_ARRAY =
		new OptimallityCriterionKind[] {
			MEET_HARD_DEADLINES_LITERAL,
			MINIMIZE_MISSED_DEADLINES_LITERAL,
			MINIMIZED_MEAN_TARDINESS_LITERAL,
			UNDEF_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Optimallity Criterion Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Optimallity Criterion Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OptimallityCriterionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OptimallityCriterionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Optimallity Criterion Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OptimallityCriterionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OptimallityCriterionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Optimallity Criterion Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OptimallityCriterionKind get(int value) {
		switch (value) {
			case MEET_HARD_DEADLINES: return MEET_HARD_DEADLINES_LITERAL;
			case MINIMIZE_MISSED_DEADLINES: return MINIMIZE_MISSED_DEADLINES_LITERAL;
			case MINIMIZED_MEAN_TARDINESS: return MINIMIZED_MEAN_TARDINESS_LITERAL;
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
	private OptimallityCriterionKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //OptimallityCriterionKind
