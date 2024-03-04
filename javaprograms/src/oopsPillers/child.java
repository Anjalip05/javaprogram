package oopsPillers;

public class child extends parent{
	//SINGLE LEVEL INHERITANCE
 
	public  void add() {
		System.out.println("i m in child class");
		
	}
public static void main(String[] args) {
		
		child c1 = new child();
		c1.add();
		c1.sub();
		
	}
	
}
