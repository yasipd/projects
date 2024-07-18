package learnJava7;
//This class should implement a method to search a value in a Binary Search Tree 
class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}

public class searchBST {
    Node root;

    searchBST() {
        root = null;
    }

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value)
            root.left = insertRec(root.left, value);
        else if (value > root.value)
            root.right = insertRec(root.right, value);
        return root;
    }

    boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(Node root, int value) {
        if (root == null)
            return false;
        if (root.value == value)
            return true;
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    public static void main(String[] args) {
        searchBST tree = new searchBST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println(tree.search(50)); // true
        System.out.println(tree.search(25)); // false
    }
}
