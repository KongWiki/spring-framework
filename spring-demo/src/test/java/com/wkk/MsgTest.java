package com.wkk;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * @author weikunkun
 * @since 2021/5/18
 */
public class MsgTest {
	@Test
	public void testLoad() {
		String xmlPath = "spring-config.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
		Msg msg = (Msg) context.getBean("msg");
		msg.say();
	}
}