package Com.hashnode;


public class BinarySearchTree {
	
	class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;  

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /*
     * A recursive function to insert a new key in BST
     */
                     //  null      99
    Node insertRec(Node root, int key) {

        /*
         * If the tree is empty, return a new node
         */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root2) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(56); 
        tree.insert(89);
        tree.insert(12);
        tree.insert(32);
        tree.insert(1);
        tree.insert(99);

        tree.inorder();
    }
}

