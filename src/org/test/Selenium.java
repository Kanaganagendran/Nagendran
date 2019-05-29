package org.test;

import org.sample.CourseDetails;
import org.sample.GreensTech;

public class Selenium {

	public static void main(String[] args) {
		Selenium s=new Selenium();
		s.framework();
		GreensTech t=new GreensTech();
		t.adayarBranch();
		t.omrBranch();
		CourseDetails d=new CourseDetails();
		d.javaCourse();
		d.oracleCourse();

	}

	public void framework() {
		System.out.println("testing,juniy");
	}
	
}
