import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Node class for the expression tree and binary search tree
class Node {
    String value; // For expression tree
    int data;     // For binary search tree
    Node left, right;

    // Constructor for expression tree
    Node(String item) {
        value = item;
        left = right = null;
    }

    // Constructor for binary search tree
    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeTasks {

    // Task 1: Binary Expression Tree
    public Node buildExpressionTree() {
        // Constructing the expression tree for ((5+2)*(2-1))/(2+9)
        Node root = new Node("/");
        root.left = new Node("*");
        root.right = new Node("+");
        root.left.left = new Node("+");
        root.left.right = new Node("-");
        root.left.left.left = new Node("5");
        root.left.left.right = new Node("2");
        root.left.right.left = new Node("2");
        root.left.right.right = new Node("1");
        root.right.left = new Node("2");
        root.right.right = new Node("9");
        return root;
    }

    // Function to perform in-order traversal of the expression tree
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.value != null ? node.value : node.data);
            System.out.print(" ");
            inorderTraversal(node.right);
        }
    }

    // Task 2: Convert a sorted array into a Binary Search Tree
    public Node sortedArrayToBST(int[] arr) {
        return sortedArrayToBSTHelper(arr, 0, arr.length - 1);
    }

    private Node sortedArrayToBSTHelper(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBSTHelper(arr, start, mid - 1);
        node.right = sortedArrayToBSTHelper(arr, mid + 1, end);

        return node;
    }

    // Task 3: Convert a Binary Tree into a Binary Search Tree
    public Node convertToBST(Node root) {
        // Step 1: Collect values from the binary tree
        List<Integer> values = new ArrayList<>();
        inorderCollect(root, values);
        Collections.sort(values);
        // Step 2: Convert the sorted values back to a BST
        return sortedArrayToBSTHelper(values.stream().mapToInt(i -> i).toArray(), 0, values.size() - 1);
    }

    private void inorderCollect(Node node, List<Integer> values) {
        if (node != null) {
            inorderCollect(node.left, values);
            values.add(node.data);
            inorderCollect(node.right, values);
        }
    }

    public static void main(String[] args) {
        BinaryTreeTasks tasks = new BinaryTreeTasks();

        // Task 1: Build and traverse the expression tree
        Node expressionTreeRoot = tasks.buildExpressionTree();
        System.out.println("In-order Traversal of Expression Tree:");
        tasks.inorderTraversal(expressionTreeRoot);
        System.out.println();

        // Task 2: Convert a sorted array into a Binary Search Tree
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7};
        Node bstRoot = tasks.sortedArrayToBST(sortedArray);
        System.out.println("In-order Traversal of BST from Sorted Array:");
        tasks.inorderTraversal(bstRoot);
        System.out.println();

        // Task 3: Convert a Binary Tree into a Binary Search Tree
        // Constructing a sample binary tree
        Node binaryTreeRoot = new Node(10);
        binaryTreeRoot.left = new Node(30);
        binaryTreeRoot.right = new Node(15);
        binaryTreeRoot.left.left = new Node(20);
        binaryTreeRoot.left.right = new Node(5);

        System.out.println("In-order Traversal of Original Binary Tree:");
        tasks.inorderTraversal(binaryTreeRoot);
        System.out.println();

        Node bstFromBinaryTreeRoot = tasks.convertToBST(binaryTreeRoot);
        System.out.println("In-order Traversal of Converted BST:");
        tasks.inorderTraversal(bstFromBinaryTreeRoot);
    }
}