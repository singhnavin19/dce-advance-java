package threadss;

public class BasicThreadExample extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("run method= " + i + " " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread b = new Thread(new BasicThreadExample(),"navin");
        BasicThreadExample b1 = new BasicThreadExample();
        b1.setName("Navin2");
        b.start();
        b1.start();
    }
}
