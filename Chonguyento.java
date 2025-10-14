import java.util.Scanner;

public class Chonguyento {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println(" Nhập số lượng số nguyên tố cần in: ");
        int numbers = scan.nextInt();
        int count = 0;
        int n = 2;
        while (count < numbers){
            if (isPrime(n)){
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
    public static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i < Math.sqrt(n); i++){
             if (n % i == 0) return false;
        }
        return true;
    }
}
