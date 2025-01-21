/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversearray;

/**
 *
 * @author light tech
 */
public class Reversearray {
    public static void reverseArray(int[] arr) {
        int start = 0;                  
        int end = arr.length - 1;   
        
        while (start < end) {
       
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;                 
            end --;             
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] originalArray = {11, 22, 33, 44, 55};
        System.out.println("Original Array:");
        printArray(originalArray);
        
        reverseArray(originalArray);
        System.out.println("Reversed Array:");
        printArray(originalArray);
    }
}
