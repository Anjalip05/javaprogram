package heirarchicalinheritance;

public class child1 extends parent{
	
	public void child1() {
		System.out.println("from child one class");
	}

 public static void main(String[] args) {
	
	 child1 c1 = new child1();
	 c1.parents();
}
	
	
}
