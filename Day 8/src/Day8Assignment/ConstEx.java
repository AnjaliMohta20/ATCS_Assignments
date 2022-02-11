package Day8Assignment;
public class ConstEx {
	public ConstEx(){
		this("Raghu");
		System.out.println("This is default constructor");
		
	}
	public ConstEx(String name) {
		this(34,"uy");
		System.out.println("This is param constructor");
	}
	public ConstEx(int n,String name)
	{
		System.out.println("i m param ");
	}
	
	public static void main(String[] arg) {
		ConstEx st = new ConstEx();
	}

}