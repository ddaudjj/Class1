/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minvalueinarray;

public class MinValueInArray {
    public static int Minimum(int[] arr){
      int min = arr[0];
      for(int i=1;i<arr.length;i++){
          if (arr[i]<min){
          min = arr[i];
      }
     }
        return min;
    }
  
    
    public static void main(String[] args) {
        int [] array = {49,8,90,1,5,6,9,40};
        int Value = Minimum(array);
        System.out.println("The minimum value of an array is "+Value);
        
    }
}
