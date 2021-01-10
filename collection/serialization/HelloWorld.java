import java.lang.*;
import java.util.*;
import java.io.*;

class Emp implements Serializable {
    int id;
    String name;
    
    Emp(int id, String name) {
        this.id=id;
        this.name=name;
    }
    public String toString() {
        return "id: " + id +
                " name: " + name;
    }
    
}
public class HelloWorld {
    
    void serializationDemo(Emp e) {
        try {
            FileOutputStream fs = new FileOutputStream("abc.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            try {
              os.writeObject(e);  
            } catch(IOException ex) {
                System.out.println("Got IOException");
            } finally {
                os.close();
            }
            System.out.println("Serialization Process Completed....");
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
	
	void serializationListDemo(List l) {
        try {
            FileOutputStream fs = new FileOutputStream("abc.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            try {
              os.writeObject(l);  
            } catch(IOException ex) {
                System.out.println("Got IOException");
            } finally {
                os.close();
            }
            System.out.println("Serialization Process Completed....");
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    void deserializationDemo() {
        Emp e = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
            e = (Emp)ois.readObject();
        } catch (IOException ex) {
            System.out.println("Got IOException");
        }  catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFound Exception");
        } finally{
            System.out.println("Deserialization Process Completed....");
            System.out.println(e); 
        }       
    }
	List<Emp> deserializationListDemo() {
        ArrayList<Emp> l= null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
            l = (ArrayList<Emp>)ois.readObject();
        } catch (IOException ex) {
            System.out.println("Got IOException");
        }  catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFound Exception");
        } finally{
            System.out.println("Deserialization Process Completed....");
            return l;
        }       
    }
	
	public void myPrint(List<Emp> al) {
		for(Emp l: al) {
			System.out.println(l);
		}
	}
	
     public static void main(String []args) {
        /*
        HelloWorld h = new HelloWorld();
        h.serializationDemo(new Emp(1, "ratan"));
        h.deserializationDemo();
        */
		
		List<Emp> al = new ArrayList<>();
        al.add(new Emp(1, "ratan"));
        al.add(new Emp(2, "durga"));
        al.add(new Emp(3, "anu"));
		
		HelloWorld h = new HelloWorld();
        //h.serializationListDemo(al); // arraylist is serialized and save in abc.txt file
		
        //al = h.deserializationListDemo(); // serialized file abc.txt is read and deserialized and stored in arraylist
		//h.myPrint(al);	
		
		al.add(new Emp(4, "pawan"));
		h.serializationListDemo(al);
		
		//al = h.deserializationListDemo();
		//h.myPrint(al);
		
     }
}