package Java;

import java.util.Scanner;

public class atmPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int attempt=0;
		int pin = 1234;
       do {
    
    		System.out.println("enter the password");
    		int pass = sc.nextInt();
    	   if(pass ==pin) {
    		   System.out.println("login successful");
    		   break;
    	   }
    	   else
    	   {
    		   System.out.println("incorrect pin");
    	   }
    	   attempt++;
       }
       while(attempt<5);
       if(attempt==5)
       {
    	   System.out.println("max attempt reached");
       }
    	   
       
	

	}

}
