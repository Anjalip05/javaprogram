package Java;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num =101;
        int reverse = 0;
        int temp = num;
        while(num!=0)
        {
        	int rem = num%10;
        	reverse = (reverse *10)+rem;
        	num = num/10;
        }
        if(temp==reverse)
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("not");
        	System.out.println("program done");
        }
	     	
		
		
		
		
		
		
		
		
		
	
	}

}
