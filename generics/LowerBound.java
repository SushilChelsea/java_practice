import java.util.*;

/**
*	Lower Bounded Wildcards
*
*	a lower bounded wildcard restricts the unknown type to be a specific type or a super type of that type.
*	A lower bounded wildcard is expressed using the wildcard character ('?'), following by the super keyword, followed by its lower bound: <? super A>.
*	Note: You can specify an upper bound for a wildcard, or you can specify a lower bound, but you cannot specify both.
*/
public class LowerBound
{
	public static void main(String[] args) {
		List<Object> objList = new ArrayList<>();
// 		addNumbers(objList);
		List<Number> numList = new ArrayList<>();
//		addNumbers(numList);
		List<Integer> intList = new ArrayList<>();
// 		addNumbers(intList);
		
		List<String> strList = new ArrayList<>();
 		addNumbers(strList);		//throws error, expecting Integer or Integer super class but String is not Integer super class
		
		System.out.println(numList.size());
	}
	public static void addNumbers(List<? super Integer> list) {
	    System.out.println(list instanceof List);
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}