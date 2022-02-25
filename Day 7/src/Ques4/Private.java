package Ques4;


class PrivateClass {
protected int a=10;
public int b=12;
protected void show() {
	System.out.println("I am private");
}
}
public class Private extends PrivateClass{
	public static void main(String[] args) {
		Private p=new Private();
		System.out.println(p.a);
		p.show();
		System.out.println(p.b);
	}
}

