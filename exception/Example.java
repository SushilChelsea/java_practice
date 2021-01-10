public class Example {
	public static void main(String[] args) {
		System.out.println("stmt 1");
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			// System.err.println("stmt 3");
			// System.out.println(e.getMessage());
			System.out.println(e);
			// e.printStackTrace();
		} 
		System.out.println("stmt 4");
	}
}