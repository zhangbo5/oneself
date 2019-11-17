package com.luban.test;

import com.luban.app.AppConfig;
import com.luban.service.CityService;
import com.luban.service.TestService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(AppConfig.class);
//		annotationConfigApplicationContext.refresh();
		System.out.println(annotationConfigApplicationContext.getBean(TestService.class));
	}
}
