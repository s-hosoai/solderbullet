package MARTE.blockdiagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwDiagramPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwCommunicationPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwComputing.HwComputingPackage;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwDevice.HwDevicePackage;
import MARTE.blockdiagram.edit.parts.HwBlockDiagramEditPart;
import MARTE.blockdiagram.edit.parts.HwConnectionEditPart;
import MARTE.blockdiagram.edit.parts.HwDeviceEditPart;
import MARTE.blockdiagram.edit.parts.HwMCUEditPart;
import MARTE.blockdiagram.part.MARTE_sbDiagramEditorPlugin;

/**
 * @generated
 */
public class MARTE_sbElementTypes {

	/**
	 * @generated
	 */
	private MARTE_sbElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map/*[org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement]*/elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType HwBlockDiagram_1000 = getElementType("jp.ac.jaist.kslab.sb.marte.dsl.block.HwBlockDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HwMCU_2001 = getElementType("jp.ac.jaist.kslab.sb.marte.dsl.block.HwMCU_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HwDevice_2002 = getElementType("jp.ac.jaist.kslab.sb.marte.dsl.block.HwDevice_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HwConnection_4001 = getElementType("jp.ac.jaist.kslab.sb.marte.dsl.block.HwConnection_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return MARTE_sbDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap/*[org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement]*/();

			elements.put(HwBlockDiagram_1000,
					HwDiagramPackage.eINSTANCE
							.getHwBlockDiagram());

			elements.put(
					HwMCU_2001,
					HwComputingPackage.eINSTANCE
							.getHwMCU());

			elements.put(
					HwDevice_2002,
					HwDevicePackage.eINSTANCE
							.getHwDevice());

			elements.put(
					HwConnection_4001,
					HwCommunicationPackage.eINSTANCE
							.getHwConnection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet/*[org.eclipse.gmf.runtime.emf.type.core.IElementType]*/();
			KNOWN_ELEMENT_TYPES.add(HwBlockDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(HwMCU_2001);
			KNOWN_ELEMENT_TYPES.add(HwDevice_2002);
			KNOWN_ELEMENT_TYPES.add(HwConnection_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case HwBlockDiagramEditPart.VISUAL_ID:
			return HwBlockDiagram_1000;
		case HwMCUEditPart.VISUAL_ID:
			return HwMCU_2001;
		case HwDeviceEditPart.VISUAL_ID:
			return HwDevice_2002;
		case HwConnectionEditPart.VISUAL_ID:
			return HwConnection_4001;
		}
		return null;
	}

}
