import java.util.*;

class Box<T> {
    List<T> lst = new ArrayList<>();
    
    public void add(T obj) {
        lst.add(obj);
    }
    public List<T> get() {
        return lst;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Box<Number> b = new Box();
        b.add(new Integer(10));
        b.add(new Double(10.0));
        List<Number> lst = b.get();
        for(Number n: lst) {
            System.out.println(n);
        }
        boxTest(b);
        
        Box<Integer> b1 = new Box();
        //boxTest(b1); 				//throws errors, method expecting class Box of type Number
    }
    
    public static void boxTest(Box<Number> n){
        
    }

}