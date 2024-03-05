package englishregistersubscriber;


import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import englishregisterpublisher.EnglishPublisher;

public class EnglishActivator implements BundleActivator {

	 ServiceReference serviceReference;
     Scanner sc = new Scanner(System.in);

	public void start(BundleContext context) throws Exception {
			System.out.println("Started English Subscriber");
	          serviceReference = context.getServiceReference(EnglishPublisher.class.getName());
			
	          EnglishPublisher englishPublisher = (EnglishPublisher)context.getService(serviceReference);
		     EnglishSubscriber englishSubscriber = new EnglishSubscriberImpl();
		     englishSubscriber.getService(englishPublisher);     
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopped English Subscriber");
		context.ungetService(serviceReference);
	
	}

}