package org.sample;

public class CourseDetails {
	
	public void javaCourse() {
		System.out.println("java course started");
	}
	
	public void oracleCourse() {
		System.out.println("oracle course started");
	}

	public static void main(String[] args) {
		CourseDetails ds=new CourseDetails();
		ds.oracleCourse();
		ds.javaCourse();

	}

}
