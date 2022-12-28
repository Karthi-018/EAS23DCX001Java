package edu.cts.training.collectiondemo;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack s  = new Stack();
		
		
		Student s1 = new Student(1, "AAA", 85);
		Student s2 = new Student(2, "BBB", 88);
		Student s3 = new Student(3, "CCC", 82);
		Student s4 = new Student(4, "DDD", 80);
		Student s5 = new Student(5, "EEE", 85);
		
		s.push(s1);
		s.push(s2);
		s.push(s3);
		
		System.out.println(s);
		
		s.pop();
		
		System.out.println(s);
		
	}

}
