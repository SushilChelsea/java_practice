class MyThread extends Thread {
	private String name;
	int total=0;
	MyThread(String name, int total) { this.name=name;	this.total=total;	}
	MyThread(String name) { this.name=name;	}

	public void run(){
		synchronized(this) {
			System.out.println(name+" starts calculation.");
			for (int i=0; i<=100; i++) {
				total = total +i;
			}
			System.out.println(name+" trying to give notification.");
			this.notify();
		}
	}
}

public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		// MyThread t1 = new MyThread("Thread1");
		// t1.start();
		// synchronized(t1) {
		// 	System.out.println("Main thread calling wait() Method.");
		// 	t1.wait();
		// 	System.out.println("Main thread got notification.");
		// 	System.out.println(t1.total);
		// }
		MyThread t2 = new MyThread("Thread2",5);
		t2.start();
		synchronized(t2) {
			System.out.println("Main thread calling wait() Method.");
			t2.wait();
			System.out.println("Main thread got notification.");
			System.out.println(t2.total);
		}
	}
}