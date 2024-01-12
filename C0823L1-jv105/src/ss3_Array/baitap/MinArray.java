package ss3_Array.baitap;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.println("Enter the size:");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element" +(i+1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đàu là:");
        for (int i = 0 ; i< array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int min = array[0];
        for (int i = 0 ; i< array.length ; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là:"+ min );
    }
}
