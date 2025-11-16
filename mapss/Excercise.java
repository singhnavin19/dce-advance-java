package mapss;

import java.util.*;

public class Excercise {
    public static void main(String[] args) {
        String input="hhellokknsbdsdsdsd";
        Set<String> result=new LinkedHashSet<>();
        Map<String,Integer> result1=new LinkedHashMap<>();
        for(String s:input.split("")){
            result.add(s);
            if(result1.containsKey(s)){
                result1.put(s,result1.get(s)+1);
            }else{
                result1.put(s,1);
            }
        }
        System.out.println(result);
        System.out.println(result1);


    }
}
