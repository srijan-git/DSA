package multithreading.Producer_Consumer_InterThreadCommunication;

public class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            this.c.product_items(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
