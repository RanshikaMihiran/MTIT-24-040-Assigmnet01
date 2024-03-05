package ictregistersubscriber;

import org.osgi.framework.BundleActivator;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import ictregisterpublisher.IctPublisher;


public class IctActivator implements BundleActivator {

	  ServiceReference serviceReference;
      Scanner sc = new Scanner(System.in);

	public void start(BundleContext context) throws Exception {
			System.out.println("Started Ict Subscriber");
	          serviceReference = context.getServiceReference(IctPublisher.class.getName());
			
	          IctPublisher ictPublisher = (IctPublisher)context.getService(serviceReference);
	          IctSubscriber ictSubscriber = new IctSubscriberImpl();
	          
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stopped Ict Subscriber");
		context.ungetService(serviceReference);
	
	}

}