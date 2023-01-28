package com.greatlearning.dsa.groupassignment2;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}

class convertBSTtoSkewedTree {
	Node node;

	public void convertBSTtoSkewedTree() {
		node = convertBSTtoSkewedTree(node);
	}

	private Node convertBSTtoSkewedTree(Node root) {
		if (root == null) {
			return null;
		}

		root.right = convertBSTtoSkewedTree(root.right);
		return root;
	}

	public void inOrderTraversal() {
		inOrderTraversal(node);
	}

	private void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}

		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}

	public static void main(String[] args) {
		convertBSTtoSkewedTree tree = new convertBSTtoSkewedTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);

		tree.convertBSTtoSkewedTree();
		tree.inOrderTraversal();
	}
}
