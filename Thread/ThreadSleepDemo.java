class SleepThread extends Thread {
    public void run() {
        for (int i=1; i<=10000; i++) {
            System.out.println("I am lazy Thread - "+ i);
        }
        System.out.println("I want to sleep");
        try {
        	Thread.sleep(2000);
        } catch(InterruptedException e) {
        	System.out.println("I got Interrupted");
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
    	SleepThread t = new SleepThread();
    	t.start();
    	t.interrupt();
    	System.out.println("End of main Thread.");
          
    }
}