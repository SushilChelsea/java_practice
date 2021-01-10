import java.util.*;
class Temp {
	public String toString() {
		return "Temp";
	}
	public void finalize() {
		System.out.println("Finalize method called.");
	}
}
public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		// HashMap m = new HashMap();
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "durga");
		System.out.println(m);
		t = null;	
		// even object is eligible for garbage collection it is not destroyed 
		// becoz HashMap has more power than GC
		Thread.sleep(5000);
		System.gc();
		System.out.println(m);
	}
}