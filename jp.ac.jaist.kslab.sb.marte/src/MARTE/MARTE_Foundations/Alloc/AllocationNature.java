/**
 */
package MARTE.MARTE_Foundations.Alloc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allocation Nature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_Foundations.Alloc.AllocPackage#getAllocationNature()
 * @model
 * @generated
 */
public final class AllocationNature extends AbstractEnumerator {
	/**
	 * The '<em><b>Spatial Distribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spatial Distribution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPATIAL_DISTRIBUTION_LITERAL
	 * @model name="spatialDistribution"
	 * @generated
	 * @ordered
	 */
	public static final int SPATIAL_DISTRIBUTION = 0;

	/**
	 * The '<em><b>Time Scheduling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Scheduling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_SCHEDULING_LITERAL
	 * @model name="timeScheduling"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_SCHEDULING = 1;

	/**
	 * The '<em><b>Spatial Distribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPATIAL_DISTRIBUTION
	 * @generated
	 * @ordered
	 */
	public static final AllocationNature SPATIAL_DISTRIBUTION_LITERAL = new AllocationNature(SPATIAL_DISTRIBUTION, "spatialDistribution", "spatialDistribution");

	/**
	 * The '<em><b>Time Scheduling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_SCHEDULING
	 * @generated
	 * @ordered
	 */
	public static final AllocationNature TIME_SCHEDULING_LITERAL = new AllocationNature(TIME_SCHEDULING, "timeScheduling", "timeScheduling");

	/**
	 * An array of all the '<em><b>Allocation Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllocationNature[] VALUES_ARRAY =
		new AllocationNature[] {
			SPATIAL_DISTRIBUTION_LITERAL,
			TIME_SCHEDULING_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Allocation Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allocation Nature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllocationNature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllocationNature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allocation Nature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllocationNature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllocationNature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allocation Nature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllocationNature get(int value) {
		switch (value) {
			case SPATIAL_DISTRIBUTION: return SPATIAL_DISTRIBUTION_LITERAL;
			case TIME_SCHEDULING: return TIME_SCHEDULING_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AllocationNature(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AllocationNature
