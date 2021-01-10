import java.util.*;

class Util {
    public static <T> boolean compare(Box<T> b1, Box<T>b2) {
        return b1.getObject()==b2.getObject();
    }
    public static <T> boolean compare(Box<T> b1, Tox<T>b2) {
        return b1.getObject()==b2.getObject();
    }
}
class Tox<T> {
    T obj;
    public void setObject(T obj) {
        this.obj = obj;
    }
    public T getObject(){
        return obj;
    }
    public String toString() {
        return obj.getClass().getName() + ": " + obj;
    }
}
class Box<T> {
    T obj;
    public void setObject(T obj) {
        this.obj = obj;
    }
    public T getObject(){
        return obj;
    }
    public String toString() {
        return obj.getClass().getName() + ": " + obj;
    }
}
public class Main
{
	public static void main(String[] args) {
		Box<String> b1 = new Box();
		b1.setObject("My String");
		System.out.println(b1);
		
		Box<Integer> b2 = new Box();
		b2.setObject(11);
		System.out.println(b2);
		
		Box<Integer> b3 = new Box();
		b3.setObject(12);
		System.out.println(b3);
		
		boolean check = Util.compare(b2, b3);
		System.out.println(check);
		
		Tox<Integer> t3 = new Tox();
		t3.setObject(12);
		System.out.println(t3);
		
		boolean check1 = Util.compare(b3, t3);
		System.out.println(check1);
		
		Box<String> b4 = new Box();
		b4.setObject("Box String");
		Tox<String> t4 = new Tox();
		t4.setObject("Tox String");
		boolean check2 = Util.<String>compare(b4, t4);
		System.out.println(check2);
		
		List<Integer> lst = new ArrayList<>();
		lst.add(100);
		lst.add(400);
		lst.add(200);
		lst.add(600);
		Box<List<Integer>> b5 = new Box();
		b5.setObject(lst);
		Tox<List<Integer>> t5 = new Tox();
		t5.setObject(lst);
		boolean check3 = Util.<List<Integer>>compare(b5, t5); 
		//or
		//boolean check3 = Util.compare(b5, t5); //compiler will infer the type that is needed. This feature, known as type inference.
		System.out.println(check3);
	}
}