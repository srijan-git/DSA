package multithreading.Producer_Consumer_InterThreadCommunication;

public class Consumer extends Thread {

    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            this.c.consumt_items();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
