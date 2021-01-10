import java.util.*;
import java.util.function.*;

class Student {
    String name;
    Student(String name){
        this.name=name;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return "name: " + name;
    }
}
public class SortingUsingLambda
{
	public static void main(String[] args) {
	    List<Student> lst = new ArrayList<>();
	    lst.add(new Student("Sushil"));
	    lst.add(new Student("Messi"));
	    lst.add(new Student("Prakash"));
	    lst.add(new Student("Suraj"));
	    lst.add(new Student("Anmol"));
	    lst.add(new Student("Kiran"));
	    
	    System.out.println("Before sorting: " + lst);
	    Collections.sort(lst, (s1, s2)->s1.getName().compareTo(s2.getName())); 
	    System.out.println("After sorting: " + lst);
	}
}
