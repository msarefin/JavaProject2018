package coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import PracticeingJava.nokia;
import QA.notes;

class Nodes {
	public int iData;
	public double dData;
	public Nodes leftChild;
	public Nodes rightChild;

	public void displayNode() {
		System.out.println('{');
		System.out.println(iData);
		System.out.println(",");
		System.out.println(dData);
		System.out.println("}");
	}
}

class Tree {
	private Nodes root;

	public Tree() {
		root = null;
	}

	public Nodes find(int key) {
		Nodes current = root;
		while (current.iData != key) {
			if (key < current.iData)
				current = current.leftChild;
			else
				current = current.rightChild;

			if (current == null)
				return null;
		}
		return current;
	}

	public void insert(int id, double dd) {
		Nodes newNode = new Nodes();
		newNode.iData = id;
		newNode.dData = dd;
		if (root == null) {
			root = newNode;
		} else {
			Nodes current = root;
			Nodes parent;
			while (true) {
				parent = current;
				if (id < current.iData) {
					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public boolean delete(int key) {
		Nodes current = root;
		Nodes parent = root;
		boolean isLeftChild = true;

		while (current.iData != key) {
			parent = current;
			if (key < current.iData) {
				isLeftChild = true;
				current = current.leftChild;
			} else {
				isLeftChild = false;
				current = current.rightChild;
			}
			if (current == null) {
				return false;
			}
		}
		if (current.leftChild == null && current.rightChild == null) {
			if (current == root) {
				root = null;
			} else if (isLeftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		} else if (current.rightChild == null) {
			if (current == root) {
				root = current.leftChild;
			} else if (isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.rightChild;
			}

		} else if (current.leftChild == null) {
			if (current == root) {
				root = current.rightChild;
			} else if (isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		} else {
			Nodes successor = getSuccessor(current);

			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			successor.leftChild = current.leftChild;
		}
		return true;
	}

	private Nodes getSuccessor(Nodes delNode) {
		Nodes successorParent = delNode;
		Nodes successor = delNode;
		Nodes current = delNode.rightChild;
		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		if (successor != delNode.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}

	public void traverse(int traverseType) {
		switch (traverseType) {
		case 1:
			System.out.print("\nPreorder Traversal: ");
			preOrder(root);
			break;
		case 2:
			System.out.print("\nInorder traversal");
			inOrder(root);
			break;
		case 3:
			System.out.print("\nProtest Travel ban ");

			System.out.print("\ntraversal: ");
			postOrder(root);
			break;
		}
	}

	private void preOrder(Nodes localRoot) {
		if (localRoot != null) {
			System.out.print(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

	private void inOrder(Nodes localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.err.println(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}

	private void postOrder(Nodes localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}

	public void displayTree() {
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");

		while (isRowEmpty == false) {
			Stack localStack = new Stack();
			isRowEmpty = true;

			for (int j = 0; j < nBlanks; j++) {
				System.out.println(' ');
			}
			while (globalStack.isEmpty() == false) {
				Nodes temp = (Nodes) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.iData);
					System.out.print(temp.leftChild);
					System.out.print(temp.rightChild);

					if (temp.leftChild != null || temp.rightChild != null) {
						isRowEmpty = false;
					} else {
						System.out.print("--");
						localStack.push(null);
						localStack.push(null);
					}
					for (int j = 0; j < nBlanks * 2 - 2; j++) {
						System.out.print(' ');
					}
				}
				System.out.println();
				nBlanks /= 2;
				while (localStack.isEmpty() == false) {
					globalStack.push(localStack.pop());
				}
				System.out.println("......................................................");
			}
		}
	}

}

public class TreeApp {
	public static void main(String[] args) throws IOException {
		int value;
		Tree theTree = new Tree();

		theTree.insert(50, 1.5);
		theTree.insert(25, 1.2);
		theTree.insert(75, 1.7);
		theTree.insert(12, 1.5);
		theTree.insert(37, 1.2);
		theTree.insert(43, 1.7);
		theTree.insert(30, 1.5);
		theTree.insert(33, 1.2);
		theTree.insert(87, 1.7);
		theTree.insert(93, 1.5);
		theTree.insert(97, 1.5);

		while (true) {
			System.out.print("Enter the first letter of show, ");
			System.out.print("insert, find, delete, or traverse: ");
			int choice = getChar();

			switch (choice) {
			case 's':
				theTree.displayTree();
				break;
			case 'i':
				System.out.println("Enter value to insert: ");
				value = getInt();
				theTree.insert(value, value + 0.9);
			case 'f':
				System.out.println("Enter Value to find: ");
				value = getInt();
				Nodes found = theTree.find(value);
				if (found != null) {
					System.out.println("Found: ");
					found.displayNode();
					System.out.print("\n");
				} else {
					System.out.println("Couldn't find ");
					System.out.println(value + '\n');
				}
				break;

			case 'd':
				System.out.print("Enter value to delete: ");
				value = getInt();
				boolean didDelete = theTree.delete(value);
				if (didDelete)
					System.out.print("Deleted " + value + '\n');
				else
					System.out.print("Could not delete ");
				System.out.print(value + '\n');
				break;
			case 't':
				System.out.print("Enter type 1, 2 or 3: ");
				value = getInt();
				theTree.traverse(value);
				break;
			default:
				System.out.print("Invalid entry\n");

			}
		}

	}

	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

	// -------------------------------------------------------------
	public static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	// -------------------------------------------------------------
	public static int getInt() throws IOException

	{
		String s = getString();
		return Integer.parseInt(s);
	}
}
