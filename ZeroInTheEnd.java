/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zerointheend;
public class ZeroInTheEnd {
    public static void Zeroes(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int a = 0;
        for(int num : arr){
            if(num != 0){
                temp[a++] = num;
            }
        }
        for(int i = a; i<n; i++){
            temp[i] = 0;
        }
        System.arraycopy(temp,0,arr,0,n);//[1,2,3,4,0,0,0]
        //function to copy array(source array, source position,destination array,destination position,length)
    }
    public static void main(String[] args) {
        int[] array = {0,1,0,2,3,0,4};
        Zeroes(array);
        for(int num : array){
            System.out.print(num +" ");
        }
    }
}
