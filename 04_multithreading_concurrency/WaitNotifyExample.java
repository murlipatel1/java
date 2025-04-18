class Shared {
    boolean flag = false;

    synchronized void produce() throws InterruptedException {
        while (flag) wait(); // wait if already produced

        System.out.println("Produced");
        flag = true;
        notify(); // wake up consumer
    }

    synchronized void consume() throws InterruptedException {
        while (!flag) wait(); // wait if not produced yet

        System.out.println("Consumed");
        flag = false;
        notify(); // wake up producer
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Shared shared = new Shared();

        Thread producer = new Thread(() -> {
            try { for (int i = 0; i < 5; i++) shared.produce(); } 
            catch (InterruptedException e) { e.printStackTrace(); }
        });

        Thread consumer = new Thread(() -> {
            try { for (int i = 0; i < 5; i++) shared.consume(); } 
            catch (InterruptedException e) { e.printStackTrace(); }
        });

        producer.start();
        consumer.start();
    }
}
