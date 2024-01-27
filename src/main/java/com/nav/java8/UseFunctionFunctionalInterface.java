package com.nav.java8;

import java.util.function.Function;
class Test implements Function<String,String>{
	@Override
	public String apply(String t) {
		// TODO Auto-generated method stub
		return "hello "+t;
	}
}

public class UseFunctionFunctionalInterface {

	public static void main(String[] args) {
		Test u=new Test();
		System.out.println(u.apply("navin"));
		
		Function< String, String> f=new Function<String, String>() {

			@Override
			public String apply(String t) {
				return "Hello "+ t;
			}
		};
		System.out.println(f.apply("navin"));
		
	}
		
	}
