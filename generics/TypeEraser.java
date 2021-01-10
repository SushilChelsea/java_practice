abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Draw Circle");
    }
}
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
class Client<T extends Shape> { 
//if extends Shape is not provided then java compiler replaces T with Object class and Object class don't draw method which will throw error
    T obj;
    Client(T obj) {
        this.obj = obj;
    }
    public void clientDraw() {
        obj.draw();
    }
}
public class TypeEraser
{
	public static void main(String[] args) {
	    Circle c = new Circle();
	    Client<Circle> client = new Client(c);
	    Rectangle r = new Rectangle();
	    Client<Rectangle> client2 = new Client(r);
	    //client.clientDraw();
	    drawShape(client);
	    drawShape(client2);
	}
	public static <T extends Client> void drawShape(T obj) {
		//if extends Client is not provided then java compiler replaces T with Object class and Object class don't clientDraw method which will throw error
	    obj.clientDraw();
	}
}