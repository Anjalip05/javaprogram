package polymorphism;

public class ABmethodOverRiding {
	public static void main(String[] args) {
		
		aMethodOverRiding  a1 = new bMethodOverRiding(); //UPCASTING
		a1.test();
		a1.demo(); // METHOD FO B CLASS EXCUTES AS IT SKIPS THE A CLASS DEMO METHOD (OVERRIDDING)
		
		
		
	}

}
