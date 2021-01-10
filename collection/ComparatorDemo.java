import java.util.*;
class Student {
	private int id;
	private String name;
	public Student(int id, String name) {
		this.id=id; this.name=name;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return id + " " + name;
	}
}
class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		/*
		if (i1 < i2){
			return +1;
		} else if(i1 > i2) {
			return -1;
		} else return 0;
		// Another Descending Technique
		Integer i1 = (Integer) obj1.getId();
		Integer i2 = (Integer) obj2.getId();
		return i2.compareTo(i1);
		*/
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		return s2.compareTo(s1);
		/*
		Student s1 = (Student) obj1;
		Student s2 = (Student) obj2;
		// Descending order
		// if (s1.getId() < s2.getId()){
		// 	return +1;
		// } else if(s1.getId() > s2.getId()) {
		// 	return -1;
		// } else return 0;

		*/

	}
}
public class ComparatorDemo {
	public static void main(String[] args) {
		// System.out.println(-0==+0);
		TreeSet t = new TreeSet(new MyComparator());
		/* Descending order of integer
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		*/
		// Descending order of String
		t.add("Manisha");
		t.add("Samikshya");
		t.add("Aanshu");
		t.add("Samikshya");
		System.out.println(t);

		/*
		// Descending Order of Object according to Object's id
		Student s1 = new Student(1,"Erika");
		Student s2 = new Student(2,"Aayushma");
		Student s3 = new Student(3,"Aashmi");
		t.add(s1);
		t.add(s2);
		t.add(s3);
		System.out.println(t);
		*/
	}
}
