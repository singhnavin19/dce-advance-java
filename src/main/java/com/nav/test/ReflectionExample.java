//package com.nav.test;
//
//import java.lang.reflect.Field;
//
//class Navin{
//	static {
//		System.out.println("hello Navin");
//	}
//}
//
//public class ReflectionExample {
//	
//	public static void main(String[] args) throws ClassNotFoundException {
//		System.out.println("Hi Reflection Example");
//		Class clazz=Class.forName("com.nav.test.Navin");
//		System.out.println(clazz.getName());
//		System.out.println(clazz.getSimpleName());
//		
//		for(Field f:clazz.getFields()) {
//			System.out.println(f.get);
//		}
//		
//	}
//}
