import java.util.*;
public class NullException {
	public static void main(String[] args) {
		/*TreeSet t = new TreeSet();
		t.add(null);
		System.out.println(t);*/

		// if ("A".compareTo("B") == -1) {
		// 	System.out.println("A should come before B");
		// } else {
		// 	System.out.println("A should come after B");
		// }

		System.out.println("B == null: " + ("B" == null));	// false
		System.out.print("B.compareTo(null):\n");
		System.out.println("B".compareTo(null));	// NullPointerException -- null ma kei operation garna khojey bhane NPE auncha
	}
}