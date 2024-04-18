package assignment4;

public class DeleteDLL {

	 static class Node {
	        int data;
	        Node prev;
	        Node next;

	        Node(int data) {
	            this.data = data;
	        }
	    }

	    private Node head;
	    private Node tail;

	    public DeleteDLL() {
	        this.head = null;
	        this.tail = null;
	    }
	    
	    public void insertAtEnd(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }
	    
	    public void displayForward() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public void deleteNodeInBetween(int data) {
	        Node current = head;
	        
	        while (current != null && current.data != data) {
	            current = current.next;
	        }
	        
	        if (current != null) {
	        	
	            if (current.prev != null && current.next != null) {
	                current.prev.next = current.next;
	                current.next.prev = current.prev;
	            } else if (current == head) {
	                head = current.next;
	                if (head != null) {
	                    head.prev = null;
	                }
	            } else if (current == tail) { 
	                tail = current.prev;
	                if (tail != null) {
	                    tail.next = null;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        DeleteDLL dll = new DeleteDLL();
	        dll.insertAtEnd(10);
	        dll.insertAtEnd(20);
	        dll.insertAtEnd(30);
	        dll.insertAtEnd(40);

	        System.out.println("Original doubly linked list:");
	        dll.displayForward();

	        dll.deleteNodeInBetween(20);

	        System.out.println("Doubly linked list after deleting node with data 20:");
	        dll.displayForward();
	    }
	
}
