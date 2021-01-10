import java.util.function.*;

public class BiPredicateAndOrNegate
{
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate1 = (i1, i2)->i1>i2;
		BiPredicate<Integer, Integer> biPredicate2 = (i1, i2)->i1-5>i2;
		
		System.out.println("=== And ===");
		System.out.println(biPredicate1.and(biPredicate2).test(15, 5));
		System.out.println(biPredicate1.and(biPredicate2).test(10, 5));
		
		System.out.println("=== OR ===");
		System.out.println(biPredicate1.or(biPredicate2).test(10, 5));
		System.out.println(biPredicate2.or(biPredicate1).test(10, 5));
		
		System.out.println("=== NEGATE ===");
		System.out.println(biPredicate1.negate().test(10, 5));
		System.out.println(biPredicate1.negate().test(5, 10));
	}
}