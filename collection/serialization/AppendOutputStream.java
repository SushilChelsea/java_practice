import java.lang.*;
import java.util.*;
import java.io.*;

public class AppendOutputStream {
	public static void main(String []args) throws IOException, ClassNotFoundException {
		//read from a file
		ArrayList<Emp> l = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));){
            while (true) {
                l = (ArrayList<Emp>)ois.readObject();
            }
        } catch (EOFException eof) {
            System.out.println("Reached end of file");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
		
		for(Emp ll: l) {
			System.out.println(ll);
		}
		System.out.println("Now Adding to ArrayList and saving to File using ObjectOutputStream");	
		
		//Writing to a file
		/*
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		l.add(new Emp(5, "Pratik"));
		for(Emp ll: l) {
			System.out.println(ll);
		}
		oos.writeObject(l); 
		oos.flush();
		oos.close();
		*/
    }
}
