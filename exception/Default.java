public class Default {
	public static void main(String[] args) {
		dostuff();
		/*try {
			dostuff();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: " + e.getMessage());
		}*/
		System.out.println("Hello, my name is sushil.");
	}
	public static void dostuff() {
		doMoreStuff();
	}
	public static void doMoreStuff() {
		System.out.println(10/0);
		/*try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException: " + e.getMessage());
		}*/
	}
}