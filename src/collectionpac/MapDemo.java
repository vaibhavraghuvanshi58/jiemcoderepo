package collectionpac;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {
public static void main(String[] args) {
	// key value
	Map<String,String> m1 = new Hashtable<String, String>();
	
	m1.put("key1", "test1"); //  Entry1
	//m1.put("key2", "test2"); // Entry2
	m1.put("key3", "test3"); // Entry3
	m1.put("key2", "test4"); // Entry4  Set
	
	System.out.println(m1.get("key2"));
	for(Entry<String,String> en: m1.entrySet()) {
		System.out.println(en.getKey() + " = " + en.getValue());
	}
	
	
}
}
