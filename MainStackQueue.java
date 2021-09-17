package lcom.list;

public class MainStackQueue {
	public static void main(String[] args) {

	
		Stack stack = new Stack();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.peak();
		stack.pop();
		stack.print();
		stack.size();
		Queue queue = new Queue();
		queue.enqueue(70);
		queue.enqueue(30);
		queue.enqueue(56);
		queue.printQueue();
		queue.size();
		queue.dequeue();
		queue.printQueue();
	}
}
