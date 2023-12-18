package com.jsp.ems.intializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.jsp.ems.configuration.ConfigurationClass;

public class WebIntilaizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class [] {ConfigurationClass.class}; 
	}

	
	protected String[] getServletMappings() {
		
		return new String [] {"/"}; 
	}

}
