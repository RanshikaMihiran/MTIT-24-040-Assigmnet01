package scienceregistersubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import scienceregisterpublisher.SciencePublisher;

public class ScienceActivator implements BundleActivator {

	 ServiceReference serviceReference;
     Scanner sc = new Scanner(System.in);

	public void start(BundleContext context) throws Exception {
			System.out.println("Started Science Subscriber");
	          serviceReference = context.getServiceReference(SciencePublisher.class.getName());
			
			SciencePublisher sciencePublisher = (SciencePublisher)context.getService(serviceReference);
		     ScienceSubscriber scienceSubscriber = new ScienceSubscriberImpl();
		     scienceSubscriber.getService(sciencePublisher);     
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopped Science Subscriber");
		context.ungetService(serviceReference);
	
	}

}