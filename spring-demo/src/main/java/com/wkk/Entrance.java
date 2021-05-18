package com.wkk;

import com.wkk.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author weikunkun
 * @since 2021/4/19
 */
public class Entrance {
	public static void main(String[] args) {
		System.out.println("hello");
		String xmlPath = "spring-config.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("我是维坤坤");

	}
}
