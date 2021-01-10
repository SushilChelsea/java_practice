import java.util.*;

/**
*	Unbounded Wildcards
*/
public class UnboundedWildcard
{
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(3, 2, 6, 1, 7);
		List<Double> doubList = Arrays.asList(3.0, 2.2, 6.1, 1.9, 7.8);
		List<String>  strList = Arrays.asList("one", "two", "three");
		printList(strList);
	}
	/*
	public static void printList(List<Object> list) { //only List of Object type is accepted, other type passed then throws error
    }
    */
	public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }
	
}