package mapss;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HasMapExampleBasic {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Parth");
        map.put(2,"Priti");
        map.put(3,"Nirala Ji");
        map.put(4,"Shalini");
        map.put(5,"Reshma");
        map.put(6,"Abhishek");
        map.put(7,"Abhishek");
        map.put(null,"hello");
        map.put(null,"hello1");


        System.out.println(map.toString());
    }
}
