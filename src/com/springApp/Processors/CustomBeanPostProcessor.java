package com.springApp.Processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/*
 * Implement the below methods of teh interface BeanPostProcessor 
 * to enable actions before and after bean initialisation
 * 1) postProcessAfterInitialization
 * 2) postProcessBeforeInitialization
 * 
 * Implementing this class and defining it in the app spring xml will enable 
 * the bean actions within the implimented methods, before and after bean initialisation
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("postProcessAfterInitialization ::::BeanName : " + beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("postProcessBeforeInitialization ::::BeanName : " + beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

}
