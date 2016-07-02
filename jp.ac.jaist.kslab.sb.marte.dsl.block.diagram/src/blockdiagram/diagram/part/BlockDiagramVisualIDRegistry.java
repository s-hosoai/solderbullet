package blockdiagram.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import blockdiagram.BlockdiagramPackage;
import blockdiagram.diagram.edit.parts.ConnectionEditPart;
import blockdiagram.diagram.edit.parts.ConnectionNameEditPart;
import blockdiagram.diagram.edit.parts.DeviceEditPart;
import blockdiagram.diagram.edit.parts.DeviceNameEditPart;
import blockdiagram.diagram.edit.parts.DiagramEditPart;
import blockdiagram.diagram.edit.parts.MCUEditPart;
import blockdiagram.diagram.edit.parts.MCUNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class BlockDiagramVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "jp.ac.jaist.kslab.sb.marte.dsl.block.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return blockdiagram.diagram.part.BlockDiagramVisualIDRegistry
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
				BlockDiagramDiagramEditorPlugin.getInstance().logError(
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
		if (BlockdiagramPackage.eINSTANCE.getDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((blockdiagram.Diagram) domainElement)) {
			return DiagramEditPart.VISUAL_ID;
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
		String containerModelID = blockdiagram.diagram.part.BlockDiagramVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = blockdiagram.diagram.part.BlockDiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DiagramEditPart.VISUAL_ID:
			if (BlockdiagramPackage.eINSTANCE.getDevice().isSuperTypeOf(
					domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (BlockdiagramPackage.eINSTANCE.getMCU().isSuperTypeOf(
					domainElement.eClass())) {
				return MCUEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = blockdiagram.diagram.part.BlockDiagramVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = blockdiagram.diagram.part.BlockDiagramVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case DiagramEditPart.VISUAL_ID:
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MCUEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (DeviceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MCUEditPart.VISUAL_ID:
			if (MCUNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionEditPart.VISUAL_ID:
			if (ConnectionNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (BlockdiagramPackage.eINSTANCE.getConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return ConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(blockdiagram.Diagram element) {
		return true;
	}

}
