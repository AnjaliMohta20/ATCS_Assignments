package session1;

import java.util.HashSet;

public class HashSetEx {
public static void main(String[] args) {
	HashSet h=new HashSet();
	for(int i=0;i<10;i++) {
		h.add(i);
	}
	h.add(10);
	System.out.println(h);
}
}