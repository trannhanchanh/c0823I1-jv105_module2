package ss3_Array.baitap;

import java.util.Scanner;

public class DeleteArray {
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
        int delIndex;
        int elementDel;
        System.out.println("Nhập phần tử cần xóa:");
        elementDel = scanner.nextInt();
        for (int i = 0 ; i < array.length; i++) {
            if (array[i] == elementDel) {
                delIndex = i;
                System.out.println("Phần tử cần xóa nằm ở vị trí"+delIndex);
                for (int j = delIndex; j< array.length - 1; j++) {
                    array[j] = array[j+1];
                }
                array[array.length - 1] = 0;
            }
        }
        System.out.println("Mảng mới là:");
        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }
}
