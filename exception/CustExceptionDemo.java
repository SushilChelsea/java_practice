class TooYoungException extends RuntimeException {
	TooYoungException(String s) {
		super(s);
	}
}
class TooOldException extends RuntimeException {
	TooOldException(String s) {
		super(s);
	}
}
public class CustExceptionDemo{
	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		System.out.println(age);
		if (age<18) {
			throw new TooYoungException("Age Must be 18"); 
		} else if (age >= 60) {
			throw new TooOldException("Age must not cross 60");
		} else
		System.out.println("We will find appropriate person for you.");
	}
}