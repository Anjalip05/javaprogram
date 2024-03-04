package Java;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = 4;
       int i ;
       for(i=2;i<num;i++)
       {
    	   if(num%i==0)
    	   {
    		   break;
    	   }
    	  
       }
       if(i==num)
	   {
		   System.out.println("prime");
	   }
	   else
	   {
		   System.out.println("not ");
	   }
		
		
		
		
		
		
	}

}
