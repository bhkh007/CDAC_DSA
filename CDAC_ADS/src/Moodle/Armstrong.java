package Moodle;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(armstrong(num))
			System.out.println(num + " is a Armstrong number");
		else
			System.out.println(num + " is not a Armstrong number");
	}
	
	public static boolean armstrong(int num) {
		int numofDigits = countdigits(num);
		int sum = sumOfDigits(num, numofDigits);
		return sum == num;
	}
	
	public static int countdigits(int num) {
		if (num ==0)
			return 0;
		else
			return 1+ countdigits(num / 10);
	}
	
	public static int sumOfDigits(int num,int numOfDigits) {
		if(num==0)
			return 0;
		else
			return (int) (Math.pow( num %10, numOfDigits) + sumOfDigits(num/10, numOfDigits));
		
	}
}
