package collectionpac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
public static void main(String[] args) {
	Set<String> ls = new TreeSet<String>();
	ls.add("test3"); 
	ls.add("test1"); 
	ls.add("test2"); 
	ls.add("test4"); 
	ls.add("test4");
	ls.add("test6"); 
	ls.add("test5"); 
	ls.add("test7"); 
	
	ls.remove("test4");
	
	System.out.println(ls.size());
	
	Iterator<String> iter = ls.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
}
}
