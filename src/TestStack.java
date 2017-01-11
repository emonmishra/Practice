import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TestStack {

	public TestStack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Stack<Number> stack = new Stack<>();

		for (int i = 0; i < 10; i++) {

			stack.push(i);
		}

		System.out.printf("Printing output of %s %n", "Stack");
		while (!stack.isEmpty()) {

			System.out.printf("%s%s", String.valueOf(stack.pop()), ",");
		}

		System.out.printf("Printing output of %s %n", "Queue");
		Queue<Number> queue = new  PriorityQueue<>();
		
		for(int i=0; i< 10; i++){
			queue.add(i);
		}
		
		while(!queue.isEmpty()){
			System.out.printf("%s%s", String.valueOf(queue.remove()), ",");
		}

	}

}
