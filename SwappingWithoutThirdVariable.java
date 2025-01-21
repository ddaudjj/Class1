/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swappingwithoutthirdvariable;

public class SwappingWithoutThirdVariable {
    int a;
    int b;
    public SwappingWithoutThirdVariable(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public void swap(){
        a=a+b;  //a=10+20=30(updated value)
        b=a-b;  //b=30-20=10(Updated value(swapped))
        a=a-b;  //a=30-10=20(Updated value(swapped))
    }
    public void print(){
        System.out.println("a: "+a+",b: "+b);
    }
    public static void main(String[] args) {
        SwappingWithoutThirdVariable obj = new SwappingWithoutThirdVariable(10,20);
        System.out.println("Before swapping: ");
        obj.print();
        obj.swap();
        System.out.println("After swapping: ");
        obj.print();
    }
}