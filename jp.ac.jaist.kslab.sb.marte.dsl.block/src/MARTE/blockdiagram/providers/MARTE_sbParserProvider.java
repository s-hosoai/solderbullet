package MARTE.blockdiagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import MARTE.MARTE_DesignModel.HRM.HwGeneral.HwGeneralPackage;
import MARTE.blockdiagram.edit.parts.HwDeviceNameEditPart;
import MARTE.blockdiagram.edit.parts.HwMCUNameEditPart;
import MARTE.blockdiagram.parsers.MessageFormatParser;
import MARTE.blockdiagram.part.MARTE_sbVisualIDRegistry;

/**
 * @generated
 */
public class MARTE_sbParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser hwMCUName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getHwMCUName_5001Parser() {
		if (hwMCUName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { HwGeneralPackage.eINSTANCE
					.getHwResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hwMCUName_5001Parser = parser;
		}
		return hwMCUName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser hwDeviceName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getHwDeviceName_5002Parser() {
		if (hwDeviceName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { HwGeneralPackage.eINSTANCE
					.getHwResource_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hwDeviceName_5002Parser = parser;
		}
		return hwDeviceName_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case HwMCUNameEditPart.VISUAL_ID:
			return getHwMCUName_5001Parser();
		case HwDeviceNameEditPart.VISUAL_ID:
			return getHwDeviceName_5002Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MARTE_sbVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MARTE_sbVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MARTE_sbElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
//			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
