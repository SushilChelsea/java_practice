import java.util.Scanner;
public class NearestNumber {
	public static void main(String[] args) {
		int num = 100;
		System.out.println(-(-100));
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();
		int aDiff = num - a;
		int bDiff = num - b;
		System.out.println(aDiff + " " + bDiff);
		if (aDiff < 0) {
			aDiff = (-aDiff);
		}
		if (bDiff < 0) {
			System.out.println("Hello");
			bDiff = (-bDiff);
		}
		System.out.println(aDiff + " " + bDiff);
		if (aDiff < bDiff) 
			System.out.println("Nearest is: " + a);
		 else if (aDiff > bDiff)
			System.out.println("Nearest is: " + b);
		else 
			System.out.println("Both are Equal");
	}
}