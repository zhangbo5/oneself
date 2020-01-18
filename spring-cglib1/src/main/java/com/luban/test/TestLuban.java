package com.luban.test;

import com.luban.app.AppConfig;
import com.luban.service.CityService;
import com.luban.service.TestService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLuban {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext
				annotationConfigApplicationContext
				= new AnnotationConfigApplicationContext(AppConfig.class);
//		annotationConfigApplicationContext.refresh();
		TestService bean = annotationConfigApplicationContext.getBean(TestService.class);
		System.out.println(bean);
	}
}
