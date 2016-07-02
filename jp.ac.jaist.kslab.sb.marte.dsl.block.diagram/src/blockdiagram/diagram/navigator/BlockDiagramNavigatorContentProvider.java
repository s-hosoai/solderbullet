package blockdiagram.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import blockdiagram.diagram.edit.parts.ConnectionEditPart;
import blockdiagram.diagram.edit.parts.DeviceEditPart;
import blockdiagram.diagram.edit.parts.DiagramEditPart;
import blockdiagram.diagram.edit.parts.MCUEditPart;
import blockdiagram.diagram.part.BlockDiagramVisualIDRegistry;
import blockdiagram.diagram.part.Messages;

/**
 * @generated
 */
public class BlockDiagramNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	public BlockDiagramNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Iterator/*[org.eclipse.emf.ecore.resource.Resource]*/it = myEditingDomain
				.getResourceSet().getResources().iterator(); it.hasNext();) {
			Resource nextResource = (Resource) it.next();
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList/*[blockdiagram.diagram.navigator.BlockDiagramNavigatorItem]*/result = new ArrayList/*[blockdiagram.diagram.navigator.BlockDiagramNavigatorItem]*/();
			ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/topViews = new ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/(
					resource.getContents().size());
			for (Iterator/*[org.eclipse.emf.ecore.EObject]*/it = resource
					.getContents().iterator(); it.hasNext();) {
				EObject o = (EObject) it.next();
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof BlockDiagramNavigatorGroup) {
			BlockDiagramNavigatorGroup group = (BlockDiagramNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof BlockDiagramNavigatorItem) {
			BlockDiagramNavigatorItem navigatorItem = (BlockDiagramNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (BlockDiagramVisualIDRegistry.getVisualID(view)) {

		case ConnectionEditPart.VISUAL_ID: {
			LinkedList/*[blockdiagram.diagram.navigator.BlockDiagramAbstractNavigatorItem]*/result = new LinkedList/*[blockdiagram.diagram.navigator.BlockDiagramAbstractNavigatorItem]*/();
			Edge sv = (Edge) view;
			BlockDiagramNavigatorGroup target = new BlockDiagramNavigatorGroup(
					Messages.NavigatorGroupName_Connection_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BlockDiagramNavigatorGroup source = new BlockDiagramNavigatorGroup(
					Messages.NavigatorGroupName_Connection_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry.getType(MCUEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry.getType(MCUEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case DeviceEditPart.VISUAL_ID: {
			LinkedList/*[blockdiagram.diagram.navigator.BlockDiagramAbstractNavigatorItem]*/result = new LinkedList/*[blockdiagram.diagram.navigator.BlockDiagramAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			BlockDiagramNavigatorGroup incominglinks = new BlockDiagramNavigatorGroup(
					Messages.NavigatorGroupName_Device_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BlockDiagramNavigatorGroup outgoinglinks = new BlockDiagramNavigatorGroup(
					Messages.NavigatorGroupName_Device_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DiagramEditPart.VISUAL_ID: {
			LinkedList/*[blockdiagram.diagram.navigator.BlockDiagramAbstractNavigatorItem]*/result = new LinkedList/*[blockdiagram.diagram.navigator.BlockDiagramAbstractNavigatorItem]*/();
			Diagram sv = (Diagram) view;
			BlockDiagramNavigatorGroup links = new BlockDiagramNavigatorGroup(
					Messages.NavigatorGroupName_Diagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry
							.getType(DeviceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry.getType(MCUEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case MCUEditPart.VISUAL_ID: {
			LinkedList/*[blockdiagram.diagram.navigator.BlockDiagramAbstractNavigatorItem]*/result = new LinkedList/*[blockdiagram.diagram.navigator.BlockDiagramAbstractNavigatorItem]*/();
			Node sv = (Node) view;
			BlockDiagramNavigatorGroup incominglinks = new BlockDiagramNavigatorGroup(
					Messages.NavigatorGroupName_MCU_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BlockDiagramNavigatorGroup outgoinglinks = new BlockDiagramNavigatorGroup(
					Messages.NavigatorGroupName_MCU_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BlockDiagramVisualIDRegistry
							.getType(ConnectionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getLinksSourceByType(
			Collection/*[org.eclipse.gmf.runtime.notation.Edge]*/edges,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.Edge]*/it = edges
				.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getLinksTargetByType(
			Collection/*[org.eclipse.gmf.runtime.notation.Edge]*/edges,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.Edge]*/it = edges
				.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getOutgoingLinksByType(
			Collection/*[? extends org.eclipse.gmf.runtime.notation.View]*/nodes,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = nodes
				.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getIncomingLinksByType(
			Collection/*[? extends org.eclipse.gmf.runtime.notation.View]*/nodes,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = nodes
				.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getChildrenByType(
			Collection/*[? extends org.eclipse.gmf.runtime.notation.View]*/nodes,
			String type) {
		LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/result = new LinkedList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = nodes
				.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/getDiagramLinksByType(
			Collection/*[org.eclipse.gmf.runtime.notation.Diagram]*/diagrams,
			String type) {
		ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/result = new ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.Diagram]*/it = diagrams
				.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection/*[org.eclipse.gmf.runtime.notation.View]*/selectViewsByType(
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/views,
			String type) {
		ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/result = new ArrayList/*[org.eclipse.gmf.runtime.notation.View]*/();
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = views
				.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DiagramEditPart.MODEL_ID.equals(BlockDiagramVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection/*[blockdiagram.diagram.navigator.BlockDiagramNavigatorItem]*/createNavigatorItems(
			Collection/*[org.eclipse.gmf.runtime.notation.View]*/views,
			Object parent, boolean isLeafs) {
		ArrayList/*[blockdiagram.diagram.navigator.BlockDiagramNavigatorItem]*/result = new ArrayList/*[blockdiagram.diagram.navigator.BlockDiagramNavigatorItem]*/(
				views.size());
		for (Iterator/*[org.eclipse.gmf.runtime.notation.View]*/it = views
				.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			result.add(new BlockDiagramNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof BlockDiagramAbstractNavigatorItem) {
			BlockDiagramAbstractNavigatorItem abstractNavigatorItem = (BlockDiagramAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
