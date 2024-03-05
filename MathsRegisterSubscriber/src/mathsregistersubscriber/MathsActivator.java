package mathsregistersubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import mathsregisterpublisher.MathsPublisher;

public class MathsActivator implements BundleActivator {


    ServiceReference serviceReference;
    Scanner sc = new Scanner(System.in);

	public void start(BundleContext context) throws Exception {
			System.out.println("Started Maths Subscriber");
	          serviceReference = context.getServiceReference(MathsPublisher.class.getName());
			
	          MathsPublisher mahtsPublisher = (MathsPublisher)context.getService(serviceReference);
		     MathsSubscriber mathsSubscriber = new MathsSubscriberImpl();
		     mathsSubscriber.getService(mahtsPublisher);     
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopped Maths Subscriber");
	
	}

}