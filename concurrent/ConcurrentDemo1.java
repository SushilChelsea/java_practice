import java.util.concurrent.locks.*;
class MyThread extends Thread {
	static ReentrantLock l = new ReentrantLock();
	String name;
	MyThread(String name) {
		this.name=name;
	}
	public void run() {
		if (l.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " got lock and performing operation");
			System.out.println(Thread.currentThread().getName() + " I'm going to sleep");
			try { Thread.sleep(5000); } catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + " I'm wake up from sleep");
			l.unlock();
		} else {
			System.out.println(Thread.currentThread().getName() + " unable to get lock.");
		}
	}
}
public class ConcurrentDemo1 {
	public static void main(String[] args) {
		// ReentrantLock l = new ReentrantLock();
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		t1.start();
		t2.start();
	}
}