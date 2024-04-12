package assignment3;

class Nodes{
	int data;
	Node next;
	
	Nodes(int d){
		data = d;
		next = null;
	}
}

public class MergeSortList {

	public static Node merge(Node list1, Node list2) {
		if(list2 ==null)
			return list1;
		if(list1 == null)
			return list2;
		
		Node mergedlist;
		
		if(list1.data <= list2.data) {
			mergedlist = list1;
			mergedlist.next = merge(list1, list2.next);
		}
		else {
			mergedlist = list2;
			mergedlist.next = merge(list1, list2.next);
		}
		return mergedlist;
	}
	
	public static Node[] split (Node head) {
		
		if(head == null || head.next ==null)
			return new Node[] {head,null};
		
		Node slow = head, fast = head.next;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node mid = slow.next;
		slow.next = null;
		
		return new Node[] { head, mid};
	}
	
	public static Node mergeSort(Node head) {
		if(head == null || head.next == null)
			return head;
		
		Node[] halves = split(head);
		
		Node first = mergeSort(halves[0]);
		Node second = mergeSort(halves[1]);
		
		return merge(first,second);
		
	}
	
	public static void printList(Node head) {
		Node currNode = head;
		while (currNode != null) {
			System.out.println(currNode.data+ " " );
			currNode = currNode.next; 
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		Node list1= new Node(1);
		list1.next = new Node(3);
		list1.next.next = new Node(5);
		
		Node list2= new Node(2);
		list2.next = new Node(4);
		list2.next.next = new Node(6);
		
		Node mergedList  = mergeSort(merge(list1, list2));
		
		System.out.println("Merged and Sorted list :");
		printList(mergedList);
	}
	
}
