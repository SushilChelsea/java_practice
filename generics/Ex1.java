class Box {
	private Object obj;
	public void setObject(Object o) {
		this.obj=o;
	}
	public Object getObject() {
		return obj;
	}
}
class Box1<T, E> {
	private T t;
	private E e;
	public void setT(T t) {
		this.t=t;
	}
	public T getT() {
		return t;
	}
	public void setE(E e) {
		this.e=e;
	}
	public E getE() {
		return e;
	}

}
abstract class Pair<K, V> {
	private K key;
    private V value;
	Pair(K key, V value) {
		// System.out.println("parent");
		// System.out.println("key:" + key + "value: " + value);
		this.key = key;
		this.value = value;
	}
    public K getKey()	{ return key; }
    public V getValue() { return value; }
}

class OrderedPair<K, V> extends Pair<K, V> {   
    public OrderedPair(K key, V value) {
		super(key, value);
		// System.out.println("child");
		// System.out.println("key:" + key + "value: " + value);
	}
}
public class Ex1 {
	public static void main(String[] args) {
		//non generic
		Box b = new Box();
		b.setObject(10);
		int boxValue = (Integer) b.getObject(); // type casting required
		// System.out.println(boxValue);	

		//generics
		Box1<Integer, String> b1 = new Box1<>();
		b1.setT(10);
		b1.setE("MMA");
		int boxValue1 = b1.getT(); // type casting not required
		String str = b1.getE(); // type casting not required
		System.out.println(boxValue1);	// 10
		System.out.println(str);		// MMA

		Pair<Integer, String> op = new OrderedPair<>(1, "Colby");
		System.out.println(op.getKey());	//1
		System.out.println(op.getValue());	//Colby	

		Pair<Integer, Box1<Integer, String>> op1 = new OrderedPair<>(111, b1);
		System.out.println(op1.getKey());	//111
		Box1<Integer, String> box = op1.getValue();
		System.out.println(box.getT());
		System.out.println(box.getE());

	}
}