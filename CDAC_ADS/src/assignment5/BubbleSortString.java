package assignment5;


public class BubbleSortString {
	public static void stringSort(String[]arr) {
		int n = arr.length;
		boolean swapped;
		for(int i =0; i< n ; i++) {
			swapped = false;
			for(int j = 0; j < n-i -1;j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
	
	public static void printArray(String[ ]arr) {
		for(String str : arr) {
			System.out.println(str + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String [] arr = {"car","train","aeroplane", "ship", "bullockcart"};
		
		System.out.println("Original array : ");
		printArray(arr);
		
		stringSort(arr);
		
		System.out.println("Sorted String using Bubble Sort : ");
		
		printArray(arr);
	}
}
