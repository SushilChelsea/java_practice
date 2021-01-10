import java.util.function.*;
/**
	default BiConsumer<T,U> andThen(BiConsumer<? super T,? super U> after)

	Returns a composed BiConsumer that performs, in sequence, this operation followed by the after operation. 
	If performing either operation throws an exception, it is relayed to the caller of the composed operation. 
	If performing this operation throws an exception, the after operation will not be performed.

	Parameters:
		after - the operation to perform after this operation
	Returns:
		a composed BiConsumer that performs in sequence this operation followed by the after operation
**/
public class BiConsumerAndThen
{
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> adder = (i1, i2)->System.out.println("Addition: "+ (i1+i2));
		BiConsumer<Integer, Integer> multiplyer = (i1, i2)->System.out.println("Multiplication: "+ (i1*i2));
		
		adder.andThen(multiplyer).accept(10, 20);
		multiplyer.andThen(adder).accept(10, 20);
	}
}