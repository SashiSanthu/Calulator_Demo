package Com.hashnode;

public class Queue {
	static LinkedList queue = new LinkedList();
	   
	   public void enQueue(Object data)
	   {
	       queue.addFirst(data);
	   }
	   
	   public void deQueue()
	   {
	       queue.deleteLast();
	   }
	   
	   public void showElements()
	   {
	       queue.display();
	   }
	   
	   public static void main(String[] args) {
	       Queue info = new Queue();
	       info.enQueue(1);
	       info.showElements();
	       info.enQueue(2);
	       info.showElements();
	       info.enQueue(3);
	       info.showElements();
	       
	       info.deQueue();
	       info.showElements();
	       
	       info.deQueue();
	       info.showElements();
	       
	       info.deQueue();
	       info.showElements();
	       
	       info.deQueue();
	       info.showElements();
	   }
	       
    }
