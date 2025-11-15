package collectiondce.setsss;

import java.util.LinkedHashSet;

public class LinkedHasSetExample {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add(10);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add("Navin");
        System.out.println(linkedHashSet);
        int sum = 0;
        for (Object i : linkedHashSet) {
            if(i instanceof Integer){
            sum = sum + Integer.valueOf(i.toString());
            }
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
