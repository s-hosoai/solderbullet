package blockdiagram.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import blockdiagram.diagram.edit.commands.DeviceCreateCommand;
import blockdiagram.diagram.edit.commands.MCUCreateCommand;
import blockdiagram.diagram.providers.BlockDiagramElementTypes;

/**
 * @generated
 */
public class DiagramItemSemanticEditPolicy extends
		BlockDiagramBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DiagramItemSemanticEditPolicy() {
		super(BlockDiagramElementTypes.Diagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BlockDiagramElementTypes.Device_2001 == req.getElementType()) {
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		if (BlockDiagramElementTypes.MCU_2002 == req.getElementType()) {
			return getGEFWrapper(new MCUCreateCommand(req));
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
