package lcom.list;

public class Stack {
	linkedlist linkedlist1 = new linkedlist();
	
	public static void operationStack() {
		linkedlist linkedlist1 = new linkedlist();
		linkedlist1.push(70);
		linkedlist1.push(30);
		linkedlist1.push(56);
		linkedlist1.print();
		linkedlist1.peak();
		linkedlist1.pop();
		linkedlist1.print();
		linkedlist1.peak();
	}
	 

		
	
public static void main(String [] args) {
		
		operationStack();
	 
	 
		
	}

}
