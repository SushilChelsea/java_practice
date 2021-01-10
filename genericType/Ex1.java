public class Ex1 {

	public static void main(String[] args){
		
		System.out.println(Ex1.class);
		Class<Ex1> className = Ex1.class;
		System.out.println(className.getClass().getName());
		
		
		//Ex1 e = new Ex1();
		//Class className = e.getClass();
		//System.out.println(className instanceof String);
	}
}