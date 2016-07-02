package blockdiagram.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import blockdiagram.BlockdiagramPackage;
import blockdiagram.Connection;
import blockdiagram.Device;
import blockdiagram.Diagram;
import blockdiagram.HwComponent;
import blockdiagram.diagram.edit.parts.ConnectionEditPart;
import blockdiagram.diagram.edit.parts.DeviceEditPart;
import blockdiagram.diagram.edit.parts.DiagramEditPart;
import blockdiagram.diagram.edit.parts.MCUEditPart;
import blockdiagram.diagram.providers.BlockDiagramElementTypes;

/**
 * @generated
 */
public class BlockDiagramDiagramUpdater {

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramNodeDescriptor]*/getSemanticChildren(
			View view) {
		switch (BlockDiagramVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramNodeDescriptor]*/getDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Diagram modelElement = (Diagram) view.getElement();
		LinkedList/*[blockdiagram.diagram.part.BlockDiagramNodeDescriptor]*/result = new LinkedList/*[blockdiagram.diagram.part.BlockDiagramNodeDescriptor]*/();
		for (Iterator/*[?]*/it = modelElement.getCom().iterator(); it
				.hasNext();) {
			HwComponent childElement = (HwComponent) it.next();
			int visualID = BlockDiagramVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new BlockDiagramNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == MCUEditPart.VISUAL_ID) {
				result.add(new BlockDiagramNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getContainedLinks(
			View view) {
		switch (BlockDiagramVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2001ContainedLinks(view);
		case MCUEditPart.VISUAL_ID:
			return getMCU_2002ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getIncomingLinks(
			View view) {
		switch (BlockDiagramVisualIDRegistry.getVisualID(view)) {
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2001IncomingLinks(view);
		case MCUEditPart.VISUAL_ID:
			return getMCU_2002IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getOutgoingLinks(
			View view) {
		switch (BlockDiagramVisualIDRegistry.getVisualID(view)) {
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2001OutgoingLinks(view);
		case MCUEditPart.VISUAL_ID:
			return getMCU_2002OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getDiagram_1000ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getDevice_2001ContainedLinks(
			View view) {
		Device modelElement = (Device) view.getElement();
		LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/result = new LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getMCU_2002ContainedLinks(
			View view) {
		blockdiagram.MCU modelElement = (blockdiagram.MCU) view.getElement();
		LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/result = new LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getConnection_4001ContainedLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getDevice_2001IncomingLinks(
			View view) {
		Device modelElement = (Device) view.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/result = new LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getMCU_2002IncomingLinks(
			View view) {
		blockdiagram.MCU modelElement = (blockdiagram.MCU) view.getElement();
		Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/result = new LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getConnection_4001IncomingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getDevice_2001OutgoingLinks(
			View view) {
		Device modelElement = (Device) view.getElement();
		LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/result = new LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getMCU_2002OutgoingLinks(
			View view) {
		blockdiagram.MCU modelElement = (blockdiagram.MCU) view.getElement();
		LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/result = new LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getConnection_4001OutgoingLinks(
			View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getContainedTypeModelFacetLinks_Connection_4001(
			HwComponent container) {
		LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/result = new LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/();
		for (Iterator/*[?]*/links = container.getConection().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != BlockDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			HwComponent dst = link.getRef();
			result.add(new BlockDiagramLinkDescriptor(container, dst, link,
					BlockDiagramElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/getIncomingTypeModelFacetLinks_Connection_4001(
			HwComponent target,
			Map/*[org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>]*/crossReferences) {
		LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/result = new LinkedList/*[blockdiagram.diagram.part.BlockDiagramLinkDescriptor]*/();
		Collection/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/settings = (Collection) crossReferences
				.get(target);
		for (Iterator/*[org.eclipse.emf.ecore.EStructuralFeature.Setting]*/it = settings
				.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != BlockdiagramPackage.eINSTANCE
					.getConnection_Ref()
					|| false == setting.getEObject() instanceof Connection) {
				continue;
			}
			Connection link = (Connection) setting.getEObject();
			if (ConnectionEditPart.VISUAL_ID != BlockDiagramVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof HwComponent) {
				continue;
			}
			HwComponent container = (HwComponent) link.eContainer();
			result.add(new BlockDiagramLinkDescriptor(container, target, link,
					BlockDiagramElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));

		}
		return result;
	}

}
