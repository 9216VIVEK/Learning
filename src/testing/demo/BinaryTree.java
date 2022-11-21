package testing.demo;

public class BinaryTree {

	int idx = -1;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	public Node buildTree(int[] arr) {
		idx++;
		if (arr[idx] == -1) {
			return null;
		}
		Node newNode = new Node(arr[idx]);
		newNode.left = buildTree(arr);
		newNode.right = buildTree(arr);
		return newNode;
	}

	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(Node root) {

		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public void PostOrder(Node root) {

		if (root == null) {
			return;
		}
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();

		int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

		Node root = bt.buildTree(arr);
		bt.preOrder(root);
		System.out.println();
		bt.inOrder(root);
		System.out.println();
		bt.PostOrder(root);
	}

}
