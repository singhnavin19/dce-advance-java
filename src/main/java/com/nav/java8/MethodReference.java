package com.nav.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
	public static void  sayHello(String name) {
		System.out.println("Hello I am instance method " +name);
	}
	
	public static void main(String[] args) {
		MethodReference m=new MethodReference();
//		m.sayHello("normal");
		
		Consumer<String> c1=MethodReference::sayHello;
		c1.accept("method ref");
		
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		
		numbers.stream()
			.filter(i -> i % 2 == 0)
			.distinct()
			.forEach(System.out::println);

		
		
	}

}
