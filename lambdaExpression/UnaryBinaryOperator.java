import java.util.*;
import java.util.function.*;

public class UnaryBinaryOperator
{
	public static void main(String[] args) {
	    /*
		List<Integer> lst = Arrays.asList(1, 2, 3, 4);
		UnaryOperator<Integer> unary = i->i*i;
	    lst.forEach(l->System.out.println(unary.apply(l)));
	    */
		
	    Map<Integer, String> map = new HashMap<>();
	    map.put(1, "A");
	    map.put(2, "B");
	    map.put(3, "C");
	    map.put(4, "D");
	    BinaryOperator<String> binaryOperat = (s1, s2)->s1+"-"+s2;
	    List<String> biLst = new ArrayList<>();
	    map.forEach((k, v)->{
	        biLst.add(binaryOperat.apply(Integer.toString(k), v));
	    });
	    biLst.forEach(System.out::println);
		
	}
}
