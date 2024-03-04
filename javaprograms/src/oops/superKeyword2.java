package oops;

public class superKeyword2 extends superKeyword{

	public void child() {
		super.parent();
		System.out.println("anjali");
	}
	
	public static void main(String[] args) {
		
		superKeyword2 sp = new superKeyword2();
		sp.child();
	    
		
	}
}
//THIS KEYWORD CAN BE PRINTED BUT SUPER KEYWORD CANOT BE PRINTED
//syso(this.name); true can be printed
//syso(super.name); false CTE cannot be printed