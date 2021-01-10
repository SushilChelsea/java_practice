import java.util.function.*;

public class BiFunctionAndThen
{
	public static void main(String[] args) {
	    BiFunction<String, Integer, Integer> biFunction = (position, age)->{
	        if(position==null && age==null) {
	            return 0;
	        } else {
	            if(position.equalsIgnoreCase("Manager") && age>30) return 120000;
	            else if(position.equalsIgnoreCase("Developer") && age>25) return 80000;
	            else return 0;
	        }
	    };
	    
	    int[] salaries = new int[3];
		salaries[0] = biFunction.apply("manager",32);
		salaries[1] = biFunction.apply("developer",28);
		salaries[2] = biFunction.apply("designer",32);
		
		Function<Integer, String> function = amount->{
			if(amount>100000) {
				return "Band 5";
			} else if(amount>70000) {
				return "Band 4";
			} else return "Band 3";
		};
		
		/*
		for(int salary: salaries) {
			System.out.println(function.apply(salary));
		}
		*/
		
		//example of andThen
		/**
			1. First supply input argument to BiFunction apply method
			2. Then result of BiFunction apply method is passed as input argument to Function apply method
			3. Finally the output is stored
		**/
		String salaryBand = biFunction.andThen(function).apply("Manager", 32); 
		System.out.println(salaryBand);
		
		String salaryBand2 = biFunction.andThen(function).apply("developer", 27); 
		System.out.println(salaryBand2);
		
	}
}
