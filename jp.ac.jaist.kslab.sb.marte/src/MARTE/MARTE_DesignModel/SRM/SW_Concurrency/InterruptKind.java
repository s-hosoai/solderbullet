/**
 */
package MARTE.MARTE_DesignModel.SRM.SW_Concurrency;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interrupt Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MARTE.MARTE_DesignModel.SRM.SW_Concurrency.SW_ConcurrencyPackage#getInterruptKind()
 * @model
 * @generated
 */
public final class InterruptKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Hardware Interruption</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hardware Interruption</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_INTERRUPTION_LITERAL
	 * @model name="HardwareInterruption"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_INTERRUPTION = 0;

	/**
	 * The '<em><b>Processor Detected Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Processor Detected Exception</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSOR_DETECTED_EXCEPTION_LITERAL
	 * @model name="ProcessorDetectedException"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSOR_DETECTED_EXCEPTION = 1;

	/**
	 * The '<em><b>Programmed Exception</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Programmed Exception</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROGRAMMED_EXCEPTION_LITERAL
	 * @model name="ProgrammedException"
	 * @generated
	 * @ordered
	 */
	public static final int PROGRAMMED_EXCEPTION = 2;

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
	 * The '<em><b>Hardware Interruption</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_INTERRUPTION
	 * @generated
	 * @ordered
	 */
	public static final InterruptKind HARDWARE_INTERRUPTION_LITERAL = new InterruptKind(HARDWARE_INTERRUPTION, "HardwareInterruption", "HardwareInterruption");

	/**
	 * The '<em><b>Processor Detected Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSOR_DETECTED_EXCEPTION
	 * @generated
	 * @ordered
	 */
	public static final InterruptKind PROCESSOR_DETECTED_EXCEPTION_LITERAL = new InterruptKind(PROCESSOR_DETECTED_EXCEPTION, "ProcessorDetectedException", "ProcessorDetectedException");

	/**
	 * The '<em><b>Programmed Exception</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAMMED_EXCEPTION
	 * @generated
	 * @ordered
	 */
	public static final InterruptKind PROGRAMMED_EXCEPTION_LITERAL = new InterruptKind(PROGRAMMED_EXCEPTION, "ProgrammedException", "ProgrammedException");

	/**
	 * The '<em><b>Undef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEF
	 * @generated
	 * @ordered
	 */
	public static final InterruptKind UNDEF_LITERAL = new InterruptKind(UNDEF, "Undef", "Undef");

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @generated
	 * @ordered
	 */
	public static final InterruptKind OTHER_LITERAL = new InterruptKind(OTHER, "Other", "Other");

	/**
	 * An array of all the '<em><b>Interrupt Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterruptKind[] VALUES_ARRAY =
		new InterruptKind[] {
			HARDWARE_INTERRUPTION_LITERAL,
			PROCESSOR_DETECTED_EXCEPTION_LITERAL,
			PROGRAMMED_EXCEPTION_LITERAL,
			UNDEF_LITERAL,
			OTHER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Interrupt Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interrupt Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterruptKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterruptKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interrupt Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterruptKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterruptKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interrupt Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterruptKind get(int value) {
		switch (value) {
			case HARDWARE_INTERRUPTION: return HARDWARE_INTERRUPTION_LITERAL;
			case PROCESSOR_DETECTED_EXCEPTION: return PROCESSOR_DETECTED_EXCEPTION_LITERAL;
			case PROGRAMMED_EXCEPTION: return PROGRAMMED_EXCEPTION_LITERAL;
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
	private InterruptKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //InterruptKind
