package englishregisterpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class EnglishActivator implements BundleActivator {


	ServiceRegistration englishServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		   System.out.println("English Publisher Started");
            EnglishPublisher englishPublisher = new EnglishPublishImpl();
            englishServiceRegistration = context.registerService(EnglishPublisher.class.getName(), englishPublisher, null);		
	}

	public void stop(BundleContext Context) throws Exception {
		   System.out.println("English Publisher Stopped");
		
	}

}