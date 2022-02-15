package session1;

import java.util.LinkedHashSet;
import java.util.Iterator;
public class LinkedHashIter {
	
	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		for(int i=0;i<10;i++) {
			lh.add(i);
		}
		lh.add("Hii!");
	    Iterator i=lh.iterator();
	    while(i.hasNext()) {
	    	
		System.out.println(i.next());
	}
	}
}
