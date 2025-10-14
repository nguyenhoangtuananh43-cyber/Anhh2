import java.util.Scanner;

public class Lai {
    public static void main(String[] args) {
        double money = 0;
    int month = 1;
    double interestRate = 1.0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter investment amount : ");
money = sc.nextDouble();
        System.out.println("Enter number of month : ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = sc.nextDouble();
        double tatal_Interest = 0;
        for (int i = 0; i < month; i++){
           tatal_Interest = money * (interestRate / 100/ 12) * 3;
            System.out.println("Total of interest : " + tatal_Interest);
        }
    }
}
