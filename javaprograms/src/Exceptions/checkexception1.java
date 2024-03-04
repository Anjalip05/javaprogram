package Exceptions;

import java.util.Scanner;

public class checkexception1 {
		public static void main(String[] args) {
 
			 int[] arr = new int[4];
		        try
		        {
		            int i = arr[3];
		                 
		            // this statement will never execute
		            // as exception is raised by above statement
		            System.out.println("Inside try block");
		        }
		        catch(ArrayIndexOutOfBoundsException ex)
		        {
		            System.out.println("Exception caught in Catch block");
		        }
		        finally
		        {
		            System.out.println("finally block executed");
		        }
		         
		        // rest program will be executed
		        System.out.println("Outside try-catch clause");
		    }
		
		
		
		
	}
	
