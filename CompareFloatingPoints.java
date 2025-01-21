/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparefloatingpoints;

import java.util.Scanner;
public class CompareFloatingPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st floating value: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter 2nd floating value: ");
        float num2 = sc.nextFloat();
        if (Math.round(num1*1000)==Math.round(num2*1000)){
            System.out.println("The numbers are equal up to three decimal places");
        }else{
            System.out.println("The numbers are not equal up to three decimal places");
        }
    }
}
