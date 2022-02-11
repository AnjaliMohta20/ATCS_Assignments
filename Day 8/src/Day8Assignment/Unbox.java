package Day8Assignment;


public class Unbox {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer i=new Integer(50);
		int j=i.intValue();
		int k=j;
		System.out.println(i+" "+j+" "+k);
				

	}

}
