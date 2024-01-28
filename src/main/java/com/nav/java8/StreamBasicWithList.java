package com.nav.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasicWithList {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("Navin");
		nameList.add("Vikas");
		nameList.add("Arvind");
		nameList.add("Ashok");
		nameList.add("Hariom");

		List<Integer> ageList = Arrays.asList(20, 22, 25, 21, 19, 30);
		System.out.println(ageList);

		ArrayList<Integer> newListAge = new ArrayList<>();
		for (int no : ageList) {
			newListAge.add(no + 1);
		}

		System.out.println(newListAge);

		Stream<Integer> s=ageList.stream();	
		Stream<Integer> s1=s.filter(n -> n <= 25);
		s1.forEach(no -> System.out.println(no));
		
		ageList.stream().filter(n -> n > 20).
			forEach(System.out::println);

	}

}
