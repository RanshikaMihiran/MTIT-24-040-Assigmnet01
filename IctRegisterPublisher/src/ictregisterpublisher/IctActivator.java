package ictregisterpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class IctActivator implements BundleActivator {

ServiceRegistration IctServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		   System.out.println("ICT Publisher Started");
            IctPublisher ictPublisher = new IctPublishImpl();
            IctServiceRegistration = context.registerService(IctPublisher.class.getName(), ictPublisher, null);		
	}

	public void stop(BundleContext Context) throws Exception {
		   System.out.println("ICT Publisher Stopped");
		
	}

}