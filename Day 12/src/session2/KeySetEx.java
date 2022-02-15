package session2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class KeySetEx {
public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap();
	h.put(1001, "Apple");
	h.put(2001, "orange");
	h.put(3002, "Banana");
	Set <Integer> s=h.keySet();
	Iterator i=s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
}
