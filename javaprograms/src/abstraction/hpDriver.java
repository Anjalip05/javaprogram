package abstraction;

public class hpDriver {
	public static void main(String[] args) {
		
		hp h1 = new windows();
		h1.welcome("anjali");
		h1.cal(10, 2);
		h1.weather();
		
		hp h2 = new linux();
		h2.welcome("asdfjfnnfkdnoofogfgioiggfggno");
		h2.cal(10, 2);
		h2.weather();
	}

}
