package session1;
import java.util.ArrayList;
public class ArrayListEx {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(45.6f);
		al.add("anjali");
		al.add(true);
		al.add(null);
		al.add('s');
		
		//using for loop 
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
			
		}
		System.out.println();
		//for each loop
		System.out.println("for each loop");
		for(Object o:al) {
			System.out.print(o+" ");
			
		}
		
		
		
	}

}
