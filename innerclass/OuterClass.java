package innerclass;

import java.util.Map;

public class OuterClass {
    int i=10;
    public void printI(int i){
        this.i=i;
        System.out.println(this.i);
    }
    public class InnerClass {
        int i=20;
        public void innerM1(int i) {
            System.out.println("local i="+i);
            System.out.println("this.i="+this.i);
            System.out.println("Outer.this.i="+OuterClass.this.i);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.printI(30);
        OuterClass.InnerClass i = new OuterClass().new InnerClass();
        i.innerM1(40);
    }
}
