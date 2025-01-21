/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.missingnuminarray;
public class MissingNumInArray {
    public static int findNum(int[] arr){
        int n = arr.length+1;
        int sum = 0;
        int maximum = arr[0];
        int minimum = arr[0];
        for(int num:arr){
            sum+=num;//sum = sum+arr
            if(num < minimum )minimum=num;
            if(num > maximum)maximum=num;
        }
        int assumedsum = 0;
        for(int i = minimum;i<=maximum;i++){
            assumedsum +=i;//assumedsum=assumedsum+i
        }
        return assumedsum-sum;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,7,8,9,10};
        System.out.println("Missing number is: "+findNum(arr));
    }
}
