package baji2021.interviewLearn;

public class String_basics {
	
	public static void main(String[] args) {
		
		String str = "b1c2d3";
		
		System.out.println(str.substring(2, 7));
		System.out.println(str.substring(2, 4));
		
		String str1 = "7";
		int parseInt = Integer.parseInt(str1);
		System.out.println(parseInt);
		
		for(int i=str.length()-1;i>=0;i--)
		{
		if(Character.isAlphabetic(str.charAt(i)))
			{			
		int n=Integer.parseInt(str.substring(i+1));
		System.out.println(n);
			}
		}
	}
}
		

