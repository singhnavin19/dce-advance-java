package com.nav.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface SayHello {
	void sayHello();
}

@FunctionalInterface
interface SayByeBye {
	void sayByeBye(String name);
}

@FunctionalInterface
interface MethodWithReturnAndArgs {
	String sayHelloAndByeBye(String name);
}

public class LambdaBasic {
	public static void main(String[] args) {

//		sayHello h=new sayHello() {
//			@Override
//			public void sayHello() {
//				System.out.println("hello inner");
//			}
//		};
//		h.sayHello();
		SayHello h = () -> {
			System.out.println("hello I am lambda");
		};
		h.sayHello();
//		 
//		 SayByeBye b1=new SayByeBye() {
//			@Override
//			public void sayByeBye(String name) {
//				System.out.println("Bye bye "+name);
//				
//			}
//		};
//		b1.sayByeBye("navin");

		SayByeBye b2 = (n) -> {
			System.out.println("Bye Bye " + n);
		};
		b2.sayByeBye("Navin");

		MethodWithReturnAndArgs m1 = (n1) -> {
			return "Hello " + n1 + " bye Bye " + n1;
		};
		System.out.println(m1.sayHelloAndByeBye("Suraj"));

		Consumer<String> hello = (name) -> {
			System.out.println("hello " + name);
		};
		hello.accept("Navin");

		Predicate<Integer> ageCheck = (age) -> {
			if (age >= 60) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(ageCheck.test(6));
		

	}
}
