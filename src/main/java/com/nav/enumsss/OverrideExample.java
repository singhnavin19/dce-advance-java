package com.nav.enumsss;

class Parent {
	
	@TestForPract
	public void sayHello() {
		System.out.println("hello parent");
	}
}

class Child extends Parent{
	
	@Override
	public void sayHello() {
		System.out.println("Hello from child");
	}
}
public class OverrideExample {
	
	@SuppressWarnings("laxmi")
	Integer i=new Integer(10);
	
}

