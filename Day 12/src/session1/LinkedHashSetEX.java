package session1;

import java.util.LinkedHashSet;

public class LinkedHashSetEX {
public static void main(String[] args) {
	LinkedHashSet lh=new LinkedHashSet();
	for(int i=0;i<10;i++) {
		lh.add(i);
	}
	lh.add("Hii!");
	lh.add(12);
	lh.add(12);
	lh.add(true);
	System.out.println(lh);
}
}
