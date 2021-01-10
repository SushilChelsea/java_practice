class Animal {
    
}
class Dog extends Animal {
    
}
class Box<T> {

    private T t;          

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Animal> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
}
public class Main1 {
    public static void main(String[] args) {
        Box<Animal> integerBox = new Box<Animal>();
        integerBox.set(new Animal());
        integerBox.<Dog>inspect(new Dog()); 
    }
}