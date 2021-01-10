
class JoinThread extends Thread {
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println("Child Thread");
            try {
            	Thread.sleep(2000);
            } catch(InterruptedException e) {}
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t = new JoinThread();
        t.start();
        /* Check Output
		t.join();
		t.join(10000);
		t.join(10000,100);
        */
        t.join(10000,100);
        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }  
    }
}