package multithreading;


//We can extend Thread class


class MyThread implements Runnable {
    //We can implment Runnable interface
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value of i: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//or


class MyAnotherThread extends Thread {
    //We can extend Thread Class
    @Override
    public void run() {
        super.run();
        for (int i = 10; i > 0; i--) {
            System.out.println("Value of i in reverse: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {

        System.out.println("Program Started....");


        Thread th2 = Thread.currentThread();
        String tname = th2.getName();
        System.out.println("Current Running thread name is : " + tname);


        th2.setName("myMain");
        System.out.println("Current Running thread name is : " + th2.getName());

        MyThread mth = new MyThread();
        Thread th = new Thread(mth);
        th.start();


        MyAnotherThread mat = new MyAnotherThread();
        mat.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Thread ID is: " + th2.getId());

        System.out.println("Program Ended....");

    }
}


