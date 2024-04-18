package assignment4;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class HeadNode {

    public static void printHeadNodes(Node root) {
        if (root != null) {
            System.out.println("Head node of " + root.data + " is " + root.data);
            printHeadNodes(root.left);
            printHeadNodes(root.right);
        }
    }

    public static void main(String[] args) {
    	Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Head nodes of every node in the binary tree:");
        printHeadNodes(root);
    }
}
