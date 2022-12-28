package edu.cts.training.collectiondemo;

import java.util.*;


public class SetDemo {
	
	public static void main(String[] args) {
		
		Set studentSet = new HashSet();
		Set teachetSet = new HashSet();
		
		Student s1 = new Student(1, "AAA", 85);
		Student s2 = new Student(2, "BBB", 88);
		Student s3 = new Student(3, "CCC", 82);
		Student s4 = new Student(4, "DDD", 80);
		Student s5 = new Student(5, "EEE", 85);
		
		
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		studentSet.add(s4);
		studentSet.add(s5);
		
//		System.out.println(studentSet);
		
		
		
//		Collections.sort(studentSet,new MarksComparator());
		
		Iterator i = studentSet.iterator();
		System.out.println("Student Details");
		while(i.hasNext())
		{
			Student stu = (Student)i.next();
			System.out.println(stu);
		}
		
		
		
//		Teacher t1 = new Teacher(101, "ABC", "Java");
//		Teacher t2 = new Teacher(102, "XYZ", "Python");
//		Teacher t3 = new Teacher(103, "TUV", "Angular");
//		
//		teachetSet.add(t1);
//		teachetSet.add(t2);
//		teachetSet.add(t3);
//		
//		Iterator ti = teachetSet.iterator();
//		System.out.println("Teacher Details");
//		while(ti.hasNext())
//		{
//			System.out.println(ti.next());
//		}
//		
//		Set schoolSet = new LinkedHashSet();
//		
//		schoolSet.add(teachetSet);
//		schoolSet.add(studentSet);
//		
//		Iterator si = schoolSet.iterator();
//		
//		System.out.println("Teacher  and Student Details");
//		while(si.hasNext())
//		{
//			System.out.println(si.next());
//		}
		
	}

}
