class MyThread extends Thread {
	String name;
	MyThread(String name) {	this.name = name;	}
	public void run() {
		System.out.println(name + "... job started by Thread: " + Thread.currentThread().getName());
		try { Thread.sleep(6000); } catch(InterruptedException e) {}
		System.out.println(name + "... job completed by Thread: " + Thread.currentThread().getName());

	}
}
public class Simple {
	public static void main (String[] args) {
		MyThread t1 = new MyThread("Durga");
		MyThread t2 = new MyThread("Ravi");
		MyThread t3 = new MyThread("Shiva");
		MyThread t4 = new MyThread("Pavan");
		MyThread t5 = new MyThread("Suresh");
		MyThread t6 = new MyThread("Anil");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}
}