package edu.cts.training.collectiondemo;

public class Student // implements Comparable<Student>
{
	
	int sid;
	String sName;
	int marks;
	public Student(int sid, String sName, int marks) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", marks=" + marks + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		if(sid > o.sid)
//		{
//			return 1;
//		}
//		else if(sid < o.sid)
//		{
//			return -1;
//		}
//		else
//		{
//			return 0;
//		}
//	}
	
	

}
