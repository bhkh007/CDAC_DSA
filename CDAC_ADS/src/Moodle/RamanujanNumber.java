package Moodle;

public class RamanujanNumber {

	public static boolean numberRamanujan(int number,int a,int b,int c, int d) {
		
		if(a*a*a + b*b*b == number && a!=b) {
			return true;
	}
		
		if(c<= a&& a!=b && c != d) {
			if (numberRamanujan(number, a, b, c+1, d)) return true;
			if (numberRamanujan(number, a, b+1, c, d)) return true;
			if (numberRamanujan(number, a+1, b, c, d)) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1729;
		int a = 10;
		int b = 9;
		int c = 12;
		int d = 1;
		
		if (numberRamanujan(number, a, b, c, d)){
		System.out.println(number + " is a Ramanujan number");
		}
		else
		System.out.println(number + " is not a Ramanujan number");
			
			
		 
	}

}
