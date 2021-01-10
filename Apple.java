class Joker {
	public void laugh(){
		System.out.println("Ha..Ha..Ha..");
	}
	public void sad(){
		System.out.println("why so serious");
	}
}
public class Apple extends Joker {
	public static void main(String[] args) {
		Apple a = new Apple();
		a.m1();
		Apple a1 = new Apple();
		a1.m2();
	}
	public void m1() {
		System.out.println(this);
		this.laugh();
	}
	public void m2() {
		System.out.println(this);
		this.sad();
	}
}
