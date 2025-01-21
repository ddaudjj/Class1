/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchinsertdelete;
import java.util.Arrays;
public class SearchInsertDelete {
    public static int Search(int[]arr, int key){
    for(int i = 0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
        }
    }
    return -1;
}
    public static int[] Insert(int[] arr, int key){
        int[] newArray= new int[arr.length+1];
        int i=0;
        while (i<arr.length && arr[i] < key){
            newArray[i] = arr[i];
            i++;
        }
        newArray[i] = key;
        while(i<arr.length){
            newArray[i+1] = arr[i];
            i++;
        }
        return newArray;
    }
    public static int[] delete(int[] arr, int key){
        int ind = Search(arr,key);
        if (ind == -1){
            return arr;
        }
        int [] newArray = new int[arr.length-1];
        for (int i=0,j=0;i<arr.length;i++){
            if(i!=ind){
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr ={5,6,7,9,10};
        int searchkey = 6;
        int result = Search(arr,searchkey);
        System.out.println("Element "+searchkey+(result != -1?" found at index "+result:"not found." ));
                                                    //condition ? valueIfTrue : valueIfFalse
        int insertkey = 8;
        arr = Insert(arr, insertkey);
        System.out.println("After inserting "+insertkey+": "+Arrays.toString(arr));
        
        int deletekey = 9;
        arr = delete(arr,deletekey);
        System.out.println("After deleting "+deletekey+": "+Arrays.toString(arr));
    }
}
