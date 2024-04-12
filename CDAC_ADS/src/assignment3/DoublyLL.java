package assignment3;

public class DoublyLL {

	Node head;
	static class Node{
		
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void display() {
		Node n =head;
		while(n!=null) {
			System.out.println(n.data +" ---> ");
			n = n.next;
		}
	}
	
	void insert (int new_data) {
		
		{
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		}
	}
	
	void append(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new_node;
			return;
		}
		new_node.next = null;
		
		Node last = head;
		while(last.next !=null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}
	
	public static void main(String[] args) {
		DoublyLL l1 = new DoublyLL();
		l1.head = new Node(10);
		
		l1.insert(15);;
		System.out.println();
		
		l1.insert(20);
		System.out.println();
		
		l1.append(25);
		System.out.println();
		
		l1.append(30);
		System.out.println();
		l1.display();
	}
			
	
}
