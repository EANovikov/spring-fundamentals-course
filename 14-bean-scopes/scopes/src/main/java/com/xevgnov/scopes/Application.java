package com.xevgnov.scopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.xevgnov.scopes.external.ApplicationConfigV2;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

@SpringBootApplication(scanBasePackages = "com.xevgnov.scopes.config")
public class Application implements ServletContextInitializer {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext v2Context = new AnnotationConfigWebApplicationContext();
    v2Context.register(ApplicationConfigV2.class);
    v2Context.setServletContext(servletContext);

    ServletRegistration.Dynamic servlet = servletContext.addServlet(
        "external", new DispatcherServlet(v2Context));
    servlet.setLoadOnStartup(2);
    servlet.addMapping("/v2/*");
  }

}
