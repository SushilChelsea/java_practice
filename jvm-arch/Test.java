import java.lang.reflect.Method;

class Student {
	int marks = 20;
	String name = "Sushil";
	
    public String getName() {
        return null;
    }
    public int getMarks() {
        return 10;
    }
}
public class Test {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
		Class c1 = s1.getClass();
		Student s2 = new Student();
		Class c2 = s2.getClass();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
		
    }
 
}