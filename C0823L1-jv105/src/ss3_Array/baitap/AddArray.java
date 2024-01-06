package ss3_Array.baitap;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size:");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("Độ dài mảng không vượt quá 10 phần tử.");
            }
        } while (size >10);
        array = new int[size];
        for (int i = 0 ; i < array.length; i++) {
            System.out.print("Enter element"+(i+1)+ ":");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu là:");
        for (int i = 0 ; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int addIndex;
        int elementAdd;
        do {
            System.out.println("Enter add index:");
            addIndex = scanner.nextInt();
        } while (addIndex <= -1 || addIndex> array.length - 1);
        System.out.println("Enter add element:");
        elementAdd = scanner.nextInt();
        for (int i = array.length - 1; i> addIndex ; i--) {
            array[i] = array[i-1];
        }
        array[addIndex] = elementAdd;
        System.out.println("Mảng mới là:");
        for (int i = 0 ; i< array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
