package baji2021.interviewLearn;

import java.util.Scanner;

public class String_a1b2c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc=new Scanner(System.in);
		String str,tempstr="";
		str=sc.next();
		for(int i=str.length()-1;i>=0;i--)
		{
		if(Character.isAlphabetic(str.charAt(i))){
			
		int n=Integer.parseInt(str.substring(i+1));
		for(int k=0;k<n;k++)
		tempstr+=str.charAt(i);
		str=str.substring(0,i);
		}
		}
		System.out.println(new StringBuffer(tempstr).reverse().toString());
		}
		

	}


