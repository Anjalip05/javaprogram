package WrapperClass;

public class wrap2 {
	
public static void main(String[] args) {
	Integer i1 = new Integer(20);
	Double d1 = new Double(20.1);
	Character c1 = new Character('a');
	
	
	int a = i1.intValue();   //UNBOXING
	System.out.println(a);
	
	double d = d1.doubleValue();  //unboxing
	System.out.println(d);
	
	char c = c1.charValue();    //UNBOXING
	System.out.println(c);
	
	

	
}

}
