package ss3_Array.baitap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        int[] array1;
        System.out.println("Enter the size of array 1:");
        size1 = scanner.nextInt();
        array1 = new int[size1];
        for (int i = 0 ; i < array1.length; i++) {
            System.out.println("Enter element" +i + "of array 1:");
            array1[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu của mảng 1 là:");
        for (int i = 0 ; i < array1.length ; i++) {
            System.out.print(array1[i] + " ");
        }

        int size2;
        int[] array2;
        System.out.println("Enter the size of array 2:");
        size2 = scanner.nextInt();
        array2 = new int[size2];
        for (int i = 0 ; i < array2.length; i++) {
            System.out.println("Enter element" +i + "of array 2:");
            array2[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu của mảng 2 là:");
        for (int i = 0 ; i < array2.length ; i++) {
            System.out.print(array2[i] + " ");
        }

        int size3;
        size3 = size1 + size2;
        int[] array3;
        array3 = new int[size3];
        for (int i = 0 ; i<array1.length ; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i<array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("Mảng 3 là:");
        for (int i = 0 ; i<array3.length ; i++) {
            System.out.print(array3[i]+ " ");
        }


    }
}
