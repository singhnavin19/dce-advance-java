package com.nav.java8;

//SAM-> Single Abstract Method
@FunctionalInterface
interface Laxmi{ 
	int i=10;//public static final
	void functionalExample();
	
	default void sayHello() {
		System.out.println("hello");
	}
	static void sayBye() {
		System.out.println("Bye Bye");
	}
	
}

public class BasicFunctionalInterface {
	public static void main(String[] args) {
		System.out.println(Laxmi.i);
		Laxmi.sayBye();
	}
	
}
