import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		System.out.println(h);	
		System.out.println(h.put(101, "durga"));
		h.put(101, "durga");
		System.out.println(h);
		System.out.println(h.put(101, "ravi"));
		System.out.println(h);

	}
}
