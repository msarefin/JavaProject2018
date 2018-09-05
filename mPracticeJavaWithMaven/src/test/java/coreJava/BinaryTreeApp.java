package coreJava;

class Node{
	int data; 
	Node left; 
	Node right; 
}

class BinaryTree{
	
	public Node createNode(int value) {
		Node a = new Node();
		a.data = value;
		a.left = null; 
		a.right = null;
		return a; 
	}
	
}


public class BinaryTreeApp {

	public static void main(String[] args) {
		BinaryTree a  =new BinaryTree(); 
		Node root = a.createNode(2);
		root.left = a.createNode(7);
		root.right = a.createNode(5);
		root.left.left = a.createNode(2);
		root.right.left = a.createNode(5);
		root.right.right = a.createNode(11);
		root.left.right = a.createNode(9);
		root.left.right.left = a.createNode(4);
		
		System.out.println(root.data);
	}
}
