/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.functionofmatrix;
import java.util.Arrays;

public class FunctionOfMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int leftDiagonalSum = calculateLeftDiagonalSum(matrix);
        int rightDiagonalSum = calculateRightDiagonalSum(matrix);

        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
    }

    public static int calculateLeftDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }


    public static int calculateRightDiagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i]; 
        }
        return sum;
    }
}