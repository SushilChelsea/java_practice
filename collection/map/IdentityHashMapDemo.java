import java.util.*;
public class IdentityHashMapDemo {
	public static void main(String[] args) {
		//HashMap m = new HashMap();
		IdentityHashMap m = new IdentityHashMap();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "pawan");
		m.put(I2, "ravi");
		System.out.println(m);
	}
}
