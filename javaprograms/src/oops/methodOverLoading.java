package oops;

public class methodOverLoading {

public static void main(String[] args) {
	
	System.out.println(add(10,20));
	System.out.println(add(10.3,20.4));
	System.out.println(add(2,2.4));
	System.out.println(add(2.6,4));
	
}
	public static int add(int a,int b) {
		return a +b;
	}
	public static double add(double a,double b) {
		return a*b;
	}
	
	public static double add(int c,double d) {
		return c-d;
	}
	public static double add(double f,int g) {
		return f*g;
		
	}
	
	
	
	
	
	
	
	
}