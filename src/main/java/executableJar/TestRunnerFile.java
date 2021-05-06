package executableJar;

import org.testng.TestNG;

import com.leafBot.testcases.TC001_CreateAccount;
import com.leafBot.testcases.TC002_CreateLead;

public class TestRunnerFile {
	
	static TestNG testNg;	
	
	public static void main(String[] args) {
		testNg = new TestNG();		
		testNg.setTestClasses(new Class[] {TC002_CreateLead.class, TC001_CreateAccount.class});
		testNg.run();
	}

}
