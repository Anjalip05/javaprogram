package Collection;

import java.util.List;
import java.util.Stack;

public class ListStack {
	
	public static void main(String[] args) {
		
		Stack<String> S = new Stack();
		S.add("1");
		S.add("2");
		S.add("3");
		System.out.println(S);
		System.out.println(S.peek());  //tells who is on top
		
		System.out.println(S.pop());  //remove the last element
		System.out.println(S);
		
	}

}
