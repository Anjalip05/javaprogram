package polymorphism;

public class methodShadowing1_2 {
public static void main(String[] args) {
	
	methodShadowing1 m1 = new  methodShadowing2();   //upcasting
	//methodShadowing2 m2 = (methodShadowing2) m1;
	m1.xy();
	m1.xy();
	m1.a();
	m1.a();
}
}
