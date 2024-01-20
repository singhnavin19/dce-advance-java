package com.nav.innerClasss;

public class Outer {
	int i=10;
	static int j=20;
	public static void sayBye() {
		System.out.println("bye bye");
	}
	void sayHello(){
		class a{
			
		}
		System.out.println("Hello from outer class");
	}

	class Inner{
		void sayHelloInner(){
			sayBye();
			sayHello();
			System.out.println("Hello from Inner class"+i+" "+j);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("hello");

		Outer o=new Outer();
		o.new Inner().sayHelloInner();
				
	}
}
