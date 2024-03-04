package oopsPillers;

public class AccountDriver {

	public static void main(String[] args) {
		
		Account a1  = new Account(1234567897,1234,500000);
		System.out.println(a1.getbalance(1234567897, 1234));
		System.out.println(a1.getACno(1343333));
		a1.setpin(1234, 0507);
		
		
      
	}

}
