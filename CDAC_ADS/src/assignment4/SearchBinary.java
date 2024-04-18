package assignment4;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SearchBinary {

	 public static boolean search(Node root, int target) {
	        if (root == null) {
	            return false;
	        }
	        
	        if (search(root.left, target)) {
	            return true;
	        }

	        if (root.data == target) {
	            return true;
	        }

	        return search(root.right, target);
	    }

	    public static void main(String[] args) {
	        Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);

	        int target = 5;

	        if (search(root, target)) {
	            System.out.println("Node with value " + target + " found in the binary tree.");
	        } else {
	            System.out.println("Node with value " + target + " not found in the binary tree.");
	        }
	    }
	}
