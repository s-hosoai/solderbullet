package MARTE.blockdiagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import MARTE.blockdiagram.providers.MARTE_sbElementTypes;

/**
 * @generated
 */
public class HwConnectionItemSemanticEditPolicy extends
		MARTE_sbBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public HwConnectionItemSemanticEditPolicy() {
		super(MARTE_sbElementTypes.HwConnection_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
