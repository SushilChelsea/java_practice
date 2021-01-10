import java.util.Arrays;
import java.util.stream.Stream;

public class GenericMethodObjectCompare
{
	public static void main(String[] args) {
		Integer[] intArr = {3, 9, 6, 1};
		Double[] doubleArr = {3.0, 9.0, 6.0, 1.0, 2.0, 7.0};
		String[] stringArr = {"a", "b", "c", "d"};
		
		int count = countNumberOfGreaterElement(intArr, 3);
		Arrays.stream(intArr).forEach(x -> System.out.print(x+" "));
		System.out.println();
		System.out.println("Number of element greater than 3 in an arrray is: " + count);
		
		int doubleCount = countNumberOfGreaterElement(doubleArr, 3.0);
		Arrays.stream(doubleArr).forEach(x -> System.out.print(x+" "));
		System.out.println();
		System.out.println("Number of element greater than 3.0 in an arrray is: " + doubleCount);
		
		int stringCount = countNumberOfGreaterElement(stringArr, "c");
		Arrays.stream(stringArr).forEach(x -> System.out.print(x+" "));
		System.out.println();
		System.out.println("Number of element greater than c in an arrray is: " + stringCount);
	}
	public static <T extends Comparable<T>> int countNumberOfGreaterElement(T[] arr, T elem) {
	    int count = 0;
	    for(T t: arr) {
	        if(t.compareTo(elem)>0)
	            count++;
	    }
	    return count;
	}
}