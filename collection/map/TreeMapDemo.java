import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		// create TreeMap object where element will be inserted according to default natural sortin order of keys 
		// and keys must be homogeneous 
		TreeMap t = new TreeMap(); 
		t.put(101, "durga");
		t.put(105, "shyam");
		t.put(103, "ram");
		t.put(100, 120); // values can be hetrogeneous
		System.out.println(t);
	}
}

