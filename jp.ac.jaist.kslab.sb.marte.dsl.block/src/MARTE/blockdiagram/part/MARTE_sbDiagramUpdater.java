package MARTE.blockdiagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;


import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram;
import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwResource;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwConnection;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint;
import MARTE.blockdiagram.edit.parts.HwBlockDiagramEditPart;
import MARTE.blockdiagram.edit.parts.HwConnectionEditPart;
import MARTE.blockdiagram.edit.parts.HwDeviceEditPart;
import MARTE.blockdiagram.edit.parts.HwMCUEditPart;
import MARTE.blockdiagram.providers.MARTE_sbElementTypes;

/**
 * @generated
 */
public class MARTE_sbDiagramUpdater {

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbNodeDescriptor]*/getSemanticChildren(
			View view) {
		switch (MARTE_sbVisualIDRegistry.getVisualID(view)) {
		case HwBlockDiagramEditPart.VISUAL_ID:
			return getHwBlockDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbNodeDescriptor]*/getHwBlockDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		HwBlockDiagram modelElement = (HwBlockDiagram) view
				.getElement();
		LinkedList/*[MARTE.blockdiagram.part.MARTE_sbNodeDescriptor]*/result = new LinkedList/*[MARTE.blockdiagram.part.MARTE_sbNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			HwResource childElement = (HwResource) it
					.next();
			int visualID = MARTE_sbVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HwMCUEditPart.VISUAL_ID) {
				result.add(new MARTE_sbNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HwDeviceEditPart.VISUAL_ID) {
				result.add(new MARTE_sbNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getContainedLinks(
			View view) {
		switch (MARTE_sbVisualIDRegistry.getVisualID(view)) {
		case HwBlockDiagramEditPart.VISUAL_ID:
			return getHwBlockDiagram_1000ContainedLinks(view);
		case HwMCUEditPart.VISUAL_ID:
			return getHwMCU_2001ContainedLinks(view);
		case HwDeviceEditPart.VISUAL_ID:
			return getHwDevice_2002ContainedLinks(view);
		case HwConnectionEditPart.VISUAL_ID:
			return getHwConnection_4001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getIncomingLinks(
			View view) {
		switch (MARTE_sbVisualIDRegistry.getVisualID(view)) {
		case HwMCUEditPart.VISUAL_ID:
			return getHwMCU_2001IncomingLinks(view);
		case HwDeviceEditPart.VISUAL_ID:
			return getHwDevice_2002IncomingLinks(view);
		case HwConnectionEditPart.VISUAL_ID:
			return getHwConnection_4001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getOutgoingLinks(
			View view) {
		switch (MARTE_sbVisualIDRegistry.getVisualID(view)) {
		case HwMCUEditPart.VISUAL_ID:
			return getHwMCU_2001OutgoingLinks(view);
		case HwDeviceEditPart.VISUAL_ID:
			return getHwDevice_2002OutgoingLinks(view);
		case HwConnectionEditPart.VISUAL_ID:
			return getHwConnection_4001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwBlockDiagram_1000ContainedLinks(
			View view) {
		HwBlockDiagram modelElement = (HwBlockDiagram) view
				.getElement();
		LinkedList/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/result = new LinkedList/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_HwConnection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwMCU_2001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwDevice_2002ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwConnection_4001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwMCU_2001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwDevice_2002IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwConnection_4001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwMCU_2001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwDevice_2002OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getHwConnection_4001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/getContainedTypeModelFacetLinks_HwConnection_4001(
			HwBlockDiagram container) {
		LinkedList/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/result = new LinkedList/*[MARTE.blockdiagram.part.MARTE_sbLinkDescriptor]*/();
		for (Iterator/*[?]*/links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof HwConnection) {
				continue;
			}
			HwConnection link = (HwConnection) linkObject;
			if (HwConnectionEditPart.VISUAL_ID != MARTE_sbVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getEndPoints();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof HwEndPoint) {
				continue;
			}
			HwEndPoint dst = (HwEndPoint) theTarget;
			List sources = link.getEndPoints();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof HwEndPoint) {
				continue;
			}
			HwEndPoint src = (HwEndPoint) theSource;
			result.add(new MARTE_sbLinkDescriptor(src, dst, link,
					MARTE_sbElementTypes.HwConnection_4001,
					HwConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

}
