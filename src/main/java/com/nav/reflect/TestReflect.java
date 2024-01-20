package com.nav.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Suraj{
	static {
		System.out.println("hello i am static block");
	}
	Suraj(){
		System.out.println("I am constructor of suraj class");
	}
	void sayHello() {
		System.out.println("hello");
	}
}

public class TestReflect {	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class c=Class.forName("com.nav.reflect.Suraj");
		c.newInstance();
		
//		System.out.println(c.getSuperclass());
//		for(Method m:c.getMethods()) {
//			System.out.println(m.getName());
//		}
		
	}

}
