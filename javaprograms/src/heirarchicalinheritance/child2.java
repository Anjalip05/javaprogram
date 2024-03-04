package heirarchicalinheritance;

public class child2 extends parent{

	public void child2()  {
		System.out.println("from child2 class");
	}

	
	public static void main(String[] args) {
		
		 child2 c2 = new child2();
		 c2.parents();
	}
}
