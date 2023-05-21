package Com.hashnode;

import java.util.LinkedList;

public class Stack {
	static Com.hashnode.LinkedList stack = new Com.hashnode.LinkedList();
	   
	   public void push(Object data)
	   {
	       
	       stack.addLast(data);
	   }
	   
	   public void pop()
	   {
	       stack.deleteLast();
	       
	   }
	   
	   public void print()
	   {
	           stack.display();
	   }

	   public static void main(String[] args) {
	       Stack data = new Stack();
	       data.push(10);
	       data.print();
	       data.push(20);
	       data.print();
	       data.push(30);
	       data.print();
	       data.pop();
	       data.print();
	       data.pop();
	       data.print();
	       data.pop();
	       data.print();
	       data.pop();
	       data.print();
	       
	   }
}
