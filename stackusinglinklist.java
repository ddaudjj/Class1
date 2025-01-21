package com.mycompany.stackusinglinkedlist;

class LinkedList{
    private Node top;
    
    
public static class Node{
    public int data;
    public Node next;
    public Node (int data){
        this.data=data;
    }
    }

public void insertFirst(int data){
    Node n = new Node(data);
    n.next=top;
    top=n;
}

 public Node deleteFirst() {
        if (top == null) {
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }


public void DisplayList(){
    Node current = top;
    while(current!=null){
        System.out.println(current.data);
        current=current.next;
        }
    }
}

class LinkedListStack{
    LinkedList li = new  LinkedList ();
    
    public void push(int element){
        li.insertFirst(element);
    }
    
    public void pop() {
    li.deleteFirst();
    }
    
    public void DisplayStack(){
        System.out.println(" ");
        li.DisplayList();
    }
}
public class StackUsingLinkedList {

    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        st.push(12);
        st.push(13);
        st.push(15);
        System.out.println("Stack after push operation: ");
        st.DisplayStack();
        System.out.println("\nStack after pop operation: ");
        st.pop();
        st.DisplayStack();
    }
}
