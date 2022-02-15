package session1;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetIterator {
	
    public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(1);
		h.add(2.9f);
		h.add(3.09);
		h.add("Hii");
	Iterator i=h.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());}
	}
	}
