package Array;

public class sumofarray {

	public static void main(String[] args) {
		int a [] = new int [6];
		
		a[0] =10;
		a[1]= 10;
        a[2] =10;
		a[3] =10;	
		a[4] =10;
		a[5] =10;
		
		
		int sum = 1;
		for(int i=0;i<a.length;i++)
		sum =sum  *a[i];
		System.out.println(sum);
		
				
	}

}
