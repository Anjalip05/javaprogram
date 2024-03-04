package oopsPillers;

public class upcastingSon extends upcastingFather {
	
	
	public void smoking() {
		System.out.println("cigarettes");
	}


		public static void main(String[] args) {
			upcastingFather f1 = new upcastingSon(); ///UPCASTING
			f1.drinking();
			upcastingSon s1 = (upcastingSon) f1; //DOWNCASTING
			s1.drinking();
			s1.smoking();
			
			
		}
	
}
