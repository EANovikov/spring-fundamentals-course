package com.xevgnov;

import com.xevgnov.service.DateTimeService;
import com.xevgnov.service.DateTimeServiceImpl;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class JavaConfigWebApplicationInitializer implements WebApplicationInitializer {

    //    public void onStartup(ServletContext container) {
    //        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
    //        context.registerShutdownHook();
    //        context.register(ApplicationConfig.class);
    //        context.setServletContext(container);
    //        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(context));
    //        servlet.setLoadOnStartup(1);
    //        servlet.addMapping("/");
    //        context.refresh();
    //        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
    //        System.out.println("Printing date/time: " + dateTimeService.getDateTime());
    //    }

    public void onStartup(ServletContext container) {
        XmlWebApplicationContext context = new XmlWebApplicationContext();
        context.registerShutdownHook();
        context.setConfigLocation("/WEB-INF/application-config.xml");
        context.setServletContext(container);
        ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
        context.refresh();
        DateTimeService dateTimeService = context.getBean(DateTimeServiceImpl.class);
        System.out.println("Printing date/time: " + dateTimeService.getDateTime());
    }
}
