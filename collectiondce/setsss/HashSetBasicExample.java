package collectiondce.setsss;

import java.util.HashSet;

public class HashSetBasicExample {
    public static void main(String[] args) {
        //generic
        HashSet<Integer> hashSet=new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(100);
        hashSet.add(1);
        hashSet.add(10);

        System.out.println(hashSet);


    }
}
