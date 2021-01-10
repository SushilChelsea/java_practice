import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int a = checkCondition(input);
			System.out.println("a: "+a);
			int b = checkCondition(input);
			System.out.println("b: "+b);
			System.out.println("The result is :" + a/b);
		}catch (Exception e) {
			System.out.println("You tried to " + e.getMessage());
		}	
	}
	public static int checkCondition(Scanner input) {
		int a=0;
		boolean valid=true;
		do {
			try {
				a= Integer.parseInt(input.nextLine());
				valid=false;
			} catch (NumberFormatException e) {
				System.out.println("Please type Number type!");
				valid=true;
			}
		}while(valid);
		return a;
	}
}