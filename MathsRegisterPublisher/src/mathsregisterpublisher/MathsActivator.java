package mathsregisterpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class MathsActivator implements BundleActivator {

ServiceRegistration mathsServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		   System.out.println("Maths Publisher Started");
            MathsPublisher MathsPublisher = new MathsPublisherImpl();
            mathsServiceRegistration = context.registerService(MathsPublisher.class.getName(), MathsPublisher, null);		
	}

	public void stop(BundleContext Context) throws Exception {
		   System.out.println("Maths Publisher Stopped");
		
	}

}