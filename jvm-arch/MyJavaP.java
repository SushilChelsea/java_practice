import java.lang.reflect.*;

public class MyJavaP {

	public static void main(String[] args) throws Exception {
		//System.out.println("Fields");
		//System.out.println(args[0]);
		
		if(args[0] != null) {
			Class c = Class.forName(args[0]);
		
			System.out.println("Fields");
			Field f[]=c.getDeclaredFields(); 
			for(Field f1: f) {
				System.out.println(f1.getName());
			}
			System.out.println("==================");
			
			System.out.println("Constructors");
			Constructor con[]=c.getDeclaredConstructors(); 
			for(Constructor c1: con) {
				System.out.println(c1.getName());
			}
			System.out.println("==================");
			
			System.out.println("Method");
			Method m[]=c.getDeclaredMethods();  
			for(Method m1: m) {
				System.out.println(m1.getName());
			}
			System.out.println("==================");
			
		}
		
		
	}
}
