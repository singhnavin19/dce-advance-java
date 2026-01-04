package threadss;

public class BasicThreadExample extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("I am run method");
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        BasicThreadExample b=new BasicThreadExample();
        b.start();
//        b.start();
    }
}
