class A {
    
}
interface B {
    
}
interface C {
    
}
class Child extends A implements B, C{
    
}
class D <T extends A & B & C> {
    T obj;
    void setObject(T obj) {
        this.obj = obj;
    }
    T getObject() {
        return obj;
    }
    public String toString() {
        return "T: " + obj.getClass().getName();
    }
}
public class Main2 {
    public static void main(String[] args) {
        D<Child> d1 = new D<>();
        d1.setObject(new Child());
        System.out.println(d1);
    }
}