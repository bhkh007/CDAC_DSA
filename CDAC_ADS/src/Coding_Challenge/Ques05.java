package Coding_Challenge;

public class Ques05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10,-4,2,0,2,3,7};
		int arr2[] = {7,3,-4,0,3,2};
		
		int min = Integer.MAX_VALUE;
		
		for(int i =0;i<arr1.length;i++) {
			boolean flag=true;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					flag = false;
				}
			}if(flag) {
				if(arr1[i]<min) {
					min =arr1[i];
				}
			}
		}System.out.println(min);
	}

}
