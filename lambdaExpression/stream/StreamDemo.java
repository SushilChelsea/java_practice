import java.util.*;
import java.util.stream.*;

public class StreamDemo
{
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(0);
		lst.add(5);
		lst.add(10);
		lst.add(15);
		lst.add(20);
		
		Comparator<Integer> c = (i1, i2)->i1.compareTo(i2);
		System.out.println(lst.stream().min((i1, i2)->i1.compareTo(i2))); //min vaneko starting element ho, ascending order ko min vaneko 0 vayo
		System.out.println(lst.stream().max((i1, i2)->i2.compareTo(i1))); //max vaneko last element ho, descending order ko max vaneko 0 vayo
		
		List<Integer> l1 = lst.stream()
		                      .filter(o->o<10) 	//filter out less than 10
		                      .map(o->o+5)		//mathi bata filter out gareko ma plus 5 garche
		                      .filter(o->o<10)	//mathi ko 2 step pachi feri 10 vanda less lai filter garcha
		                      .collect(Collectors.toList()); //list ma collect garcha
		                      
		System.out.println(lst.stream().filter(o->o<10).map(o->o+5).filter(o->o<10).count());
		
	    Integer l2 = lst.stream()
		                      .filter(o->o<10)
		                      .map(o->o+5)
		                      .filter(o->o<10)
		                      .findFirst().get();    
		                      
		System.out.println(lst.stream().filter(o->o<10).map(o->o+5).filter(o->o<10).get());
		
		List<Integer> l3 = lst.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(l3);
	}
}
