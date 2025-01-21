/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.queueusingarrays;

class Queue{
    int front,size,capacity;
    int arr[];
    
    public Queue(int length){
        capacity = length;
        front = size=0;
        arr = new int[capacity];
    }
    
    boolean isFull(){
        return(size==capacity);
    }
    
    boolean isEmpty(){
        return(size==0);
    }
    
    void enqueue(int item){
        if(isFull())
            return;
        int pos;
        pos = (front+size)%capacity;
        arr[pos]=item;
        size=size+1;
        System.out.println(item+" enqueued to queue");
    }
    
    int dequeue() {
        if (isEmpty()) {
            return 0;
        }
        int item = arr[front];
        front = (front + 1) % capacity; 
        size = size - 1;
        return item;
    }
    int front(){
        if(isEmpty()){
            return 0 ;
        }
            return arr[front];
    }

}
public class QueueUsingArrays {

    public static void main(String[] args) {
       Queue queue = new Queue(10);
       queue.enqueue(10);
       queue.enqueue(20);
       queue.enqueue(30);
       queue.enqueue(40);
        System.out.println(""+queue.size);
        queue.enqueue(77);
        
        System.out.println(queue.dequeue()+"dequeued from queue\n");
        System.out.println("Front item is: "+queue.front());
    }
}
