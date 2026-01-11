package threadss;

class Counter {
    private int count;

    public synchronized void incrementCounter() {
//        synchronized (this){
        this.count++;
//        }
        System.out.println(Thread.currentThread().getName() + " = " + count);
    }

    public int getCunt() {
        return count;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 20000; i++) {
                counter.incrementCounter();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 20000; i++) {
                counter.incrementCounter();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCunt());
    }

}
