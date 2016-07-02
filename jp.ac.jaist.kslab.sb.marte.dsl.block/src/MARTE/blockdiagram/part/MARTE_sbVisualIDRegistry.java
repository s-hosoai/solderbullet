package MARTE.blockdiagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram;
import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage;
import MARTE.blockdiagram.edit.parts.HwBlockDiagramEditPart;
import MARTE.blockdiagram.edit.parts.HwConnectionEditPart;
import MARTE.blockdiagram.edit.parts.HwDeviceEditPart;
import MARTE.blockdiagram.edit.parts.HwDeviceNameEditPart;
import MARTE.blockdiagram.edit.parts.HwMCUEditPart;
import MARTE.blockdiagram.edit.parts.HwMCUNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MARTE_sbVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "jp.ac.jaist.kslab.sb.marte.dsl.block/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (HwBlockDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return HwBlockDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return MARTE.blockdiagram.part.MARTE_sbVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				MARTE_sbDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (HwDiagramPackage.eINSTANCE
				.getHwBlockDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((HwBlockDiagram) domainElement)) {
			return HwBlockDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = MARTE.blockdiagram.part.MARTE_sbVisualIDRegistry
				.getModelID(containerView);
		if (!HwBlockDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (HwBlockDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = MARTE.blockdiagram.part.MARTE_sbVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HwBlockDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case HwBlockDiagramEditPart.VISUAL_ID:
			if (HwComputingPackage.eINSTANCE
					.getHwMCU().isSuperTypeOf(domainElement.eClass())) {
				return HwMCUEditPart.VISUAL_ID;
			}
			if (HwDevicePackage.eINSTANCE
					.getHwDevice().isSuperTypeOf(domainElement.eClass())) {
				return HwDeviceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = MARTE.blockdiagram.part.MARTE_sbVisualIDRegistry
				.getModelID(containerView);
		if (!HwBlockDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (HwBlockDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = MARTE.blockdiagram.part.MARTE_sbVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = HwBlockDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case HwBlockDiagramEditPart.VISUAL_ID:
			if (HwMCUEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HwDeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HwMCUEditPart.VISUAL_ID:
			if (HwMCUNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HwDeviceEditPart.VISUAL_ID:
			if (HwDeviceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (HwCommunicationPackage.eINSTANCE
				.getHwConnection().isSuperTypeOf(domainElement.eClass())) {
			return HwConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			HwBlockDiagram element) {
		return true;
	}

}
