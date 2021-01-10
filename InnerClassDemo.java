import java.util.*;


class Product {
    
	int id;
   private String name="Laptop";
    
	Product(int id, String name) {
        
		this.id=id;
        this.name=name;
    
	}
    
	Product() {
        
    }
    
	public String toString() {
        
		return "id: " + id +
            " name: " + name;
    
	}
    
	class Sales {
    
		private String name="Desktop";
		TreeSet<Integer> set = new TreeSet<>();
		{
			set.add(100); set.add(90); set.add(80); set.add(70);
		}
		Sales() {
		//	set.add(100); set.add(90); set.add(80); set.add(70);
		}
		public String getProductName() {
			//return Product.this.name; //returning OuterClass variable
			return this.name;	    //returning InnerClass variable
		}
		
    
    }

}
public class InnerClassDemo{

     
	public static void main(String []args){
 
		//Steps to create object of inner class  
		// 1. create outer class object     
		Product p = new Product();
        
 
		//2. OuterClass.InnerClass innerRef = outerRef.new InnerClass();
		Product.Sales s = p.new Sales();   
		Set<Integer> s1 = s.set;
		for(Integer i: s1) {
			System.out.println(i);
		}
		System.out.println(s.getProductName());

	}

}