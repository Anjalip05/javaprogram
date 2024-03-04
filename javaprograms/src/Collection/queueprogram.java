package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueprogram {
	
public static void main(String[] args) {
	Queue<Integer> q1 = new LinkedList();
	Queue<Integer> q = new PriorityQueue();
	q.offer(12);
	q.offer(30);
	q.offer(20);
	System.out.println(q);
	System.out.println(q.poll());
	
	System.out.println(q.peek());
	
	
}

}
