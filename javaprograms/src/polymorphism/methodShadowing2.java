package polymorphism;

public class methodShadowing2 extends methodShadowing1 {

	
	public void xy() {
		System.out.println("from 2 non static method shadowing");
	}
	
	public  static void a() {
		System.out.println("FROM 2 METHODSHADOWING");
	}
}
