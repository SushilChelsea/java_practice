import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}
public class ArraysSearchingDemo {
	public static void main(String[] args) {
		int[] a = {10,5, 20, 11, 6};
		Arrays.sort(a);
		// for (int a1 : a) {
		// 	System.out.println(a1);
		// }
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));

		String[] s = {"A", "Z", "B"};
		Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s, "B"));
		System.out.println(Arrays.binarySearch(s, "S"));

		// Customized Sorting order
		System.out.println("Customized Sorting Order");
		MyComparator c = new MyComparator();
		Arrays.sort(s, c);
		System.out.println(Arrays.binarySearch(s, "Z", c));
		System.out.println(Arrays.binarySearch(s, "S", c));
		System.out.println(Arrays.binarySearch(s, "S"));

	}
}