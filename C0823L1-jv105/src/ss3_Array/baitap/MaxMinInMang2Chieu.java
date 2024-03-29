package ss3_Array.baitap;

import java.util.Scanner;

public class MaxMinInMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        int size2;
        int[][] matrix;
        System.out.println("Enter the size row:");
        size1 = scanner.nextInt();
        System.out.println("Enter the size column:");
        size2 = scanner.nextInt();
        matrix = new int[size1][size2];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("Enter element" + "[" + row + "] [" + column + "]");
                matrix[row][column] = scanner.nextInt();
            }
        }
        System.out.println("Ma trận ban đầu là:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0 ; column < matrix[row].length; column ++) {
                System.out.print(matrix[row][column] + "\t");
            }
        }
        int max = matrix[0][0];
        int indexrow = 0;
        int indexcolumn = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > max) {
                    max = matrix[row][column];
                    indexrow = row;
                    indexcolumn = column;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là:"+max + "tại vị trí: [" + indexrow + "] [" + indexcolumn + "]");
    }
}
