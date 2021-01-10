import java.util.*;

/**
*	Wildcard Capture and Helper Methods
*
*	In some cases, the compiler infers the type of a wildcard. For example, a list may be defined as List<?> but, 
*	when evaluating an expression, the compiler infers a particular type from the code. This scenario is known as wildcard capture.
*	
*/
public class WildcardCapture
{
	public static void main(String[] args) {
		/*
		List<Integer> intList = Arrays.asList(3, 6, 1, 7);
		foo(intList);
        System.out.println(intList);
		*/
		
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<Double>  ld = Arrays.asList(10.10, 20.20, 30.30);
		swap(li, ld); 
	}
	public static void foo(List<?> i) {
		//i.set(0, i.get(2));		// throws capture error so use helper method to capture type
        fooHelper(i);
    }
    private static <T> void fooHelper(List<T> i) {
        i.set(0, i.get(2));
    }
	public static void swap(List<? extends Number> l1, List<? extends Number> l2) {
		Number temp = l1.get(0);
		l1.set(0, l2.get(0));	//throws error, because child of Number can be Integer or Double
		l2.set(0, temp);
	}	
}