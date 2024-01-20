package com.nav.innerClasss;
interface HelloInterface{
	void sayBye();
}
class HelloClass{
	public void sayBye(){
		System.out.println("Hello from HelloClass");
	}
}


public class AnnonymousInnerClass {
	public static void main(String[] args) {
		HelloInterface h=new HelloInterface(){
			@Override
			public void sayBye() {
				System.out.println("hello from HelloInterface");
			}
		};
		h.sayBye();
		
		HelloClass hl=new HelloClass() {			
		};
		hl.sayBye();
		
		
	}
}
