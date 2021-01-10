import java.util.*;
import java.util.function.*;

class Person {
    String name;
    int amount;
    public Person(String name, int amount) {
        this.name=name; this.amount=amount;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return "name: " + name + ", amount: " + amount;
    }
}
public class ReferenceToInstanceMethod
{
	public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sushil", 50000));
        persons.add(new Person("Sandeep", 45000));
        persons.add(new Person("Rahul", 60000));
        
        List<String> names = getPersonsName(persons, Person::getName);
        names.forEach(System.out::println);
	}
	
	private static List<String> getPersonsName(List<Person> persons, Function<Person, String> f) {
	    List<String> results = new ArrayList<>();
	    persons.forEach(p->results.add(f.apply(p)));
	    return results;
	} 
}