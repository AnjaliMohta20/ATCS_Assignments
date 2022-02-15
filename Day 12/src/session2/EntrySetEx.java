package session2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetEx {
public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap();
	h.put(1001, "Ram");
	h.put(2001, "Rita");
	h.put(3002, "Risha");
	Set <Entry<Integer,String>> s=h.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}