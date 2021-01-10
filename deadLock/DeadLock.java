class A {
	public synchronized void d1(B b) {
		System.out.println("Thread1 start execution of d1() method.");
		try{
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println("Thread1 trying to call B's last().");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A's last().");
	}
}
class B {
	public synchronized void d2(A a) {
		System.out.println("Thread2 start execution of d2() method.");
		try{
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println("Thread2 trying to call A's last().");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside B's last().");
	}
}
class ChildThread extends Thread {
	A a; B b;
	ChildThread (A a, B b) {
		this.a=a;
		this.b=b;
	}
	public void run() {
		b.d2(a);
	}
}
public class DeadLock {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		ChildThread t = new ChildThread(a,b);
		t.start();
		a.d1(b);

	}
}