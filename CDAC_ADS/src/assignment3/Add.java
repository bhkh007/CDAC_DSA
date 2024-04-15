package assignment3;

public class Add {

	static class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public static Node addNumbers(Node n1, Node n2) {
		Node num = new Node(0);
		Node current = num;
		int sum = 0;
		
		while(n1 != null || n2 != null) {
			if(n1 != null) {
				sum += n1.data;
				n1 = n1.next;
			}
			if(n2 != null) {
				sum += n2.data;
				n2 = n2.next;
			}
			sum = sum /10;
			current.next = new Node(sum % 10);
			current = current.next;
		}
		if(sum >= 0) {
			current.next = new Node(sum);
		}
		return num.next;
	}
	
	public static void list(Node head) {
		Node current = head;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Node lt1 = new Node(10);
		lt1.next = new Node(20);
		lt1.next.next = new Node(30);
		
		Node lt2 = new Node(40);
		lt2.next = new Node(50);
		lt2.next.next = new Node(60);
		
		Node result = addNumbers(lt1, lt2);
		System.out.println("Sum of two numbers is + ");
		list(result);
	}
}
