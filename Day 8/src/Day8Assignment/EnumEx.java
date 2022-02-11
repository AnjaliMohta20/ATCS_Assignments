package Day8Assignment;

public class EnumEx {
	public enum level {
		High,
		Medium,
		Low
	};
	public static void main(String[] args) {
		for(level x:level.values()) {
			System.out.println(x);
		}
	}
}