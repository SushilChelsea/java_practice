import java.util.*;
import java.util.function.*;

public class ReferenceToStaticMethod
{
	public static void main(String[] args) {
        List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		System.out.println(messages);

		System.out.println("================================================");
		messages.forEach(ReferenceToStaticMethod::capitalize);

	}	
	private static void capitalize(String word) {
	    System.out.println(word.toUpperCase());
	} 

}