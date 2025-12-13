package genericsss;

import java.util.ArrayList;
import java.util.List;

public class GenericsBaseExample {
    public static void main(String[] args) {
//        OwnGenericsCLass<String> s=new OwnGenericsCLass<>(1);
        OwnGenericsCLass<Integer> s = new OwnGenericsCLass<>(1);
        s.showObject();
//        withoutGenerics();
//        withGenerics();
    }

    public static void withoutGenerics() {
        List list = new ArrayList();
        list.add(1);
        list.add(20);
        list.add("Navin");

        int sum = 0;
        for (Object i : list) {
            sum = sum + Integer.valueOf(i.toString());
        }
        System.out.println(sum);

    }

    public static void withGenerics() {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(20);
//        list.add("Navin");

        int sum = 0;
        for (Object i : list) {
            sum = sum + Integer.valueOf(i.toString());
        }
        System.out.println(sum);
    }

}
