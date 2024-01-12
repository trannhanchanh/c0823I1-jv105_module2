package ss3_Array.baitap;

import java.util.Scanner;

public class TongDuongCheoMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[][] matrix;
        System.out.println("Enter the size row and column:");
        size = scanner.nextInt();
        matrix = new int[size][size];
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
        int sum1 = 0;
        int sum2 = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if(row == column) {
                    sum1 += matrix[row][column];
                }
                if (row + column == size - 1 ) {
                    sum2 += matrix[row][column];
                }
            }
            }
        System.out.println("Tổng số đường chéo thứ nhất của ma trận là:"+ sum1);
        System.out.println("Tổng số đường chéo thứ hai của ma trận là:"+ sum2);
        }
}
