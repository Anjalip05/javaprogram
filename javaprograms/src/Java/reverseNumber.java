package Java;

public class reverseNumber {

	public static void main(String[] args) {
		int num =1234;
		while(num!=0)
		{
			int rem = num%10;
			//System.out.println(rem);
			System.out.print(rem);     //321
			num = num/10;             //
		}
		
		
	}
}
