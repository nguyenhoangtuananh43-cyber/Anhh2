import java.util.Scanner;

public class TinhTongCacSoOCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int rows = sc.nextInt();

        System.out.print("Nhập số cột của ma trận: ");
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Phần tử [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextDouble();
            }
        }

        System.out.print("Nhập chỉ số cột muốn tính tổng (bắt đầu từ 0): ");
        int colIndex = sc.nextInt();

        if (colIndex < 0 || colIndex >= cols) {
            System.out.println("Chỉ số cột không hợp lệ!");
        } else {

            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][colIndex];
            }

            System.out.println("Tổng các phần tử ở cột " + colIndex + " là: " + sum);
        }
    }
}
