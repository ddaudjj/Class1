/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queueusinglinkedlist;

class LinkedList{
    private Node front;
    private Node rear;
    
    class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public boolean isEmpty(){
            return(front==null);
        }
        
        public void insertLast(int new_data) {
        Node new_node = new Node(new_data);
        if (isEmpty()) {
            front = new_node;
            rear = new_node; // Initialize rear when inserting the first element
        } else {
            rear.next = new_node;
            rear = new_node;
        }
    }
    public int deleteFirst() {
        if (front == null) {
            throw new IllegalStateException("List is empty");
        }

        int temp = front.data;
        front = front.next; 

        if (front == null) {
            rear = null;
        }

        return temp; 
    }
    void displayFirst(){
        System.out.println("===Displaying elements of DEQ===");
        Node current = front;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
}
class Queue{
    LinkedList list;
    public Queue(){
        list = new LinkedList();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void enqueue(int new_data){
        list.insertLast(new_data);
    }
    public int dequeue(){
        return list.deleteFirst();
    }
    void printQueue(){
        list.displayFirst();
    }
}
public class QueueUsingLinkedList {

    public static void main(String[] args) {
        Queue list = new Queue();
        list.enqueue(12);
        list.enqueue(13);
        list.enqueue(14);
        list.enqueue(15); 
        list.printQueue();
        list.dequeue();
        list.printQueue();
    }
}
