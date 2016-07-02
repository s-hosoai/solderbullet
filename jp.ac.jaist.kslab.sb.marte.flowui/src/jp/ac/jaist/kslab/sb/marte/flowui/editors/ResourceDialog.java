package jp.ac.jaist.kslab.sb.marte.flowui.editors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class ResourceDialog extends Dialog {
	private Button button;
	private IFileEditorInput input;
	private String extension;
	private IFile selectionFile;
	
	private List list;
	

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public ResourceDialog(Shell parentShell, IFileEditorInput input, String extension) {
		super(parentShell);
		this.input = input;
		this.extension = extension;
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		FillLayout fl_container = new FillLayout(SWT.HORIZONTAL);
		fl_container.marginWidth = 20;
		fl_container.marginHeight = 20;
		container.setLayout(fl_container);
		
		list = new List(container, SWT.BORDER);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				if(list.getSelectionCount()==1&&list.getSelection()[0]!=null){
					fileSelect();
					okPressed();
				}
			}
		});
		list.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(list.getSelectionCount()==1&&list.getSelection()[0]!=null){
					fileSelect();
				}
			}
		});
		
		IProject prj = input.getFile().getProject();
		try {
			prj.accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource resource) throws CoreException {
					switch(resource.getType()){
					case IResource.FILE:
						if(resource.getName().endsWith(extension)){
							list.add(resource.getFullPath().toString());
						}
						return false;
					}
					return true;
				}
			});
		} catch (CoreException e1) {
			e1.printStackTrace();
		}
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		button = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		button.setEnabled(false);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}
	
	public IFile getFile(){
		return this.selectionFile;
	}
	
	private void fileSelect(){
		button.setEnabled(true);
		String filepath = list.getSelection()[0];
		selectionFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filepath));
	}
}
