package oops;

public class acDriver {
public static void main(String[] args) {
	ac a1 = new ac();
	
	a1.Brand ="lg";
	a1.MaxTemp= 32;
	a1.MinTemp = 17;
	a1.Price = 500000;
	
	
	a1.displayBrand();
	a1.displaymaxtemp();
	a1.displaymintemp();
	a1.displayprice();
}
}
