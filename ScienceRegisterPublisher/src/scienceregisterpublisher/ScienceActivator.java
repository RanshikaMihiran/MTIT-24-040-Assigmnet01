package scienceregisterpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ScienceActivator implements BundleActivator {

	ServiceRegistration ScienceServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		   System.out.println("Science Publisher Started");
            SciencePublisher SciencePublisher = new SciencePublisherImpl();
            ScienceServiceRegistration = context.registerService(SciencePublisher.class.getName(), SciencePublisher, null);		
	}

	public void stop(BundleContext Context) throws Exception {
		   System.out.println("Science Publisher Stopped");
		
	}

}