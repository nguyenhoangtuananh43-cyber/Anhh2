import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo mảng có sẵn 6 phần tử + chừa trống thêm phần tử mới
        int[] a = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        int n = 6;


        System.out.print("Nhập phần tử cần thêm: ");
        int x = sc.nextInt();


        System.out.print("Nhập vị trí muốn thêm (0 đến " + n + "): ");
        int index = sc.nextInt();


        if (index < 0 || index > n) {
            System.out.println("Vị trí không hợp lệ!");
        } else {

            for (int i = n; i > index; i--) {
                a[i] = a[i - 1];
            }

            a[index] = x;
            n++;
            System.out.print("Mảng sau khi thêm là: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
