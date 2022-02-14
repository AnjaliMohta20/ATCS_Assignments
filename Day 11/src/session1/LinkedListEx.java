package session1;
import java.util.LinkedList;
public class LinkedListEx {
	
	public static void main(String[] args) {
		LinkedList al=new LinkedList();
		al.add(12);
		al.add(45.6f);
		al.add("anjali");
		al.add(true);
		al.add(null);
		al.add('s');
		System.out.println("The values are: "+al);
		System.out.println("List Size: "+al.size());
		System.out.println("Contains Anjali: "+al.contains("anjali"));
		System.out.println("first element: "+al.getFirst());
		System.out.println("Last Elemrnt: "+al.getLast());
		System.out.println("remove one: "+al.remove());
		System.out.println("now the size is:"+al.size());
		al.add(12);
		System.out.println("again added 12");
		System.out.println("removing 4th element"+al.remove(4));
		System.out.println("Size: "+al.size());
		
	}

}
