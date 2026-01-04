package threadss;

public class ThreadByUsingRunnable implements Runnable{
    public static void main(String[] args) {
        ThreadByUsingRunnable  r=new ThreadByUsingRunnable();
        Thread thread=new Thread(r);
//        r.run();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("run method:- thread name="+Thread.currentThread().getName());

    }
}
