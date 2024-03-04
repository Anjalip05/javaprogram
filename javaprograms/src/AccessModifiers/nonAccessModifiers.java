package AccessModifiers;

public class nonAccessModifiers {
	
	public final void abc() {
		System.out.println("i m final");
		
	}
	
	
	public static void main(String[] args) {
		nonAccessModifiers a1 = new nonAccessModifiers();
		a1.abc();
		
	}

}
