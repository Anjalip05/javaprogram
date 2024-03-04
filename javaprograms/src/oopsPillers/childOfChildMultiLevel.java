package oopsPillers;

public class childOfChildMultiLevel extends childMultiLevel{
	
	public void childofchild() {
		System.out.println("from child of child");
	}

	
	public static void main(String[] args) {
		 
		childOfChildMultiLevel c3 = new childOfChildMultiLevel();
		c3.parent();
		c3.child();
		c3.childofchild();
		
	}
}
