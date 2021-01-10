interface A {
	public int getVal();
}
class B implements A {
	public int getVal() {
		return 5;
	}
}
class C implements A {
	public int getVal() {
		return 10;
	}
}
class D {
	private A a;
	D(A a){
		super();
		this.a = a;
	}
	public int getDval() {
		return a.getVal();
	}
}
public class SpringInterface {
	public static void main(String[] args) {
		D d = new D(new C());
		System.out.println(d.getDval());
	}
}