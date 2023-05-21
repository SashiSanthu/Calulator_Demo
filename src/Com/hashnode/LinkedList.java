package Com.hashnode;


public class LinkedList {
	
	 Node head;

     class Node {

         Object data;
         Node ref;

         Node(Object data) {
             this.data = data;
         }

     }

     public void addLast(Object data) { // temp
         Node newNode = new Node(data); // head=>[1|ref2]=>[2|null]

         if (head == null)
             head = newNode;
         else if (head.ref == null)
             head.ref = newNode;
         else {
             Node temp = head;
             while (temp.ref != null) {
                 temp = temp.ref;
             }
             temp.ref = newNode;

         }

     }

     public void display() {
         if (head == null)
             System.out.println("No elements to show");
         else {
             Node temp = head;
             while (temp != null) {
                 if (temp.ref != null)
                     System.out.print(temp.data + " => ");
                 else
                     System.out.println(temp.data);

                 temp = temp.ref;
             }

         }
     }

     public void deleteFirst() {
         head = head.ref;

     }

     int size() {
         int count = 0;

         Node temp = head;
         while (temp != null) {
             count++;
             temp = temp.ref;
         }

         return count;
     }

     public void deleteLast() {
         if (head == null)
             System.out.println("List is empty");
         else if (head.ref == null)
             head = null;
         else {
             Node temp = head;

             while (temp.ref.ref != null) {
                 temp = temp.ref;
             }

             temp.ref = null;

         }

     }

     public void addFirst(Object data) {
         Node newNode = new Node(data); // newNode=>[5|null]
         newNode.ref = head;
         head = newNode;
     }

     public Object search(Object input) {
         Node temp = head;
         while (temp != null) {
             if (temp.data == input)
                 return temp.data;

             temp = temp.ref;

         }
         return null;
     }

     public static void main(String[] args) {

         LinkedList nums = new LinkedList();
         nums.addLast(10);
         nums.addLast(20);
         nums.addLast(30);
         nums.addLast(40);
         nums.addLast(50);
         nums.display();

        
     }


}
