package oops;

public class laptopDriver {
	

	public static void main(String[] args) {
		
		laptop l1 = new laptop();
		l1.Brand ="ASUS";
		l1.Processer = "I5";
		l1.Price = 580000.00;
		l1.RAM = 8;
		
		
		System.out.println(l1.Brand);
		System.out.println(l1.Processer);
		System.out.println(l1.Price);
		System.out.println(l1.RAM);
		
		laptop l2 = new laptop();
		
		l2.Brand ="Hp";
		l2.Price = 600000;
		l2.Processer = "I7";
		l2.RAM = 16;
		
		System.out.println(l2.Brand);
		System.out.println(l2.Price);
		System.out.println(l2.Processer);
		System.out.println(l2.RAM);
		
		
		
		
		
	}

}
