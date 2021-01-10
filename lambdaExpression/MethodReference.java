import java.util.function.*;

@FunctionalInterface
interface MyComparator<T extends Number> {
    boolean compare(T n1, T n2);
}
public class MethodReference
{
	public static void main(String[] args) {
		MyComparator<Integer> c = MethodReference::methodReference; //class static method declaration is returned "mind not executed".
		System.out.println(c.compare(10, 2)); //above method reference is not executed
	}
	
	private static boolean methodReference(int n1, int n2) {
	    return n1>n2;
	} 
}
