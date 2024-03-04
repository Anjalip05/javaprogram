package WrapperClass;

public class wrap1 {
	
	public static void main(String[] args) {
		int a =10;
		Integer i1 = new Integer(a);    //BOXING
		System.out.println(i1);
		
		System.out.println(i1.hashCode());
		
		Boolean b1 = new Boolean(false);  //BOXING
		
		System.out.println(b1);
		
	}

}
