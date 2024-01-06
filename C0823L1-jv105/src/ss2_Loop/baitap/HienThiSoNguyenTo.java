package ss2_Loop.baitap;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 20;
        int count = 0;
        int N = 2;
        while (count < numbers) {
            if(isPrime(N)){
                System.out.println(N+"");
                count++;
            }
            N++;
        }
        scanner.close();
    }
    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        for (int i = 2; i<=Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
