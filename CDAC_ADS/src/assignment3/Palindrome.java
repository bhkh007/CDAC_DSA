package assignment3;

import java.util.ArrayList;

import java.util.List;

public class Palindrome {

	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static boolean isPalindrome(Node head) {
		if(head == null || head.next == null) {
			return true;
		}
		
		List<Integer> values = new ArrayList<>();
		Node current = head;
		
		while(current != null) {
			values.add(current.data);
			current = current.next;
		}
		
		int left =0;
		int right = values.size() -1;
		
		while(left < right) {
			if(!values.get(left).equals(values.get(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Node nd = new Node(1);
		nd.next= new Node(2);
		nd.next.next = new Node(3);
		nd.next.next.next =new Node(2);
		nd.next.next.next.next = new Node(1);
		
		boolean pal = isPalindrome(nd);
		System.out.println("The linked list is Palindrome : " + pal);
		
	}
}
