public class NSmallesNumInBT {

	static int smallesCounter = 0;
	static int sum;

	public NSmallesNumInBT() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Node root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);
		root.left.left = new Node(5);
		root.left.left.left = new Node(2);
		root.left.left.left.right = new Node(4);
		root.left.left.left.right.left = new Node(3);
		root.left.left.right = new Node(7);
		root.left.right = new Node(15);
		root.left.right.left = new Node(12);
		root.right.left = new Node(25);
		root.right.right = new Node(35);

		findNthSmallest(root, 2, 3);
		System.out.println(sum);

	}

	public static void findNthSmallest(Node node, int n, int k) {

		if (node == null) {
			return;
		}
		findNthSmallest(node.left, n, k);
		smallesCounter++;

		if (smallesCounter == n) {
			System.out.printf("%d th smallest num is: %d %n",n, node.data);
			// sum =+node.data;
		}

		if (smallesCounter > n && smallesCounter <= n+k) {
			System.out.printf("%d larger than n %n", node.data);
			sum = sum+node.data;
		}

		findNthSmallest(node.right, n, k);
	}

	private static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

}
