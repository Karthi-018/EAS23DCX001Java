package edu.cts.training.collectiondemo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DQueue {

	public static void main(String[] args) {
		
		Deque<String> dq = new ArrayDeque<>();
		
		dq.add("AAA");
		dq.add("BBB");
		dq.add("CCC");
		dq.add("DDD");
		dq.addFirst("XYZ");
		for(String s : dq)
		{
			System.out.println(s);
		}

		
		System.out.println("With Iteerator Interface");
		
		Iterator dqi = dq.descendingIterator();
		
		while(dqi.hasNext())
		{
			System.out.println(dqi.next());
		}
		
		dq.removeLast();
		
		
		for(String s : dq)
		{
			System.out.println(s);
		}

		
	}

}
