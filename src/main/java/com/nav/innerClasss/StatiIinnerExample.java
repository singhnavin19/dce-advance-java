package com.nav.innerClasss;

public class StatiIinnerExample {
	
	 private static int i=10;

	 static class StaticInner{
		 static int j=20;
		void sayHello() {
			System.out.println("Hello"+i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		StaticInner inner=new StaticInner();
		inner.sayHello();
	}
}
