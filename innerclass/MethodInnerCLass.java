package innerclass;

public class MethodInnerCLass {
    public void method1(int i){
        class InnerMethod{
            public void squareNo(int i){
                System.out.println(Math.pow(i,2));
            }
        }
        InnerMethod innerMethod=new InnerMethod();
        innerMethod.squareNo(i);
    }

    public static void main(String[] args) {
        MethodInnerCLass methodInnerCLass=new MethodInnerCLass();
        methodInnerCLass.method1(20);

    }

}
