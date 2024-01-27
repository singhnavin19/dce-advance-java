package com.nav.java8;

import java.util.function.Function;

public class TestNavin {
	public static void main(String[] args) {
		Function<String, String> f1 = new Function<String, String>() {
			@Override
			public String apply(String t) {
				return "Hello " + t;
			}
		};
//		System.out.println(f1.apply("navin"));
		Function<String, String> f2 = (String t) -> {
			System.out.println(t);
			return "Hello " + t;
		};	
		System.out.println(f2.apply("navin1"));
		
		Function<String, String> f3 = t -> "Hello " + t;
		System.out.println(f2.apply("pravin"));

	}
}
