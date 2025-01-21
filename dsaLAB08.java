/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarytree;

class Node{
    int key;
    Node left, right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}
public class BinaryTree {
    
    void printPreorder(Node node){
        if(node == null)
            return;
        System.out.println(node.key+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    
    void printInorder(Node node){
        if(node==null)
            return;
        printInorder(node.left);
        System.out.println(node.key+" ");
        printInorder(node.right);
    }
    void printPostorder(Node node){
        if(node == null)
            return;
        printPreorder(node.left);
        printPreorder(node.right);
        System.out.println(node.key+" ");
    }
    
    Node root;
    BinaryTree(int key){
        root = new Node(key);
    }
    BinaryTree(){
        root = null;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        Node a = new Node(2);
        tree.root.left = a;
        Node b = new Node(3);
        tree.root.right = b;
        
        a.left = new Node(4);
        a.right = new Node(5);
        System.out.println("Pre-Order");
        tree.printPreorder(tree.root);
        System.out.println("\nPost-Order");
        tree.printPostorder(tree.root);
        System.out.println("\nIn-Order");
        tree.printInorder(tree.root);
    }
}
