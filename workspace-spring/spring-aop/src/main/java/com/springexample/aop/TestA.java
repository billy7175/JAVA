package com.springexample.aop;

import org.springframework.stereotype.Component;

@Component("testA")
public class TestA {
	
	public void doSomething1() {
		System.out.println("TestA.doSomething1");
	}	
	public void doSomething2() {
		System.out.println("TestA.doSomething2");
	}
	public void doAnother1() {
		System.out.println("TestA.doAnother1");
	}
	public void doAnother2() {
		System.out.println("TestA.doAnother1");
	}

}
