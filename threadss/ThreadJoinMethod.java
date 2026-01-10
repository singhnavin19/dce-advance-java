package threadss;

public class ThreadJoinMethod extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread t1=new Thread(new ThreadJoinMethod());
        t1.setName("MyThread");
        t1.start();
        t1.join();
        System.out.println("Main Thread End");
    }
}
