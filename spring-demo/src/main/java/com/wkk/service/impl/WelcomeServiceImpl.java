package com.wkk.service.impl;

import com.wkk.service.WelcomeService;

/**
 * @author weikunkun
 * @since 2021/4/19
 */
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println("welcome : " + name);
		return "success";
	}
}
