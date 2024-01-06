package ss2_Loop.baitap;

public class HienThiSoNguyenToNhohon100 {
    public static void main(String[] args) {
        for (int i = 2; i<100; i++) {
            if (isPrime(i)){
                System.out.println(i+"");
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <=1) {
            return false;
        } else if(number == 2 || number ==3) {
            return true;
        } else {
            for (int i = 2 ; i<= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
