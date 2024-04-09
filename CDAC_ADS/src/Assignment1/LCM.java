package Assignment1;
import java.util.Scanner;

public class LCM {
	
	public static int lcm(int num1,int num2) {
		return (num1*num2) / gcd (num1,num2);
	}
	
	public static int gcd(int num1,int num2) {
		if(num2==0) {
			return num1;
		}else {
			return gcd(num2, num1 %num2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num1 : ");
		int num2 = sc.nextInt();
		
		
		System.out.println("LCM of" + num1 +" and "+ num2+ " = " + LCM.lcm(num1, num2) );
		
		sc.close();
	}
}
