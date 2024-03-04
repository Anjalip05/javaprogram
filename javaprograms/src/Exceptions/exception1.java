package Exceptions;

import java.util.Scanner;

public class exception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int a = sc.nextInt();
		
		System.out.println("enter 2nd no");
		int b = sc.nextInt();
		
		
		try {
			int res = a/b;
			System.out.println(res);
		}
		
		catch(  Exception e){
			System.out.println(e);
			System.out.println("dont divide by zero");
		}
		{
			System.out.println("thanku");
		}
	
		
		
		
		
		
	}

}
