package assignment3;

public class LinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
		
	}
	
	public void display() {
		
		Node n = head;
		
		while(n != null)
		{
			System.out.print(n.data+"---> ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.head = new Node(11);
		Node first = new Node(22);
		Node second = new Node(33);
		
		l1.head.next = first;
		first.next = second;
		
		l1.display();
		
	}
}
