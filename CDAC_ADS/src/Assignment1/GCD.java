package Assignment1;

import java.util.Scanner;

public class GCD {

	public static int gcd (int a, int b) {
		if (b==0) {
		return a;
		}else {
			return gcd(b,a % b);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		int result =gcd(num1, num2);
		System.out.println("Gcd of " +num1 + " and " + num2 +" = "+result);
		sc.close();
		
	}

}
