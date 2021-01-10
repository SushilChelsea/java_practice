public class Test1{
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			try {
			System.out.println(10/0);
			}
			catch (ArithmeticException e1) {
				System.out.println("Again you are trying to divide by zero in catch block.");
			}
		} 
	}
}