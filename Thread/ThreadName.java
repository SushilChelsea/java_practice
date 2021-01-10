public class ThreadName {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t = new MyThread();
		System.out.println(t.getName()); // jvm provides default thread name 
		// Thread.currentThread().setName("aashmi");
		// System.out.println(10/0);
	}
}