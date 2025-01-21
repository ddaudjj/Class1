/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.checkingpalindrome;

public class CheckingPalindrome {
    public static boolean palindrome(String str){
        str = str.toLowerCase().replace("[^a-zA-Z0-9]", "");
        int left = 0;//pointer for start
        int right = str.length()-1;//pointer at end
        while(left < right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;//these both run if first and
            right--;//last char match
        }
        return true;
    }
    public static void main(String[] args) {
       String str = "Racecar";
        System.out.println("Is palindrome? "+ palindrome(str));
    }
}
