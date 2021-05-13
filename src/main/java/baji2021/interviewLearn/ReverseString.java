package baji2021.interviewLearn;

public class ReverseString {
	
	String str = "baji babu";
	String output = "";
	
	public  void reverse() {
		
				
		int l = str.length();
		
		for (int i = l-1; i >= 0; i--) {
			output = output + str.charAt(i);
		}
			
		System.out.println("reversed string is " + output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseString rs = new ReverseString();
		rs.reverse();
		
		

	}

}
