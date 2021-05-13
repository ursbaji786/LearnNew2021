package baji2021.interviewLearn;

public class LearnAbstarctChild2 extends LearnAbstract{

	

	@Override 
	void method2() {
	 System.out.println("implimented method in child 2 class");
	 }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LearnAbstarctChild obj = new LearnAbstarctChild();
		
		 
		 LearnAbstract obj;
		 
		 obj = new LearnAbstarctChild2();
		
		obj.method2();
		
		obj = new LearnAbstarctChild();
		
		obj.method2();
		
		
		
		
		
	}
	

}
