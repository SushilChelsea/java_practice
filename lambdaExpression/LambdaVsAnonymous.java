import java.util.function.*;

@FunctionalInterface
interface Foo {
	String method();
}
public class LambdaVsAnonymous
{
	private String value="A";
	public static void main(String[] args) {
		new LambdaVsAnonymous().test();
	}
	public void test() {
		Foo foo = new Foo(){
			String value="B";
			public String method() {
				return this.value;		// this reference to inner class
			}
		};
		System.out.println(foo.method()); //prints "B"
		System.out.println("=============================");
		
		Foo foo1 = ()->{
			String value="C";
			return this.value;	//in lambda this reference to the enclosing class inside which lambda is written
		};
		System.out.println(foo1.method()); //prints "A" not "C"
		
	}
}