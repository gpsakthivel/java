package multiThreading;

class Hi implements Runnable {
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello implements Runnable {
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnableInterfaceDemo {
    public static void main(String[] args) {
        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        t1.start();
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}
