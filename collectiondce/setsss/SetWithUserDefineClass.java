package collectiondce.setsss;

import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Navin{
    int i;
    public Navin(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Navin{" +
                "i=" + i +
                '}';
    }
    @Override
    public int hashCode(){
        return 10;
    }
    @Override
    public boolean equals(Object n){
        return true;
    }
}
public class SetWithUserDefineClass {
    public static void main(String[] args) {
        Navin n=new Navin(10);
        Navin n1=new Navin(10);
        System.out.println("hashcode of n= "+n.hashCode());
        System.out.println("hashcode of n= "+n1.hashCode());

        System.out.println(n.equals(n1));
        Set<Navin> nsets=new LinkedHashSet<>();
        nsets.add(n);
        nsets.add(n1);
        Map<String,String> map=Map.of("hello","hi");
        System.out.println(map.getOrDefault("hello1","Navin"));
        System.out.println(nsets);
    }
}
