package session1;

import java.util.HashSet;

public class HashSetGeneric {
	
  public static void main(String[] args) {
			HashSet <String>h=new HashSet();
			HashSet <String>h1=new HashSet();
			h.add("Hii!");
			h.add("Good");
			h.add("morning");
			h1.add("Hello");
			h1.add("Bye");
			//adding two hash set
			h.addAll(h1);
			System.out.println(h);
			//removing an object from set
		   h.remove("Bye");
		   System.out.println(h);
		   //removing h1 elements from h set
		   h.retainAll(h1);
		   System.out.println(h);
		}
}