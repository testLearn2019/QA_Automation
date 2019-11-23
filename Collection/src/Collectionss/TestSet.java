package Collectionss;


import java.util.*;

public class TestSet {

	public static void main(String args[]){
		TreeSet<String> al = new TreeSet<> ();
		al.add("Hi");
		al.add("Hello");
		al.add("Good");
		al.add("Day");
		al.add(" ");
		al.add("oops");
		
		Iterator<String> li= al.iterator();
		
		
		//forward traversal
		while(li.hasNext()){
			System.out.println(li.next());
		}
}
}