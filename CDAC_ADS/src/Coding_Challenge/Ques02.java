package Coding_Challenge;

import java.util.Scanner;

//How Convert lower to upper case without using toUppercase() in java
public class Ques02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower case : ");
		String str = sc.next();
		
		String ans ="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			ans+=(char)(ch-32)+"";
		}System.out.println(ans);
	}
}
