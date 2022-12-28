package edu.cts.training.collectiondemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1, "AAA", 85);
		Student s2 = new Student(2, "BBB", 88);
		Student s3 = new Student(3, "CCC", 82);
		Student s4 = new Student(4, "DDD", 80);
		Student s5 = new Student(5, "EEE", 85);
		
		Teacher t1 = new Teacher(101, "ABC", "Java");
		Teacher t2 = new Teacher(102, "XYZ", "Python");
		Teacher t3 = new Teacher(103, "TUV", "Angular");
		
		Vector v = new Vector();
		
		v.add(s1);
		v.add(s2);
		v.add(s3);
		
		System.out.println(v);

	}

}
