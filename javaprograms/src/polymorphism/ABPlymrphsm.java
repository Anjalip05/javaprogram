package polymorphism;

public class ABPlymrphsm{
	
	public static void main(String[] args) {
		
	 APlymrphsm A1 = new BPlymrphsm();   //upcasting
	 A1.left();
	 A1.right();
	 
		
	  
	 
	// BPlymrphsm  B1 = (BPlymrphsm) A1;   //DOWNCASTING
	// B1.reverse();
	// B1.forward();
		
	}

}
