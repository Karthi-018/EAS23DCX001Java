package edu.cts.training.collectiondemo;

public class Teacher {
	
	int tid;
	String tName;
	String subject;
	public Teacher(int tid, String tName, String subject) {
		super();
		this.tid = tid;
		this.tName = tName;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tName=" + tName + ", subject=" + subject + "]";
	}
	
	

}
