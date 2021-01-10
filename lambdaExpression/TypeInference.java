import java.util.function.*;

@FunctionalInterface
interface MyComparator<T extends Number> {
    boolean compare(T n1, T n2);
}
public class TypeInference
{
	public static void main(String[] args) {
		MyComparator<Integer> c = (n1, n2)->n1>n2; //here method type is infer by compiler and also method body return type
		System.out.println(c.compare(10, 2));
	}
}
