package jp.ac.jaist.kslab.sb.marte.merge;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {
	public static final String PLUGIN_ID = "jp.ac.jaist.kslab.sb.marte.merge";
	private static Activator plugin;
	
	public Activator(){
		
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	public static Activator getDefalut(){
		return plugin;
	}
}
