import java.util.HashSet;

public class LeftView {

	public LeftView() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Node root = new Node('A');
		root.left = new Node('B');
		root.right = new Node('C');
		root.left.left = new Node('D');
		root.left.left.right = new Node('E');
		root.right.right = new Node('F');
		root.right.right.right = new Node('G');
		root.right.right.right.right = new Node('H');

		printLeftView(root, 0, new HashSet<Integer>());

	}

	static void printLeftView(Node node, int level, HashSet<Integer> set) {

		if (null == node) {
			return;
		}

		if (!set.contains(level)) {
			System.out.printf("%c,", node.data);
			set.add(level);
		}
		printLeftView(node.left, level + 1, set);
		printLeftView(node.right, level + 1, set);
	}

	private static class Node {
		char data;
		Node left;
		Node right;

		public Node(char data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

}
