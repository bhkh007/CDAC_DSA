package Coding_Challenge;

import java.util.*;
public class Ques04 {
	public static void main(String[] args) {

		String digit ="2";
		ArrayList<String> ans = find(digit);
		
		System.out.println(ans);
	}
	
	static String[] code = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static ArrayList<String> find(String digit){
	
	if(digit.length()==0) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("");
		return arr;
	}
	int index = digit.charAt(0)-'0';
	digit =digit.substring(1);
	
	ArrayList<String> arr = find(digit);
	ArrayList<String> ans = new ArrayList<String>();
	
	String str = code[index];
	
	for(int i=0;i<str.length();i++) {
		char ch =str.charAt(i);
		
		for(String s:arr) {
			ans.add(ch+s);
		}
	}return ans;
	}
}