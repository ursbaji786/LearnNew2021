package baji2021.interviewLearn;

public abstract  class LearnAbstract {
	
	
	// abstract class can have only non abstract methods also but if method is abstract then class also be a abstarct
	// It can NOT be instantiated.i.e. you can't create object within abstract class, you should extends to another call to implement abstract methods particularlly.
	// It can have constructors and static methods also.
	//It can have final methods which will force the subclass not to change the body of the method.
	
	public void method1 () {
		
		System.out.println("from method1");
	}
	
public void noMethodImplimentation () {
	
}
abstract void method2 ();

public LearnAbstract() {
	System.out.println("from abstract constructor");
}

public static void methodStatic() {
	System.out.println("from abstract static method");
	
}
public final void methodfinal() {
	System.out.println("from abstract final method");
	
}
	
	

}
