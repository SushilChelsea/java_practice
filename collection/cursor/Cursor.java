import java.util.*;


class Book {
    
	int id;
    
	String name, author;
    
    
	Book(int id, String name, String author){
        
		this.id=id;
        
		this.name=name;
        
		this.author=author;
    
	}
    
    
	public String toString(){
        
	return "id: " + id +
                
		", Book Name: " + name +
                
		", Author Name: " + author;
    
	}

}

public class Cursor{

     
	public static void main(String []args){
        
		Vector<Book> l = new Vector<>();
        
		l.add(new Book(111, "Spring Core", "Sushil"));
        
		l.add(new Book(112, "Spring MVC", "Prakash"));
        
		l.add(new Book(113, "Javascript the guide", "Sushil"));
        
        
		System.out.println(l);
        
        
		
		/*** Enumeration ***/
        
		/*Enumeration<Book> e = l.elements();
        
		while(e.hasMoreElements()) {
            
			Book book = e.nextElement();
            
			System.out.println(book);
        
		}
        
		System.out.println(l);
        
		while(e.hasMoreElements()) {
            
			Book book = e.nextElement();
            
			System.out.println(book);
        
		}*/
        
        

		/*** Iterator ***/
        
		Iterator<Book> e = l.iterator();
        
		while(e.hasNext()) {
            
			Book book = e.next();
            
			if(book.id == 111)
                
				e.remove();
            
			// System.out.println(book);
        
		}
        
		System.out.println(l);
        
		while(e.hasNext()) {
            
			Book book = e.next();
            
			System.out.println(book);
        
		}
        
        

		/*** ListIterator ***/
        
		/*ListIterator<Book> e = l.listIterator();
        
		while(e.hasNext()) {
            
			Book book = e.next();
            
			if(book.id == 111)
                
				e.remove();
            
			// System.out.println(book);
        
		}
        
		System.out.println(l);
        
		while(e.hasNext()) {
            
			Book book = e.next();
            
			System.out.println(book);
        
		}
*/
        
        
     
	}

}