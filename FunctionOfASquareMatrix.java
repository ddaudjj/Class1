/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.functionofasquarematrix;
public class FunctionOfASquareMatrix {
    public static void main(String[] args) {
        int[] Arr = {1, 3, 4, 2, 5, 3}; 
        int repeatedNumber = findSingleRepeated(Arr);
        System.out.println("The repeated number is: " + repeatedNumber);
    }

    public static int findSingleRepeated(int[] Arr) {
        
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[i] == Arr[j]) {
                    return Arr[i]; 
                }
            }
        }
        return -1;
    }
}