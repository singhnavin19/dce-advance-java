package mapss;
// 1- Core Java  30-AdvJava 65-Spring Boot  107 =Spring JPA


import java.util.*;

public class IndexExample {
    public static void main(String[] args) {
        Map<Integer,String> index=new LinkedHashMap<>();
        index.put(1,"Core Java ");
        index.put(30,"Adv java");
        index.put(65,"Spring boot");
        System.out.println(index.toString());


        Set<String> set=new LinkedHashSet<>();
        set.add("Hello Java");
        set.add("Hello Java5");
        set.add("Hello Java40");
        System.out.println(set);

        //Tree
        Set<Integer> set1=new TreeSet<>();
        set1.add(10);
        set1.add(1);
        System.out.println(set1);

        List<String> list=new ArrayList<>();
        list.add("Darshan");
        list.add("Priti");
        list.add("Reshma");
        list.add("Abhishek");
        list.add("Parth");
        System.out.println(list.subList(1,3));

    }
}
