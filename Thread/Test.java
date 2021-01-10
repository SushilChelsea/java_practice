class ChildThread extends Thread {
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}
class MyThread extends Thread {
	public void run() {
		// for (int i=0; i<10; i++) {
		// 	System.out.println("Father Thread");
		// }
		System.out.println("run method executed by: " + Thread.currentThread().getName());
	}
}

public class Test{
	public static void main(String[] args) {
		MyThread t = new MyThread();
		// ChildThread ct = new ChildThread();
		// ct.start();
		t.start();
		// for (int i=0; i<10; i++) {
		// 	System.out.println("Main Thread");
		// }
		System.out.println("main method executed by: " + Thread.currentThread().getName());
	}
}