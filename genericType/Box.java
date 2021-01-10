class Student {
	String name;
	Student(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "name: " + this.name;
	}
}

public class Box<T> { //T is variable type

	private T t;
	
	public void add(T t) { 
		this.t = t;
	}
	
	public T getT(){
		return this.t;
	}
	
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();  // Box object of type Integer
		Box<String> strBox = new Box<>();   // Box object of type String
		Box<Student> studBox = new Box<>(); // Box object of type Student 
		
		intBox.add(new Integer(10));
		strBox.add(new String("Hello"));
		studBox.add(new Student("Sushil"));
		
		System.out.println(intBox.getT());  // 10
		System.out.println(strBox.getT());  // Hello
		System.out.println(studBox.getT()); // name: Sushil
		
	}

}