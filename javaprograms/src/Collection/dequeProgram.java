package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class dequeProgram {
	public static void main(String[] args) {
		//Deque<Integer> d1 = new LinkedList();
		Deque<Integer> d = new ArrayDeque();
		
		d.add(10);
		d.add(20);
		System.out.println(d);
		d.offerFirst(5);
		System.out.println(d);
		d.offerLast(30);
		System.out.println(d);
		System.out.println("----------------------");
		
		System.out.println(d.peek());
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		
		System.out.println("---------------------");
	
		System.out.println(d.poll());
		System.out.println(d.pollFirst());
		System.out.println(d.pollLast());
	}

}
