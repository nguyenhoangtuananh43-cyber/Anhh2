import java.util.Scanner;

public class Tien {
    public static void main(String[] args) {
        double VND=23000;
        double USD;
Scanner sc=new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        USD=sc.nextDouble();
        double Quydoi = USD*23000;
        System.out.print("Giá trị VND: " + Quydoi);
    }
}
