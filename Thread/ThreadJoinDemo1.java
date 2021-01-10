
class JoinThread1 extends Thread {
    static Thread mt;
    public void run() {
        try {
            mt.join();
        } catch(InterruptedException e) {}
        for(int i=0; i<10; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class ThreadJoinDemo1 {
    public static void main(String[] args) throws InterruptedException {
        JoinThread1.mt = Thread.currentThread();
        JoinThread1 t = new JoinThread1();
        t.start();
        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }  
    }
}