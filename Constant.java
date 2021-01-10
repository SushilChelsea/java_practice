class Student {
	String name;
	int id;
	Student(String name, int id){
		this.name=name;
		this.id=id;
	}
}
public class Constant {
	static int a;
	//final int b;	// final primitive variable needs to be initialized
	public static void main(String[] args) {
		final  double PI=3.14;
		final  Student s1 = new Student("John", 1);
		s1.name="Terry";
		s1.id=2;
		// s1 =new Student("Lampard", 3); // s1 is final so not allowed to create new object
		System.out.println(s1.id + " " + s1.name);
		System.out.println(PI);
		System.out.println(Constant.a);
		//System.out.println(new Constant().b);
	}
}