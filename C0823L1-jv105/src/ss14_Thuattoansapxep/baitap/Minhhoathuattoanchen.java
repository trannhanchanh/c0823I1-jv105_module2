package ss14_Thuattoansapxep.baitap;

import java.util.Scanner;

public class Minhhoathuattoanchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter" + list.length + "values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list:");
        for (int i = 0; i< list.length ; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing....");
        insertionSort(list);

    }
    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos-1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
        System.out.println("Mảng sau khi đã xếp là:");
        for (int j = 0 ; j< list.length; j++) {
            System.out.print(list[j]+ "\t");
        }
        System.out.println();
    }
}
