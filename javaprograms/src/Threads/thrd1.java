package Threads;

public class thrd1 {
	public static void main(String[] args) {
		Thread t = new Thread();
	    System.out.println(t);
	    System.out.println(t.getName());
	    System.out.println(t.getPriority());
	    
	    
	   System.out.println("=========");
	    Thread t2 = new Thread();
	    System.out.println(t2);
	    System.out.println("======");
	    Thread t3 = new Thread();
	    System.out.println(t3);
	    t3.setName("anjali");
	    t3.setPriority(10);
	    System.out.println(t3.getName());
	    System.out.println(t3.getPriority());
	    
	    
	}

}
