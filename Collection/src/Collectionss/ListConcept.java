package Collectionss;
import java.util.*;
public class ListConcept {

	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<> ();
		al.add("Hi");
		al.add("Hello");
		al.add("Good");
		al.add("Day");
		al.add(3," ");
		System.out.println("before trim " +al.size());
		al.trimToSize();
		System.out.println("after trim " +al.size());
		al.add("oops");
				
		System.out.println("4th element " +al.get(3));
		ListIterator<String> li= al.listIterator();
		
		//forward traversal
		while(li.hasNext()){
			System.out.println(li.next());
		}
		
		//backward traversal
		while(li.hasPrevious()){
			System.out.println(li.previous());
		} 	
		
		//traverse using forEach
		for (String string : al) {
			System.out.println(string);
		}
	}	
}
