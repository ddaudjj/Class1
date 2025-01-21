/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.texteditordll;
import java.util.Scanner;

class Node{
    char data;
    Node prev;
    Node address; 
    
    Node(char data){
        this.data=data;
        this.address=null;
        this.prev=null;
    }
}
public class TextEditorDLL {
    private Node head;
    private Node tail;
    private Node point;
    
    public TextEditorDLL(){
        head=null;
        tail=null;
        point=null;
    }
    
    public void add(char c){
        Node newNode = new Node(c);
        if(head==null){
            head=newNode;
            tail=newNode;
            point=head;
        }else{
            if(point==null){
                tail.address = newNode;
                newNode.prev = tail;
                tail=newNode;
            }else{
                newNode.prev=point.prev;
                newNode.address=point;
                if(point.prev!=null){
                    point.prev.address=newNode;
                }else{
                head=newNode;
                }
                point.prev = newNode;
            }
            point = newNode;
        }
    }
    
    public void delete(){
        if(point == null)return;
        
        if(point.prev != null){
            point.prev.address=point.address;
        }else{
            head= point.address;
        }
        
        if(point.address!=null){
            point.address.prev=point.prev;
        }else{
            tail=point.prev;
        }
        point = point.prev;
    }
    
    public void modify(char c){
        if(point!=null){
            point.data = c;
        }
    }
    
    public void display(){
        Node current = tail;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.prev;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        TextEditorDLL editor = new TextEditorDLL();
        Scanner scanner = new Scanner(System.in);
        String input;
 
        while(true){
            System.out.println("Available Commands: [I]nsert <char>, [D]elete, [M]odify <char>, [D]isplay, [E]xit");
            input = scanner.nextLine();
            String[] parts = input.split(" ");
            
            if(parts[0].equalsIgnoreCase("insert")){//&&parts.length==2
                editor.add(parts[1].charAt(0));
            }else if(parts[0].equalsIgnoreCase("delete")){
                editor.delete();
            }else if(parts[0].equalsIgnoreCase("modify")){//&&parts.length==2
                editor.modify(parts[1].charAt(0));
            }else if(parts[0].equalsIgnoreCase("display")){
                editor.display();
            }else if(parts[0].equalsIgnoreCase("exit")){
                break;
            }else{
                System.out.println("Unknown command");
            }
        }
    }
}
