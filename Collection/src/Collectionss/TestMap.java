package Collectionss;

import java.util.*;

public class TestMap {
	
	public static void main(String args[]){
		
		HashMap <Integer,String> m = new HashMap<> ();
		m.put(3, "Tom");
		m.put(2, "Mom");
		m.put(1,"bom");
		m.put(5,"kom");
		m.put(4,"nom");
		
		HashMap <String,String> mp=new HashMap<String,String>();
		mp.put(" a","Hello");
		mp.put(" " , "oops");
		mp.put(" c" , "oops");
		mp.put("e", "ohooo");
		mp.put("d" , "Hello");
		
		for (Map.Entry  kv : mp.entrySet()) {
			System.out.println(kv.getValue());
			
		}
	}
}
