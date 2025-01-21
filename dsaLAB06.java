/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stackoperation;

class Stack{
    private int max;
    private int[] stackArray;
    private int top;
    
    public Stack(int size){
        max = size;
        stackArray = new int[max];
        top = -1;
    }
    
    public void push(int value){
        if(top<max-1){
            stackArray[++top]=value;
        }else{
            System.out.println("Stack is full.");
        }
    }
    
    public int pop(){
        if(top>=0){
            return stackArray[top--];
        }else{
            System.out.println("Stack is empty!");
            return -1;
        }
    }
    
    public boolean isEmpty(){
        return(top==-1);
    }
    
    public int peek(){
        if(!isEmpty()){
            return stackArray[top];
        }else{
            return -1;
        }
    }
}
public class StackOperation {
    
    public static String reverseStr(String str){
        Stack st = new Stack(str.length());
        for(int i =0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        String reversed = " ";
        while(!st.isEmpty()){
            reversed+=(char)st.pop();
        }
        return reversed;
    }
    
    public static int reverseNum(int num){
        Stack st = new Stack(10);
        
        while(num>0){
            st.push(num % 10);
            num/=10;
        }
        int reversedNum = 0;
        int multiplier = 1;
        while(!st.isEmpty()){
            reversedNum = reversedNum*10+st.pop();
        }
        return reversedNum;
    }
    
    public static int Search(Stack st,int element){
        Stack tempSt = new Stack(10);
        int index =1;
        int position = 0;
        
        while(!st.isEmpty()){
            int current = st.pop();
            tempSt.push(current);
            
            if(current == element){
                index = position;
            }
            position++;
        }
        while(!tempSt.isEmpty()){
          st.push(tempSt.pop());
        }
        return index;
    }
    public static void main(String[] args) {
        String  str = "Hello";
        System.out.println("Reversed String: "+reverseStr(str));
        
        int num = 78901;
        System.out.println("Rveresed Number: "+reverseNum(num));
        
        Stack st = new Stack(10);
        st.push(55);
        st.push(66);
        st.push(77);
        st.push(88);
        st.push(99);//last in first out 
        int searchInd = Search(st,88);
        System.out.println("Element found at index: "+searchInd);
        
        System.out.println("Top of the stack: "+st.peek());
    }
}
