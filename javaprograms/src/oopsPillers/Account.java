package oopsPillers;

public class Account { 
	
	private long ACno;
	private int pin;
	private double balance;
	
	public  static long getACno(long ACno) {
		return ACno;
		
	}
	public  void setpin(int oldpin,int newpin) {
		if(oldpin==pin)
		{
			this.pin=newpin;
			System.out.println("updated pin");
			
		}
		else
		{
			System.out.println("incorrect pin");
		}
	}
	public double getbalance(long Acno,int pin) {
		
		if(Acno==this.ACno&&pin==this.pin)
		{
			return this.balance;
		}
		else
		{
			return 0 ;
		}
	}
  //IF WE HAVE USED USERDEFINED CONSTRUCTER THEN TOO WE HAVE TO ADD DEFAULT CONSTRUCTOR FOR SAFER SIDE
	Account(){}
	
	Account(long Acno,int pin,double balance){
		this.ACno = Acno;
		this.pin = pin;
		this.balance=balance;
		
		System.out.println("account created");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	


