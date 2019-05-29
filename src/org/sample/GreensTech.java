package org.sample;

public class GreensTech {
	
	public void omrBranch() {
		System.out.println("omr Branch");
	}
	
	public void adayarBranch() {
		System.out.println("adayar Branch");
	}
	
	public static void main(String[] args){
		        
	GreensTech data=new GreensTech();
    data.omrBranch();
    data.adayarBranch();
    
    CourseDetails ds=new CourseDetails();
    ds.javaCourse();
    ds.oracleCourse();
		
	}

}
