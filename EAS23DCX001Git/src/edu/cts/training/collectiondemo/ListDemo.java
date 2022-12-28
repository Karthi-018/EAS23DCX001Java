package edu.cts.training.collectiondemo;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		List studentList = new ArrayList();
		
		Student s1 = new Student(1, "AAA", 85);
		Student s2 = new Student(2, "BBB", 88);
		Student s3 = new Student(3, "CCC", 82);
		Student s4 = new Student(4, "DDD", 80);
		Student s5 = new Student(5, "EEE", 85);
		
		
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s1);
		studentList.add(s5);
		studentList.add(s4);
		
//		Collections.sort(studentList,new MarksComparator()); // Comparator
		
		Collections.sort(studentList);
		
		Iterator sit = studentList.iterator();
		
		while(sit.hasNext())
		{
			System.out.println(sit.next());
		}
		
//		List teacherList = new ArrayList();
//		
//		Teacher t1 = new Teacher(101, "ABC", "Java");
//		Teacher t2 = new Teacher(102, "XYZ", "Python");
//		Teacher t3 = new Teacher(103, "TUV", "Angular");
//		
//		teacherList.add(t1);
//		teacherList.add(t2);
//		teacherList.add(t3);
//		
//		System.out.println(teacherList.indexOf(t2));
//		
//		
//		List schoolList = new LinkedList();
//		
//		schoolList.addAll(studentList);
//		schoolList.addAll(teacherList);
//		
//		Iterator si = schoolList.iterator();
//		
//		while(si.hasNext())
//		{
//			System.out.println(si.next());
//		}
//		
//		
		
	}

}
