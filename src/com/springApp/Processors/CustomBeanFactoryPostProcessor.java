package com.springApp.Processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
/*
 * Implement the below methods of teh interface BeanFactoryPostProcessor 
 * to enable actions before and after bean initialisation
 * 1) postProcessAfterInitialization
 * 
 * Implementing this class and defining it in the app spring xml will enable 
 * the bean actions within the implimented methods, before and after bean initialisation
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("postProcessBeanFactory() : arg0.getSingletonNames() :" + arg0.getSingletonNames());
		
	}

}
