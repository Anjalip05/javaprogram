package oops;

public class book {
	
	int pages;
	String brand;
	String size;
	double price;


  book()
  {
   System.out.println("from book constructer ");	
  }

book(int pages,String brand,String size,double price)

{
	this.pages = pages;
	this .brand = brand;
	this.size=size;
	this.price=price;
	
	System.out.println("values given");
}
public void displaybook()
{
	System.out.println(pages);
	System.out.println(brand);
	System.out.println(size);
	System.out.println(price);
}


}