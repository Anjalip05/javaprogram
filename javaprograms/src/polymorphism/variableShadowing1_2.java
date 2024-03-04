package polymorphism;

public class variableShadowing1_2 {
	
	public static void main(String[] args) {
	
		variableShadowing1 v1 = new variableShadowing2();  //upcasting
		
		System.out.println(v1.d);
		System.out.println(v1.a);
       
		
		
        
        
        
        
        
        
      //  variableShadowing2 v2 = (variableShadowing2) v1; //downcasting
        // System.out.println(v2.d);
      //  System.out.println(v2.a);
	}
	
}
