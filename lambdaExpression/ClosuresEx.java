import java.util.*;
import java.util.function.*;

/**
**	Closures can be passed to another function as a parameter. 
**	A closure gives us access to the outer function from an inner function
**/

@FunctionalInterface
interface Operation {
    void operate(int n);
}
public class ClosuresEx
{
	public static void main(String[] args) {		
		int x=30;
		int y=40;
		
		doOperate(x, n->System.out.println(n+y)); //here outer scope y is accessible inside function implementation
	}
	private static void doOperate(int x, Operation o) {
	    o.operate(x);
	}

}
