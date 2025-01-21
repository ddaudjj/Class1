/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resizeanarray;
import java.util.Arrays;
public class ResizeAnArray {

    public static void main(String[] args) {
        int[] origArr = {1,2,3,4,5};
        System.out.println("Orignal Array: "+Arrays.toString(origArr));
        int newsize = 8;
        int[] resizeArray = Arrays.copyOf(origArr, 8);
        System.out.println("Resized Array: "+Arrays.toString(resizeArray));
    }
}
