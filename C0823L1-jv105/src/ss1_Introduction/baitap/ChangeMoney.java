package ss1_Introduction.baitap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá tiền đô la Mỹ:");
        double usa = scanner.nextDouble();
        double change = usa * vnd;
        System.out.println("Trị giá VNĐ là:"+ change);

    }
}
