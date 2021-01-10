import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("bhede",700);
		m.put("chetiz",800);
		m.put("sulav",200);
		m.put("laure",500);
		System.out.println(m);
		System.out.println(m.put("sulav",1000));
		// get all keys {keys are not duplicate so using Set reference type}
		Set s = m.keySet();
		System.out.println(s);
		// get all values {values may be duplicated so using Collection reference type}
		Collection c = m.values();
		System.out.println(c);
		// entrySet return Set
		Set s1 = m.entrySet();
		System.out.println(s1);
		// changing the value of laure using iterator()
		// iterator() method is applicable for only collection object 
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry e = (Map.Entry) itr.next();
			System.out.println("\t" + e.getKey() + "->" + e.getValue());
			if(e.getKey().equals("laure")) {
				e.setValue(10000);
			}
		}
		System.out.println(m);
		System.out.println(s1);
	}
}