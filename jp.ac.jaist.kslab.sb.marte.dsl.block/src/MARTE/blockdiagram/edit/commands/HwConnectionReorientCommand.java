package MARTE.blockdiagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import MARTE.MARTE_DesignModel.HRM.HwDiagram.HwBlockDiagram;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwConnection;
import MARTE.MARTE_DesignModel.HRM.HwLogical.HwCommunication.HwEndPoint;
import MARTE.blockdiagram.edit.policies.MARTE_sbBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class HwConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public HwConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof HwConnection) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof HwEndPoint && newEnd instanceof HwEndPoint)) {
			return false;
		}
		if (getLink().getEndPoints().size() != 1) {
			return false;
		}
		HwEndPoint target = (HwEndPoint) getLink()
				.getEndPoints().get(0);
		if (!(getLink().eContainer() instanceof HwBlockDiagram)) {
			return false;
		}
		HwBlockDiagram container = (HwBlockDiagram) getLink()
				.eContainer();
		return MARTE_sbBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistHwConnection_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof HwEndPoint && newEnd instanceof HwEndPoint)) {
			return false;
		}
		if (getLink().getEndPoints().size() != 1) {
			return false;
		}
		HwEndPoint source = (HwEndPoint) getLink()
				.getEndPoints().get(0);
		if (!(getLink().eContainer() instanceof HwBlockDiagram)) {
			return false;
		}
		HwBlockDiagram container = (HwBlockDiagram) getLink()
				.eContainer();
		return MARTE_sbBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistHwConnection_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getEndPoints().remove(getOldSource());
		getLink().getEndPoints().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getEndPoints().remove(getOldTarget());
		getLink().getEndPoints().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected HwConnection getLink() {
		return (HwConnection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected HwEndPoint getOldSource() {
		return (HwEndPoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected HwEndPoint getNewSource() {
		return (HwEndPoint) newEnd;
	}

	/**
	 * @generated
	 */
	protected HwEndPoint getOldTarget() {
		return (HwEndPoint) oldEnd;
	}

	/**
	 * @generated
	 */
	protected HwEndPoint getNewTarget() {
		return (HwEndPoint) newEnd;
	}
}
