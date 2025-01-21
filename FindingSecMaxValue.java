/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.findingsecmaxvalue;

public class FindingSecMaxValue {
    public static int SecondMax(int [] array){
        if (array.length < 2){
            return -1;
            }
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int num : array){//iska mtlb array kay num 
            if(num > max){
                secmax = max;
                max = num;
            }else if(num > secmax && num < max){
                secmax = num;
            }
        }
       if (secmax == Integer.MIN_VALUE){//agr secmax variable kay andar
           return -1;//still Integer.MIN_VALUE store hai tu -1
       }else {//agr value change hai tu second max ki value return hogi
           return secmax;
       }
    }
    public static void main(String[] args) {
        int [] arr = {8,45,65,89,1,10};
        System.out.println("Second max: "+SecondMax(arr));
    }
}
