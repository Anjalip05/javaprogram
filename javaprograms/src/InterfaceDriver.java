
public class InterfaceDriver  implements interfceA , interfaceB{

	/*public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}
 
	public static void m3() {
		System.out.println("m2 method");
	}/*
	
	
	public static void main(String[] args) {
       
		////InterfaceDriver i = new InterfaceDriver();
i.m1();
		
		
		InterfaceDriver.m2();
		
		
	}*/

         
	public static void main(String[] args) {
		System.out.println(interfceA.a);
		System.out.println(interfaceB.a);
		interfceA.grade();
		interfaceB.grade();
		
		
		
	}
	

	  

}
