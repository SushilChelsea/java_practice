import java.util.*;
import java.util.function.*;

public class BiConsumerFunctionPredicate
{
    static int count = 1;
    public static void increment() {
        count++;
    }
	public static void main(String[] args) {
	    /*Map<Integer, String> map = new HashMap<>();
	    map.put(1234, "A");
	    map.put(2243, "B");
	    map.put(3123, "C");
	    
		BiConsumer<Integer, String> biConsumer = (k, v)->{
		    System.out.println(BiConsumerFunctionPredicate.count+"\t"+k+"\t"+v);
		    BiConsumerFunctionPredicate.increment();
		};
		
		map.forEach(biConsumer);*/
		/*
		BiFunction<Integer, Integer, Integer> biFunction = (n1, n2)->n1+n2;
		System.out.println("Addition: " + biFunction.apply(2, 3));
		*/
		
		BiPredicate<Integer, Integer> biPredicate = (i1, i2)->i1>i2;
		System.out.println(biPredicate.test(10, 20));
		System.out.println(biPredicate.test(30, 30));
		System.out.println(biPredicate.test(40, 30));
	}
}
