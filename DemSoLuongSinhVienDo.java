import java.util.Scanner;

public class DemSoLuongSinhVienDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();

        double[] diem = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập điểm sinh viên thứ %d: ", i + 1);
            diem[i] = sc.nextDouble();
        }

        int soSinhVienDo = 0;
        for (int i = 0; i < n; i++) {
            if (diem[i] >= 5.0) {
                soSinhVienDo++;
            }
        }

        System.out.println("Số lượng sinh viên thi đỗ là: " + soSinhVienDo);
    }
}
