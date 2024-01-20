package com.nav.enumss;

public class EnumMain {
	public static final String MONDAY="MONDAY";
	public static void main(String[] args) {
		
		System.out.println(Week.MONDAY.ordinal());

		System.out.println(Week.TUESDAY.ordinal());
		

		System.out.println(Week.SATURDAY.ordinal());
		
		Week w[]=Week.values();
		for(Week w1:w) {
			System.out.println(w1.name());
		}
		
		System.out.println(Week.valueOf("MONDAY"));
		
	}
}
