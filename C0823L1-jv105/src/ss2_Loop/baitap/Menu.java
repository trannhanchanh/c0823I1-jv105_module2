package ss2_Loop.baitap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice !=4) {
            System.out.println("Menu");
            System.out.println("1.Print the rectangle.");
            System.out.println("2.Print the square traingle.");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle.");
                    for (int i = 1; i <=3; i++) {
                        for (int j = 1; j<=7; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Print the square traingle.");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j<=i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle.");
                    for (int i = 5; i>=1; i--) {
                        for (int j = 1; j<=i; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
