package ObjectClass;


	
	public class bottle1{
		String name;
		String brand;
		int price;
		
		 public bottle1(){}
		
		public bottle1(String name,String brand,int price) {
			
			super();
			this.name = name;
			this.brand = brand;
			this.price= price;
		}
		
		
		public String toString()
		{
			return"[name:"+name+",price:"+price+",brand:"+brand+"]";
		}
		
		
	}


