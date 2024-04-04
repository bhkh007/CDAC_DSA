package Moodle;
import java.util.Scanner;

public class PrimeFactors {

	public static void primeFact(int num,int divisor) {
		if(num<=1) {
			return;
		}
		if(num %divisor ==0) {
			System.out.println(divisor + " ");
			primeFact(num/divisor,divisor);
		}
		else {
			primeFact(num,divisor +1);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println("Prime factorial of "+ num +" is");
		primeFact(num,2);
		
		sc.close();
		
		
		
	}
}
