package baji2021.interviewLearn;

public class StaticLearn {
	
	int rollno = 5;
	String name = "baji shaik";
	String name2 = "baji";
	static String college="QCET"; 
	
	//The static keyword in Java is mainly used for memory management.

//The static variable gets memory only once in the class area at the time of class loading.

//Note: Static variables can be accessed by calling with the class name ClassName.VariableName
	
	
	public static void main (String args[])
	
	{
		
		// if you want to call global/instance variables then create the object and then call with object
		
	//	StaticLearn obj = new StaticLearn();
		
	//	System.out.println(obj.rollno);
		
		System.out.println(college);
		
		System.out.println(StaticLearn.college);
		
	}

}
