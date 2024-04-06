package Moodle;

import java.util.Scanner;

public class PerfectNumber {

	private static Scanner sc;

	public static int sumofproperdivisor(int num,int divisor) {
		if(divisor ==num) {
			return 0;
		}
		else if(num%divisor ==0)
			return divisor + sumofproperdivisor(num, divisor+1);
		else
			return sumofproperdivisor(num, divisor+1);
	}
	
	public static boolean isPerfectNumber(int num) {
		int sumOfdivisor = sumofproperdivisor(num, 1);
				
		return sumOfdivisor ==num;
	}
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(isPerfectNumber(num)) 
			System.out.println(num  + " is a Perfect number");
		else
			System.out.println(num + " is not a Perfect number");
		}
	}


