package edu.cts.training.collectiondemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		Queue<Student> pq = new PriorityQueue<>();
		
		Student s1 = new Student(1, "AAA", 85);
		Student s2 = new Student(2, "BBB", 88);
		Student s3 = new Student(3, "CCC", 82);
		Student s4 = new Student(4, "DDD", 80);
		Student s5 = new Student(5, "EEE", 85);
		Student s6 = new Student(3, "CCC", 82);
		
		
		
		
		pq.add(s2);
		pq.add(s3);
		pq.add(s6);
		pq.add(s4);
		pq.add(s1);
		pq.add(s5);
		
		

		
		for(Student s :pq)
		{
			System.out.println(s);
		}
		
//		pq.add("Siva");
//		pq.add("Yaazhini");
//		pq.add("ABC");
//		pq.add("Siva");
//		pq.add("Sivaazhini");
		
//		Iterator pqi = pq.iterator();
//		
//		while(pqi.hasNext())
//		{
//			System.out.println(pqi.next());
//		}
//		
//		System.out.println("*************** Printing Head Element*********************");
//		System.out.println("Head is "+pq.peek());
//		System.out.println(pq.element());
//		System.out.println();
//		System.out.println("*********************Removing Head Elelmet ********************");
//		pq.remove();
//		pq.poll();
//		
//		Iterator pqi1 = pq.iterator();
//		System.out.println();
//		System.out.println("****************After Removing Head Element********************");
//		while(pqi1.hasNext())
//		{
//			System.out.println(pqi1.next());
//		}
//		
		
	}

}
