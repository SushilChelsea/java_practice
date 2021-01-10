interface Interface1<T extends Number> {
    T calculate(T a, T b);
}
public class Main
{
	public static void main(String[] args) {
        Interface1<Integer> intf = (a, b)->a-b;
        System.out.println("Subtraction 5-3: " + intf.calculate(5, 3));
        intf = (a, b)->a+b;
        System.out.println("Addition 5+3: " + intf.calculate(5, 3));
        intf = (a, b)->a*b;
        System.out.println("Multiplication 5-3: " + intf.calculate(5, 3));
        intf = (a, b)->a/b;
        System.out.println("Division 5/3: " + intf.calculate(5, 3));
	}
}