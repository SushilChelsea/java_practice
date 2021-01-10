import java.util.*;

class Model {
    String name;
    String amount;
    public Model(String name, String amount) {
        this.name=name; this.amount=amount;
    }
    public String toString() {
        return "name: " + name + ", amount: " + amount;
    }
}
public class GroupAListByField
{
	public static void main(String[] args) {
        List<Model> lst = new ArrayList<>();
        lst.add(new Model("Sushil", "1000"));
        lst.add(new Model("Sushil", "2000"));
        lst.add(new Model("Sushil", "3000"));
        lst.add(new Model("Sandeep", "1000"));
        lst.add(new Model("Sandeep", "1000"));
        lst.add(new Model("Sandeep", "1000"));
        
        lst.forEach(System.out::println);
        
        Map<String, String> map = new HashMap<>();
        for(Model m: lst) {
            String key = m.name;
            String value = m.amount;
            if (map.get(key) == null) {
                map.put(key, m.amount);
            } else {
                int total = Integer.parseInt(map.get(key)) + Integer.parseInt(m.amount);
                String tol = total+"";
                map.put(key, tol);
            }
        }
        
		System.out.println("=============================");
		
        List<Model> newLst = new ArrayList<>();
        map.forEach((k, v)->{
            newLst.add(new Model(k, v));
        });
        newLst.forEach(System.out::println);
        
	}

}
