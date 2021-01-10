import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamEX
{
	public static void main(String[] args) {
	    List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(
		    lst.stream()
		        .filter(StreamEX::isGreaterThan3) //if condition satisfies move to next statement i.e. filter otherwise move to next element in list
		        .filter(StreamEX::isEven)		//if condition satisfies move to next statement i.e. filter otherwise move to next element in list
		        .filter(e->(e/3)==2)		//if condition satisfies move to next statement i.e. map otherwise move to next element in list
		        .map(StreamEX::doubleIt)		//double the value
		        .findFirst());				//get first match value and quit process

	}
	
	public static boolean isGreaterThan3(Integer value) {
	    System.out.println("isGrt3 " + value);
	    return value>3;
	}
	public static boolean isEven(Integer value) {
	    System.out.println("isEven " + value);
	    return value%2==0;
	}
	public static Integer doubleIt(Integer value) {
	    System.out.println("doubleIt " + value);
	    return value*2;
	}

}
