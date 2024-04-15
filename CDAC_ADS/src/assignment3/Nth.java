package assignment3;

public class Nth {

	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static int findNth(Node head, int n) {
		if(head == null || n<=0) {
			return 0;
		}
		Node fast = head;
		Node slow = head;
		
		for(int i =0; i< n ; i++) {
			if(fast == null) {
				return 0;
			}
			fast = fast.next;
		}
		
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}
	
	public static void main(String[] args) {
		Node nd = new Node(1);
		nd.next = new Node(2);
		nd.next.next = new Node(3);
		nd.next.next.next = new Node(4);
		nd.next.next.next.next = new Node(4);
		
		int n = 2;
		int result = findNth(nd, n);
			System.out.println("The " + n + "th element from end  is : " + result);
		
		
	}
}
