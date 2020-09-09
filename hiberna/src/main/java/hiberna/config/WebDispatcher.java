package hiberna.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebDispatcher implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
	AnnotationConfigWebApplicationContext context =new AnnotationConfigWebApplicationContext();
	context.register(WebConfiguration.class);
		
		DispatcherServlet dispatcherServlet=new DispatcherServlet(context);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);
		dispatcher.addMapping("/");
		
	}

}
