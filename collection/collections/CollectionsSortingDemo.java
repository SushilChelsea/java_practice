import java.util.*;

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}
public class CollectionsSortingDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("Z");
		t.add("A");
		t.add("M");
		t.add("C");
		System.out.println(t + " --> Default Natural Sorting Order");

		TreeSet t1 = new TreeSet(new MyComparator());
		t1.add("Z");
		t1.add("A");
		t1.add("M");
		t1.add("C");
		System.out.println(t1 + " --> Customized Sorting Order");
		// System.out.println(t1.ceiling("M"));
		
	}
}