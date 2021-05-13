package baji2021.interviewLearn;

public class LearnAbstarctChild extends LearnAbstract{

	

	@Override 
	void method2() {
	 System.out.println("implimented method in child class");
	 }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LearnAbstarctChild obj = new LearnAbstarctChild();
		
		 
		 LearnAbstract obj;
		 obj = new LearnAbstarctChild();
		
		//obj.methodStatic();
		obj.method1();
		
		
	}
	

}
