package oops;

public class instanceOf1 {

	public void abc() {
		System.out.println("from x class");
	}
	
	public static void main(String[] args) {
		instanceOf1 a = new instanceOf1();
		System.out.println(a instanceof instanceOf1);
		
	}
}
