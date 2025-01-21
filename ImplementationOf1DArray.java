/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.implementationof1darray;
import java.util.Arrays;
import java.util.Scanner;
public class ImplementationOf1DArray {
    
    public static int[] insertElement(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1]; 

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[arr.length] = element;
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] arr = new int[5]; 
        System.out.println("Initial Array: " + Arrays.toString(arr));
        
        System.out.println("Adding elements to the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array after adding elements: " + Arrays.toString(arr));

        System.out.print("\nEnter the index to edit (0-4): ");
        int editIndex = sc.nextInt();
        System.out.print("Enter new value for index " + editIndex + ": ");
        int newValue = sc.nextInt();
        arr[editIndex] = newValue; 
        System.out.println("Array after editing: " + Arrays.toString(arr));

        System.out.print("\nEnter the index to delete (0-4): ");
        int deleteIndex = sc.nextInt();
        arr[deleteIndex] = 0; 
        System.out.println("Array after deletion: " + Arrays.toString(arr));
        
        System.out.print("\nEnter a new element to insert: ");
        int newElement = sc.nextInt();
        arr = insertElement(arr, newElement);
        System.out.println("Array after insertion: " + Arrays.toString(arr));

    }
}
