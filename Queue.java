package lcom.list;

<<<<<<< HEAD:Queue.java
public class Queue {
	 Node head;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	/*
	 * method to insert data to queue
	 * 
	 * @param data, here data is inserted at rear end
	 */
	public boolean enqueue(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}
<<<<<<< HEAD
public static void main(String [] args) {
		
		operationQueue();
	 
	 
		
=======
public class Stack {
	 Node head;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	/*
	 * method to find size of the stack if stack has one element this method prints
	 * size as 1 else traverses till list is empty and increments size
	 */
	public void size() {
		int size = 0;
		Node temp = head;
		if (head.next == null) {
			size = 1;
		} else {
			while (temp != null) {
				temp = temp.next;
				size++;
			}
			System.out.println("Size of stack is " + size);
		}
	}

	/*
	 * method to insert data at the end
	 * 
	 * @param data to be inserted to the stack from top end
	 */
	public boolean push(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}

	/*
	 * method to pop data from stack pops from top follows last in first out
	 * principle
	 */

	public void pop() {
		Node temp = head;
		Node cur = temp;
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		} else if (head.next == null) {
			temp = null;
			System.out.println("Deleted " + head.data);

		} else {
			while (temp.next != null) {
				cur = temp;
				temp = temp.next;
			}
			System.out.println("Deleted " + temp.data);
			cur.next = null;
		}
	}
	
	/*
	 * method to find top most element in the stack
	 */

	public void peak() {
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			System.out.println("peak element is " + temp.data);
		}
	}

	

	/*
	 * method to display stack contents
	 */
	
	public void print() {
		Node temp = head;
		System.out.println("\nStack elements are");
=======

	/*
	 * method to delete data from the beginning in queue here data is deleted from
	 * front end
	 */

	public void dequeue() {
		Node temp = head;
		if (head == null) {
			System.out.println("Queue is empty");
			return;
		} else if (head.next == null) {
			temp = null;

		} else {
			head = head.next;
			temp = null;
		}
	}

	/*
	 * method to find size of the Queue if queue has one element this method prints
	 * size as 1 else traverses till list is empty and increments size
	 */
	public void size() {
		int size = 0;
		Node temp = head;
		if (head.next == null) {
			size = 1;
		} else {
			while (temp != null) {
				temp = temp.next;
				size++;
			}
			System.out.println("Size of Queue is " + size);
		}
	}

	/*
	 * method to display queue contents
	 */
	public void printQueue() {
		Node temp = head;
		System.out.println("\nQueue elements are");
>>>>>>> EnqueueDeque
		while (temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
<<<<<<< HEAD
>>>>>>> PushPopStack:Stack.java
=======
>>>>>>> EnqueueDeque
	}

}
