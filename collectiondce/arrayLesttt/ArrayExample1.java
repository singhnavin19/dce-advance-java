package collectiondce.arrayLesttt;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample1 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(List.of(1,2,3,4,5,8,9));
        System.out.println(numbers);
//        System.out.println("please enter number");
//        int no=new Scanner(System.in).nextInt();
//        System.out.println(numbers);
//
//        if(numbers.contains(no)){
//            System.out.println("number found");
//        }
        numbers.add(30);
        System.out.println(numbers);
        numbers.remove(3);
        System.out.println(numbers);

        System.out.println(numbers.get(3));


    }
}
