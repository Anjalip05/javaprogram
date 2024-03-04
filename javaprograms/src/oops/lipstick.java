package oops;

public class lipstick {
	
	
	//METHOD CHAINING
	
	String brand ="NYKKA";
	double price = 500;
	double quantity = 3.5;
	
	public lipstick showbrand(){
		
		System.out.println(brand);
		return this;
		
	}
	
	public lipstick showprice() {
		double price = 1000;
		System.out.println(price);
		System.out.println(this.price);
		return this;
		
	}
	public lipstick showquantity() {
		
		System.out.println(quantity);
		return this;
	}

}
