package collectiondce;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckeWordInSentense {
    public static void main(String[] args) {
        String set="Hello I am navin,I have laptop";
        String []words=set.split(" ");

        List<String> data=new ArrayList<String>(Arrays.asList(words));
        System.out.println(data);

        System.out.println(data.contains("I"));

    }
}
