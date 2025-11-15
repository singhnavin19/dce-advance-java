package collectiondce.arrayLesttt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(10);
        l.addAll(List.of(10,30,40));
        System.out.println(l);

        ArrayList al=new ArrayList(l);
        System.out.println(al);

        Stack<Integer> s=new Stack();
        s.push(10);
        s.push(30);
        s.push(50);
        System.out.println(s);
        s.pop();
        System.out.println(s);


    }
}
