package Assignment1;

import java.util.Scanner;

public class Palindrome {

	public static boolean palindrome(String str) {
		char first = str.charAt(0);
		char last = str.charAt(str.length() -1);
		
		
		if(str.isEmpty() || str.length()==1)
			return true;
		 if(first == last) 
			 return palindrome(str.substring(1,str.length()-1));
		 
		 else
			 return false;
			 
		 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String input = sc.nextLine();
		
		if(palindrome(input))
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}
}

