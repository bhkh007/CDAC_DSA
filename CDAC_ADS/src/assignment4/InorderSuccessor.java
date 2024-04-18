package assignment4;

import assignment4.Node;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class InorderSuccessor {

    public static Node inorderSuccessor(Node root, Node node) {
        if (node.right != null) {
        	Node current = node.right;
            while (current.left != null) {
                current = current.left;
            }
            return current;
        }

        Node successor = null;
        Node current = root;
        while (current != null) {
            if (node.data < current.data) {
                successor = current;
                current = current.left;
            } else if (node.data > current.data) {
                current = current.right;
            } else {
                break;
            }
        }
        return successor;
    }

    public static void main(String[] args) {
    	Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);

        Node node = root.left.right;

        Node successor = inorderSuccessor(root, node);
        if (successor != null) {
            System.out.println("Inorder successor of " + node.data + " is " + successor.data);
        } else {
            System.out.println("No inorder successor found for " + node.data);
        }
    }
}

