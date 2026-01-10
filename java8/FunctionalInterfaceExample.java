package java8;
@FunctionalInterface
interface Welcome{
    void sayHello();
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Welcome wel=()-> {
            System.out.println("sayHello");
            System.out.println("sayHello");
        };
        wel.sayHello();
        Thread t = new Thread(
                () -> System.out.println("I am new Thread using lambda" + Thread.currentThread().getName())
        );
        Thread t1 = new Thread(
                () -> System.out.println("I am new Thread using lambda" + Thread.currentThread().getName())
        );
        t.start();
        t1.start();
    }

}
