import java.util.*;
public class ListToSet {
	public static void main(String[] args) {
	/*		
		List l = new ArrayList();
		l.add(4);
		l.add(2);
		l.add(8);
		l.add(2);
		l.add(6);
		// HashSet h = new HashSet();
		System.out.println(l);
		// TreeSet t = new TreeSet(l);	// maintain default sorting order
		LinkedHashSet t = new LinkedHashSet(l); // maintain insertion order
		System.out.println(t);
	*/	
		HashSet l = new HashSet();
		l.add(4);
		l.add(2);
		l.add(8);
		l.add(2);
		l.add(6);
		l.add(null);
		System.out.println(l);	
	}
}