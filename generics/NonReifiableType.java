import java.util.*;

class ArrayBuilder {
  public static <T> void addToList (List<T> listArg, T... elements) {
    for (T x : elements) {
      listArg.add(x);
    }
  }
  public static void faultyMethod(List<String>... l) {
    //   for(int i=0; i<l.length; i++) {
    //       System.out.println(l[i]);
    //   }
    Object[] objectArray = l;     // Valid
    System.out.println(objectArray[0]);
    objectArray[0] = Arrays.asList(42);
    System.out.println(objectArray[0]);
    String s = l[0].get(0);       // ClassCastException thrown here
  }
}
public class NonReifiableType
{
	public static void main(String[] args) {
		List<String> stringListA = new ArrayList<String>();
        List<String> stringListB = new ArrayList<String>();

        ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
        ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
        
        List<List<String>> listOfStringLists = new ArrayList<List<String>>();
        ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);
        
        ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
        
        //System.out.println(listOfStringLists);
	}
}
