/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searcharray;
import java.util.Scanner;
public class SearchArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] LA = {10, 20, 30, 40, 50, 60}; 
        
        System.out.println("Enter the item to search: ");
        int ITEM = sc.nextInt();
        
        // Search for ITEM in the array and get its index
        int index = search(LA,ITEM);
        if(index == -1){
            System.out.println("Item not found in the array."); 
        }else{
            System.out.println("Right neighbours.");
            printRightNeighbours(LA,index);
            System.out.println("Left neighbours.");
            printLeftNeighbour(LA,index);
        }
    }
    public static int search(int[]LA,int ITEM){
        for(int i=0;i<LA.length;i++){
            if(LA[i]==ITEM){
                return i;
            }
        }
        return -1;
    }
    public static void printRightNeighbours(int[]LA,int index){
        if(index+1<LA.length){
            System.out.println(LA[index+1]+"");
            if(index+2<LA.length){
            System.out.println(LA[index+2]+"");
        }else {
                System.out.print("no right neighbor");
            }
        } else {
            System.out.println("no right neighbor");
        }
        System.out.println();
    }
public static void printLeftNeighbour(int[]LA, int index){
    if(index-1>=0){
        System.out.println(LA[index-1]+"");
     if (index - 2 >= 0) {
                System.out.print(LA[index - 2]);
            } else {
                System.out.print("no left neighbor");
           }
        
    } else {
        System.out.println("No left neighbor");
    }
}
}