package polymorphism;

public class methodShadowing1 {
	
	public static void a() {
		System.out.println("FROM 1 METHODSHADOWING");
	}

	public void xy() {
		System.out.println("parent method call");
		
	}

}
