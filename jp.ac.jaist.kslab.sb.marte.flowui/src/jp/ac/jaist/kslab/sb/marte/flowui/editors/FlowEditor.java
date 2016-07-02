package jp.ac.jaist.kslab.sb.marte.flowui.editors;

import jp.ac.jaist.kslab.sb.marte.merge.executor.WorkflowExecutor;
import jp.ac.jaist.kslab.sb.marte.merge.executor.WorkflowExecutor_mwe2;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class FlowEditor extends EditorPart {
	private static final String BLOCK_FILE_EXTENSION = "blockdiagram";
	private static final String CIRCUIT_FILE_EXTENSION = "circuit";
	private static final String HARDWARE_FILE_EXTENSION = "xmi";
	private static final String GATEWAY_FILE_EXTENSION = "xmi";
	private static final String APPLICATION_FILE_EXTENSION = "xmi";
	private static final String SPEC_FILE_EXTENSION = "spec";
	

	public static final String ID = "jp.ac.jaist.kslab.sb.marte.flowui.editors.FlowEditor"; //$NON-NLS-1$
	private Text text_blockfile;
	private Text text_circuitfile;
	private Text text_gatewayfile;
	private Text text_applicationfile;
	private Table table_specfiles;
	private Table table_code;
	private Text text_hardwarefile;
	
	private IFile blockFile;
	private IFile circuitFile;
	private IFile hardwareFile;
	private IFile gatewayFile;
	private IFile applicationFile;
	private java.util.List<IFile> datasheetFiles;
	
	
	private WorkflowExecutor executor;

	public FlowEditor() {
		executor = new WorkflowExecutor();
		
	}

	/**
	 * Create contents of the editor part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout gl_container = new GridLayout(3, false);
		gl_container.marginHeight = 20;
		gl_container.marginWidth = 20;
		container.setLayout(gl_container);
		
		table_specfiles = new Table(container, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION);
		table_specfiles.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		table_specfiles.setHeaderVisible(true);
		table_specfiles.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table_specfiles, SWT.NONE);
		tblclmnNewColumn.setResizable(false);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("model files");
		
		try {
			((IFileEditorInput)getEditorInput()).getFile().getProject().accept(new IResourceVisitor() {
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if(resource.getType() == IResource.FILE && resource.getName().endsWith(SPEC_FILE_EXTENSION)){
						TableItem item = new TableItem(table_specfiles, SWT.None);
						item.setText(resource.getName());
						return false;
					}
					return true;
				}
			});
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, true, 1, 1));
		composite.setLayout(new GridLayout(9, false));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Label lblSoftModel = new Label(composite, SWT.NONE);
		lblSoftModel.setText("Application Model");
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Label lblBlockdiagram = new Label(composite, SWT.NONE);
		lblBlockdiagram.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false, 1, 1));
		lblBlockdiagram.setText("Block Model");
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		text_applicationfile = new Text(composite, SWT.BORDER);
		text_applicationfile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_2 = new Label(composite, SWT.NONE);
		lblNewLabel_2.setText("+");
		new Label(composite, SWT.NONE);
		
		text_blockfile = new Text(composite, SWT.BORDER);
		GridData gd_text_blockfile = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		gd_text_blockfile.widthHint = 69;
		text_blockfile.setLayoutData(gd_text_blockfile);
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("+");
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Button button_applicationModel = new Button(composite, SWT.NONE);

		button_applicationModel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		button_applicationModel.setText("...");
		
		Label label_5 = new Label(composite, SWT.NONE);
		label_5.setText(" | ");
		new Label(composite, SWT.NONE);
		
		Link link_createBlock = new Link(composite, SWT.NONE);
		link_createBlock.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		link_createBlock.setText("<a>create</a>");
		
		Button button_blockModel = new Button(composite, SWT.NONE);

		button_blockModel.setText("...");
		
		Label label_4 = new Label(composite, SWT.NONE);
		label_4.setText(" |");
		new Label(composite, SWT.NONE);
		
		Label lblHrm = new Label(composite, SWT.NONE);
		lblHrm.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false, 1, 1));
		lblHrm.setText("Hardware Model");
		new Label(composite, SWT.NONE);
		
		Label lblSrm = new Label(composite, SWT.NONE);
		lblSrm.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false, 1, 1));
		lblSrm.setText("Gateway Model");
		
		Label label_6 = new Label(composite, SWT.NONE);
		label_6.setText(" |");
		new Label(composite, SWT.NONE);
		
		Label label_8 = new Label(composite, SWT.NONE);
		label_8.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 2, 1));
		label_8.setText("---------------------");
		
		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("+-");
		
		Button button_merge = new Button(composite, SWT.NONE);

		button_merge.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		button_merge.setText("->");
		
		text_hardwarefile = new Text(composite, SWT.BORDER);
		text_hardwarefile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button button_transform = new Button(composite, SWT.NONE);

		button_transform.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		button_transform.setText("->");
		
		text_gatewayfile = new Text(composite, SWT.BORDER);
		text_gatewayfile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label label_2 = new Label(composite, SWT.NONE);
		label_2.setText("+");
		
		Button button_codeGen = new Button(composite, SWT.NONE);
		button_codeGen.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));

		button_codeGen.setText("->");
		
		Label lblCircuitModel = new Label(composite, SWT.NONE);
		lblCircuitModel.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, false, false, 1, 1));
		lblCircuitModel.setText("Circuit Model");
		new Label(composite, SWT.NONE);
		
		Label label_7 = new Label(composite, SWT.NONE);
		label_7.setText(" |");
		
		Label lblMerge = new Label(composite, SWT.NONE);
		lblMerge.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 2));
		lblMerge.setText("merge");
		
		Button button_hardwaremodel = new Button(composite, SWT.NONE);

		button_hardwaremodel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		button_hardwaremodel.setText("...");
		
		Label lblTransform = new Label(composite, SWT.NONE);
		lblTransform.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 2));
		lblTransform.setText("Transform");
		
		Button button_gatewayModel = new Button(composite, SWT.NONE);

		button_gatewayModel.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 2));
		button_gatewayModel.setText("...");
		new Label(composite, SWT.NONE);
		
		Label lblCode = new Label(composite, SWT.NONE);
		lblCode.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 2));
		lblCode.setText("Code\r\nGenerate");
		
		text_circuitfile = new Text(composite, SWT.BORDER);
		text_circuitfile.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		
		Label label_3 = new Label(composite, SWT.NONE);
		label_3.setText("+");
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Link link_createCircuit = new Link(composite, SWT.NONE);
		link_createCircuit.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		link_createCircuit.setText("<a>create</a>");
		
		Button button_circuitModel = new Button(composite, SWT.NONE);

		button_circuitModel.setText("...");
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		table_code = new Table(container, SWT.BORDER | SWT.FULL_SELECTION);
		GridData gd_table_code = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_table_code.widthHint = 134;
		table_code.setLayoutData(gd_table_code);
		table_code.setHeaderVisible(true);
		table_code.setLinesVisible(true);
		
		TableColumn tblclmnCodeFiles = new TableColumn(table_code, SWT.NONE);
		tblclmnCodeFiles.setWidth(129);
		tblclmnCodeFiles.setText("code files");
		
// actions
		button_blockModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceDialog dialog = new ResourceDialog(getSite().getShell(), (IFileEditorInput)getEditorInput(), BLOCK_FILE_EXTENSION);
				if(dialog.open()==IDialogConstants.OK_ID){
					blockFile = dialog.getFile();
					text_blockfile.setText(blockFile.getName());
				}
			}
		});
		button_circuitModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceDialog dialog = new ResourceDialog(getSite().getShell(), (IFileEditorInput)getEditorInput(), CIRCUIT_FILE_EXTENSION);
				if(dialog.open()==IDialogConstants.OK_ID){
					circuitFile = dialog.getFile();
					text_circuitfile.setText(circuitFile.getName());
				}
			}
		});
		button_hardwaremodel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceDialog dialog = new ResourceDialog(getSite().getShell(), (IFileEditorInput)getEditorInput(), HARDWARE_FILE_EXTENSION);
				if(dialog.open()==IDialogConstants.OK_ID){
					hardwareFile = dialog.getFile();
					text_hardwarefile.setText(hardwareFile.getName());
				}
			}
		});
		button_gatewayModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceDialog dialog = new ResourceDialog(getSite().getShell(), (IFileEditorInput)getEditorInput(), GATEWAY_FILE_EXTENSION);
				if(dialog.open()==IDialogConstants.OK_ID){
					gatewayFile = dialog.getFile();
					text_gatewayfile.setText(gatewayFile.getName());
				}
			}
		});
		button_applicationModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceDialog dialog = new ResourceDialog(getSite().getShell(), (IFileEditorInput)getEditorInput(), APPLICATION_FILE_EXTENSION);
				if(dialog.open()==IDialogConstants.OK_ID){
					applicationFile = dialog.getFile();
					text_applicationfile.setText(applicationFile.getName());
				}
			}
		});
		button_merge.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//check textbox
				String output;
				String circuit = "/"+getProjectName()+"/model/"+text_circuitfile.getText();
				String block = "/"+getProjectName()+"/model/"+text_blockfile.getText();
				if(text_hardwarefile.getText()==null || text_hardwarefile.getText().trim().length()==0){
					output = "/"+getProjectName()+"/genmodel/hardware.xmi";
					executor.runMergeWF(getModelPath(),circuit, block, output);
					text_hardwarefile.setText(output);
				}else{
					output = text_hardwarefile.getText();
					executor.runMergeWF(getModelPath(), circuit,block, text_hardwarefile.getText());
				}
			}
		});
		
		button_transform.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(text_hardwarefile.getText().length()==0){return;}
				String output;
				if(text_gatewayfile.getText()==null || text_gatewayfile.getText().trim().length()==0){
					output = "/"+getProjectName()+"/genmodel/gateway.xmi";
					executor.runToGatewayWF(text_hardwarefile.getText(), output);
					text_gatewayfile.setText(output);
				}else{
					executor.runToGatewayWF(text_hardwarefile.getText(), text_gatewayfile.getText());					
				}
				
			}
		});
		button_codeGen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(text_gatewayfile.getText().length()==0){return;}
				String umlUri = "/"+getProjectName()+"/genmodel/uml.xmi";
				executor.runToUMLWF(text_gatewayfile.getText(), umlUri);
				executor.runCodeGenerateWF(umlUri, getSrcPath());
				
				// add codes to table_code
				try {
					getProject().getFolder("src").accept(new IResourceVisitor() {
						@Override
						public boolean visit(IResource resource) throws CoreException {
							if(resource.getType()==IResource.FILE){
								TableItem item = new TableItem(table_code, SWT.None);
								item.setText(resource.getName());
								return false;
							}
							return true;
						}
					});
				} catch (CoreException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// Do the Save operation
	}

	@Override
	public void doSaveAs() {
		// Do the Save As operation
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		// Initialize the editor part
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	private String getProjectName(){
		return getProject().getName();
	}
	private String getModelPath(){
		return getProject().getLocationURI().getPath()+"/model/";
	}
	private String getSrcPath(){
		return getProject().getLocationURI().getPath()+"/src";
	}
	private IProject getProject(){
		return ((IFileEditorInput)this.getEditorInput()).getFile().getProject();
	}
}
