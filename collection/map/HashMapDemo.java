import java.util.*;

class Emp {
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

public class HashMapDemo{

     public static void main(String []args){
        Emp e1 = new Emp(1, "ratan");
        Emp e2 = new Emp(2, "durga");
        Emp e3 = new Emp(3, "pawan");
        Emp e4 = new Emp(4, "anu");
        Emp e5 = new Emp(5, "naresh");
        Emp e6 = new Emp(6, "shiva");
        
        List<Emp> l = new ArrayList<>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(e4);
        l.add(e5);
        l.add(e6);
        
        List<Emp> ll = l.subList(1, 5);
        List<Emp> lll = ll.subList(1, 3);
        // System.out.println(l);
        // System.out.println(ll);
        // System.out.println(lll);
        
        HashMap<String, List<Emp>> h = new HashMap<>();
        h.put("Durga", l);
        h.put("Naresh", ll);
        h.put("Ratan", lll);
        
        Set<Map.Entry<String, List<Emp>>> s = h.entrySet();
        
        for(Map.Entry<String, List<Emp>> e : s) {
            System.out.println("Institute: " + e.getKey());
            List<Emp> q = (List)e.getValue();
            System.out.println("Teacher");
            System.out.println(q);
        }
        
         
        // HashMap<Integer, String> h = new HashMap<>();
        // h.put(1, "Ratan");
        // h.put(4, "Durga");
        // h.put(2, "Anu");
        // h.put(3, "Pawan");
        
        // System.out.println(h);
        
        // System.out.println("******* Keys Only *******");
        // Set<Integer> s = h.keySet();
        // System.out.println(s);
        
        // System.out.println("******* Values Only *******");
        // Collection<String> s1 = h.values();
        // System.out.println(s1);
        
        // System.out.println("******* Entry *******");
        // Set<Map.Entry<Integer, String>> e = h.entrySet();
        // for(Map.Entry<Integer, String> a: e) {
        //     System.out.println(a.getKey() + " " + a.getValue());
        // }
        
     }
}