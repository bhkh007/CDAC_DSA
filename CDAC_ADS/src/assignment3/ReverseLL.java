package assignment3;

 class Node{
	int data;
	Node next;
	
	Node(int d){
		data = d;
		next = null;
	}
}

public class ReverseLL {

	Node head;
	
	
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node nextNode = null;
		while(current != null) {
			nextNode = current.next;
			current.next = prev;
			prev = current;
			current = nextNode;
		}
		head = prev;
	}
	
	public void printList() {
		Node currNode = head;
		System.out.println("Reverse LinkedList : ");
		while (currNode != null) {
			System.out.println(currNode.data  + " ");
			currNode = currNode.next;
		}
	}
	
	public static void main(String[] args) {
		ReverseLL list = new ReverseLL();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		
		System.out.println("Original ");
		list.printList();
		
		list.reverse();
		
		list.printList();
	}
}
