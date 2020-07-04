package com.serezha;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.Set;

public class HelloServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        ServletRegistration.Dynamic registration = ctx.addServlet("hello", HelloServlet.class);
        registration.addMapping("/hello-servlet");
    }
}