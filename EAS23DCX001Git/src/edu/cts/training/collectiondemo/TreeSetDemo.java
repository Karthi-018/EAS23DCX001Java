package edu.cts.training.collectiondemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet tset = new TreeSet();
		
//		Student s1 = new Student(1, "AAA", 85);
//		Student s2 = new Student(2, "BBB", 88);
//		Student s3 = new Student(3, "CCC", 82);
//		Student s4 = new Student(4, "DDD", 80);
//		Student s5 = new Student(5, "EEE", 85);
//		Student s6= new Student(1, "AAA", 85);
		
		tset.add("AAA");
		tset.add("BBB");
		tset.add("CCC");
		tset.add("DDD");
		tset.add("AAA");
		tset.add("EEE");
		
		Iterator ti = tset.iterator();
		
		while(ti.hasNext())
		{
			System.out.println(ti.next());
		}

	}

}
