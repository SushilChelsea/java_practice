import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
class MyThread1 extends Thread {
	ReentrantLock l;
	MyThread1(ReentrantLock l, String name) {
		super(name);
		this.l=l;
	}
	public void run() {
		int counter =0;
		 do {
		 	try {
		 		if(l.tryLock(5000, TimeUnit.MILLISECONDS)) {
		 			System.out.println(Thread.currentThread().getName() + " got lock and performing operation");
		 			System.out.println(Thread.currentThread().getName() + " I'm going to sleep");
		 			Thread.sleep(30000); 
		 			System.out.println(Thread.currentThread().getName() + " I'm wake up from sleep");
		 			l.unlock();	
		 			break;
		 		} else {
		 			counter++;
		 			System.out.println(Thread.currentThread().getName() + " unable to get lock "+ counter + " time.");
		 		}
		 	}catch(Exception e) {}
		 }while(true);
	}
}
public class ReentrantLockDemo {
	public static void main(String[] args) {
		ReentrantLock l = new ReentrantLock();
		MyThread1 t1 = new MyThread1(l,"First Thread");
		MyThread1 t2 = new MyThread1(l,"Second Thread");
		t1.start();
		t2.start();
	}
}