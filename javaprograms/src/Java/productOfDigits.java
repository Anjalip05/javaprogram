package Java;

public class productOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 1;
		while(num!=0)
		{
			int rem = num%10;
			sum =sum*rem;
			num/=10;
		}
		System.out.println(sum);
		

	}

}
