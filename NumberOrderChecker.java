/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberorderchecker;
import java.util.Scanner;

public class NumberOrderChecker {
public static String Order(double a,double b,double c){
    if(a<b &&b<c){
        return "Increasing";
    }else if(a>b && b>c){
        return "Decreasing";
    }else{
        return "Neither increasing nor decreasing";
    }
}
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("Enter third number: ");
        double c = sc.nextDouble();
        String Ans = Order (a ,b ,c);
        System.out.println(Ans);
    }
}
