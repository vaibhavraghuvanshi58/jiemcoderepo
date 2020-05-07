package collectionpac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {
public static void main(String[] args) {
	// array - we have to define the size
	
	
	// Iterator
	//foreach
	
//	int[] marksArray = new int[] {10,20,30,50,30};
	// how to implement for each loop
//	
//	for(int i : marksArray) {
//		System.out.println(i);
//	}
	
//	Generics
	List<String> ls = new LinkedList<String>();
	ls.add("test1"); // 0
	ls.add("test2"); // 1
	ls.add("test3"); // 2
	ls.add("test4"); // 3
	ls.add("test5"); // 4
	ls.add("test6"); // 5
	ls.add("test7"); // 6
	
	System.out.println(ls.size());
	System.out.println(ls.get(2));
	ls.remove(2);
	System.out.println(ls.get(2));
	
//	for(String s : ls) {
////		System.out.println(s);
//	}
//	
//	Iterator<String> iter = ls.iterator();
//	while(iter.hasNext()) {
////		System.out.println(iter.next());
//	}
	
	
	
}
}
