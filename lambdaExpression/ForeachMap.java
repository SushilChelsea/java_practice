import java.util.*;
import java.util.function.*;

class Student {
    String name;
    Student(String name){
        this.name=name;
    }
    public String toString() {
        return "name: " + name;
    }
}
public class ForeachMap
{
	public static void main(String[] args) {
	    List<Student> lst = new ArrayList<>();
	    lst.add(new Student("Sushil"));
	    lst.add(new Student("Messi"));
	    lst.add(new Student("Prakash"));
	    List<Student> lst1 = new ArrayList<>();
	    lst1.add(new Student("Suraj"));
	    lst1.add(new Student("Anmol"));
	    lst1.add(new Student("Kiran"));
		
		Map<Integer, List<Student>> map = new HashMap<>();
		map.put(1, lst);
		map.put(2, lst1);

        map.forEach((k, v)->{
            System.out.print(k + "\t[");
            v.forEach(x->System.out.print(x+ " "));
            System.out.println("]");
        });
	}
}