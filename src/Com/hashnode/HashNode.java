package Com.hashnode;

import java.util.ArrayList;
import java.util.Objects;

public class HashNode<K,V> {
	K key;
    V value;
    final int hashCode;

    HashNode<K, V> next;

  
    public HashNode(K key, V value, int hashCode) {
        this.key = key;
        this.value = value;
        this.hashCode = hashCode;
    }
}

class Map<K, V> {
    
    private ArrayList<HashNode<K, V>> bucketArray;

    
    private int numBuckets;

    
    private int size;

       public Map() {
        bucketArray = new ArrayList<>(); 
        numBuckets = 10;
        size = 0;

           for (int i = 0; i < numBuckets; i++)
            bucketArray.add(null);
    }

    private final int hashCode(K key) {
        return Objects.hashCode(key);
    }

  
    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % numBuckets;

         index = index < 0 ? index * -1 : index;

        return index; 
    }

    
    public void remove(K key) {
        
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        
        if (head == null)
            return;
        else if (head.next == null && head.key.equals(key) && hashCode == head.hashCode) {
            head = null;
            bucketArray.set(bucketIndex, head); // ******** Added Newly
            return;
        }

        HashNode<K, V> temp = head;
        HashNode<K, V> left = temp;
        HashNode<K, V> right = left.next;

       
        if (temp.key.equals(key) && hashCode == temp.hashCode) {
            temp = temp.next;
        }

        while (right != null) {

            if (right.key.equals(key) && hashCode == right.hashCode) {
                left.next = right.next;
                break;
            }
            left = left.next;
            right = right.next;
        }

        
        size--;

        bucketArray.set(bucketIndex, temp);

    }

    
    public K get(K key) {
    
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode)
                return head.key;
            head = head.next;
        }

        
        return null;
    }

    
    public void add(K key, V value) {
                int bucketIndex = getBucketIndex(key); // 1
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

                while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

    }

    public void display() {

        for (HashNode<K, V> head : bucketArray) {
            HashNode<K, V> temp = head;
            if (head != null)
                System.out.print(" [ " + bucketArray.indexOf(head) + " ]  ==> ");
            else
                System.out.println(" [   ]");
            while (temp != null) {
                System.out.print("[ Key: " + temp.key + " Value: " + temp.value + "] ==>");
                temp = temp.next;
            }
            if (head != null)
                System.out.println();
        }

    }

    public static void main(String[] args) {

        Map<Integer, Integer> map = new Map<>();

        map.add(1, 10); // 
        map.add(60, 45);
        map.add(7, 87);
        map.add(17, 100);
        map.add(77, 77);

        map.display();
//
//        //// map.remove(1000);
//
//        map.display();
//
//        if (map.get(7) != null)
//            System.out.println("Key Found");
//        else
//            System.out.println("Key Not Found");

    }

}
