package MARTE.blockdiagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import MARTE.blockdiagram.edit.commands.HwDeviceCreateCommand;
import MARTE.blockdiagram.edit.commands.HwMCUCreateCommand;
import MARTE.blockdiagram.providers.MARTE_sbElementTypes;

/**
 * @generated
 */
public class HwBlockDiagramItemSemanticEditPolicy extends
		MARTE_sbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HwBlockDiagramItemSemanticEditPolicy() {
		super(MARTE_sbElementTypes.HwBlockDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MARTE_sbElementTypes.HwMCU_2001 == req.getElementType()) {
			return getGEFWrapper(new HwMCUCreateCommand(req));
		}
		if (MARTE_sbElementTypes.HwDevice_2002 == req.getElementType()) {
			return getGEFWrapper(new HwDeviceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
