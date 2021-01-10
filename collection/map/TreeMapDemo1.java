import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		return s2.compareTo(s1);
	}
}
public class TreeMapDemo1 {
	public static void main(String[] args) {
		TreeMap t = new TreeMap(new MyComparator()); 
		t.put("xxx", 100);
		t.put("zzz", 110);
		t.put("lll", 115);
		t.put("aaa", 120); 
		System.out.println(t);

		// change HashMap to TreeMap
		HashMap m = new HashMap();
		m.put(101, "durga");
		m.put(105, "shyam");
		m.put(103, "ram");
		m.put(100, 120);
		System.out.println(m);
		TreeMap t1 = new TreeMap(m);
	}
}