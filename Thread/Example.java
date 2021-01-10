class A {
    protected static int num;
    private int number;
    public int meth() {
        // number = num;
        return num;
    }
}

public class Example {
    public static void main(String[] args) throws InterruptedException {
        A.num = 10;
        A a = new A();
        System.out.println(a.meth()); 
    }
}