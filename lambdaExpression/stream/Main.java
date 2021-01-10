import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Person {
    String firstName, gender;
    int age;
    
    Person(String firstName, String gender, int age) { this.firstName=firstName; this.gender=gender; this.age=age; }
    public String getFirstName() { return firstName; }
    public String getGender() { return gender; }
    public int getAge() { return age; }
    public String toString() { 
        return "Person[First Name: " + firstName + ", Gender: " + gender + ", age: " + age + "]"; 
    }
}
public class Main
{
	public static void main(String[] args) {
	    /*List<Integer> lst = Arrays.asList(1, 2, 3, 4);
		System.out.println(
		    lst.stream()
		        .reduce(1, (carry, e)->carry*e));*/
		        
		List<Person> lstPerson = createPersonList();
		lstPerson.stream()
		            .collect(Collectors.toMap(e -> e.getFirstName()+"-"+e.getAge(), e->e))
		            .forEach((k, v)->System.out.println(k + "\t\t" + v));
	}
	
	public static List<Person> createPersonList() {
	    return Arrays.asList(
	        new Person("Sara", "FEMALE", 24), new Person("Sara", "FEMALE", 2), 
	        new Person("Leo", "MALE", 34), new Person("John", "MALE", 40), 
	        new Person("Viyansh", "MALE", 1), new Person("Parth", "MALE", 4));   
	}
}