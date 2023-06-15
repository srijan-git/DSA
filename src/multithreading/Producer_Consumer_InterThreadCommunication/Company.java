package multithreading.Producer_Consumer_InterThreadCommunication;

public class Company {
    int n;
    boolean chance = false;


// if f is false: Chance=producer
// if f is true: Chance=consumer

    synchronized public void product_items(int n) {
        if (chance) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        chance = true;
        notify();
    }

    synchronized public int consumt_items() {
        if (!chance) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumed: " + this.n);
        chance = false;
        notify();
        return this.n;

    }

}
