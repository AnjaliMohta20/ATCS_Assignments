package session1;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
public class EvenArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		
		for(int i=0;i<10;i++) {
			al.add(i);
		}
		System.out.println("EVEN NUMBERS");
		for(Object o:al) {
			Integer i = (Integer) o;
			if(i%2==0) {
				System.out.print(o+" ");
			}
		}
		System.out.println();
		
		System.out.println("-----------------------USING ITERATOR----------------------------");
		Iterator i=al.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		
		System.out.println();
		
		System.out.println("-----------------------USING LIST ITERATOR-----------------------");
		
		System.out.println("FORWARD DIRECTION");
		ListIterator ltr=al.listIterator();
		
		while(ltr.hasNext()) {
			System.out.print(ltr.next()+" ");
		}
		
		System.out.println();
		System.out.println("REVERSE DIRECTION");
		
		
		while(ltr.hasPrevious()) {
			System.out.print(ltr.previous()+" ");
		}
		
	}

}
