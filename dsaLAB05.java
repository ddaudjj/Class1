/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circularlinkedlist;

class Node{
    int data;
    Node address;
    
    Node(int data){
        this.data = data;
        this.address = null;
    }
}
public class CircularLinkedList {
    
    private Node head;
    
    public CircularLinkedList(){
        head=null;
    }

    public void delete(int value){
        if(head==null)return;
        
        Node temp = head;
        Node prev =null;
        
        if(head.data == value){
            if(head.address == head){
                head=null;
            }else{
                Node last = head;
                while(last.address!=head){
                     last = last.address;
                }
                head=head.address;
                last.address=head;
            }
            return;
        }
        do{
            prev = temp;
            temp=temp.address;
        }while(temp!=head&&temp.data!=value);
        if(temp.data==value){
            prev.address=temp.address;
        }
    }
    
    public void display(){
        if(head==null)return;
        Node temp = head;
        do{
            System.out.println(temp.data+" ");
                    temp=temp.address;
        }while(temp!=head);
        System.out.println();
    }
    
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        cll.head.address=second;
        second.address=third;
        third.address=fourth;
        fourth.address=fifth;
        fifth.address=sixth;
        sixth.address=cll.head;
        
        System.out.println("Orignal circular linked list:");
        cll.display();
        int value = 30;
        cll.delete(value);
        System.out.println("Circular linked list after deletion:");
        cll.display();
    }
}
