package oops;

public class bookdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		book b1 = new book();
		b1.pages = 100;
		b1.brand = "camlin";
		b1.size = "A5";
		b1.price = 105;
		
		b1.displaybook();
		
		
		book b2 = new book();
		b2.brand = "classmate";
		b2.pages = 200;
		b2.size = "A4";
		b2.price = 300;
		b2.displaybook();

	}

}
