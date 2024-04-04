package Coding_Challenge;

/*Given an array of integers, return indices of the two numbers such that they add up to a 
specific target. You may assume that each input would have exactly one solution, and 
you may not use the same element twice. 
Example: 
Given nums = [2, 7, 11, 15], target = 9, 
Because nums[0] + nums[1] = 2 + 7 = 9, 
return [0, 1]*/

public class Ques03 {

	public static void main(String[] args) {
		int[] arr= {2, 7, 11, 15};
		int target = 13;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] +arr[j] ==target) {
				System.out.println(i + " "+j);
				return;
				}
			}
		}System.out.println(-1 +" "+ -1);
	}
}
