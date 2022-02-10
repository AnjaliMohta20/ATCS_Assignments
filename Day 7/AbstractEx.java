
abstract class Beverages {
	abstract void addIngredient();
	void addMilk() {
		System.out.println("Add Milk");
	}
}
class Tea extends Beverages {

	void addIngredient() {
		System.out.println("Add Tea");
	}
}

class Coffee extends Beverages {
	void addIngredient() {
		System.out.println("Add Coffee");
	}
}
public class AbstractEx{
	public static void main(String[] args) {
		Coffee c=new Coffee();
		Tea t=new Tea();
		c.addMilk();
		t.addIngredient();
		c.addIngredient();
		
		}

	}

