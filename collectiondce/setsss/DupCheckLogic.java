package collectiondce.setsss;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupCheckLogic {
    public static void main(String[] args) {
        Integer i= new Integer(10); //10
        Integer i1=new Integer(10); //10
        System.out.println(i.equals(i1));
        System.out.println(i==i1);

        LinkedHashSet<Integer> nos=new LinkedHashSet<>();
        nos.add(i);
        nos.add(i1);

        System.out.println(nos);
    }

}
