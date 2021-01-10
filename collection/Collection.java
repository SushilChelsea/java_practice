import java.lang.*;
import java.util.*;

class Emp {
    int id;
    String name;
    
    Emp(int id, String name) {
        this.id=id;
        this.name=name;
    }
    
    public String toString(){
        return "id: " + id +
                " name: " + name;
    }
    
    public int hashCode() {
        return this.id;
    }
    
    public boolean equals(Object o) {
        
        if(this.getClass() != o.getClass()) {
            return false;
        }
        if(this == o) {
            return true;
        }
        
        Emp e = (Emp) o;
        if(this.id == e.id) {
            return true;
        } else {
            return false;
        }
        
        
    }
    
}
class EmpidComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        return (e1.id==e2.id)?0:(e1.id<e2.id)?1:-1;
    }
}

public class Collection{

     public static void main(String []args){
        Emp e1 = new Emp(1, "anu");
        Emp e2 = new Emp(2, "ratan");
        Emp e3 = new Emp(3, "durga");
        Emp e4 = new Emp(1, "anu");
        ArrayList<Emp> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(null);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e1);
        employees.add(null);
        
        System.out.println("******* ArrayList *******");
        for(Emp e: employees) {
            System.out.println(e);
        }
        
        
        LinkedHashSet<Emp> hash = new LinkedHashSet<>(employees);
        System.out.println("******* LinkedHashSet *******");
        for(Emp e: hash) {
            System.out.println(e);
        }
        
        Iterator<Emp> itr = hash.iterator();
        while(itr.hasNext()) {
            Emp e = itr.next();
            if(e == null) {
                itr.remove();
            }
        }
        
        employees = new ArrayList<>(hash);
        Collections.sort(employees, new EmpidComparator());
        System.out.println("******* After Collections sort *******");
        for(Emp e: employees) {
            System.out.println(e);
        }
        
     }
}