package reflectionss;


import java.lang.reflect.Field;

public class BasicExample {
    public int i = 10;

    public static void main(String[] args) throws ClassNotFoundException {
//        BasicExample basicExample=new BasicExample();
        Class basicExample = Class.forName("reflectionss.BasicExample");
        for(Field field:basicExample.getFields()){
            System.out.println(field.getName());
        }


    }
}
