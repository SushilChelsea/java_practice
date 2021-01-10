class ChildThread extends Thread {
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
}
public class ThreadPriority {
	public static void main(String[] args) {
		ChildThread t = new ChildThread();
		System.out.println(Thread.currentThread().getPriority());
		t.setPriority(10);
		System.out.println(t.getPriority());
		t.start();
		for (int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}
