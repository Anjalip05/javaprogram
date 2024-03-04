package Collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class listArrayList{
	
	public static void main(String[] args) {
		
		List <Integer> S = new ArrayList();
		S.add(30);
		S.add(10);
		S.add(20);
		
		for(int i=0;i<S.size();i++) {
			System.out.println(S.get(i));
		}
		System.out.println(S.size());
		
		Collections.sort(S);
		System.out.println(S);
	}
	
}