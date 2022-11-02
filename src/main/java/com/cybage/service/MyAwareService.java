package com.cybage.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

public class MyAwareService implements ApplicationContextAware,ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,BeanNameAware, EnvironmentAware, ImportAware, ResourceLoaderAware {

	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("ResourceLoader Method");
		
	}

	public void setImportMetadata(AnnotationMetadata importMetadata) {
		System.out.println("setImportMetadata Method");
		
	}

	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment Method");
		
	}

	public void setBeanName(String name) {
		System.out.println("setBeanName Method");
		
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory Method");
		
	}

	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("setBeanClassLoader Method");
		
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("setApplicationEventPublisher Method");
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext Method");
		
	}

	
}
