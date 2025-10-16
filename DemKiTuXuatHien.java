import java.util.Scanner;

public class DemKiTuXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập chuỗi: ");
        String srt = sc.nextLine();

        System.out.print(" Nhập kí tự cần đếm: ");
        char ch = sc.next().charAt(0);
        int count = 0;

        for (int i = 1; i < srt.length(); i++) {
            if (srt.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Kí tự " + ch + " xuất hiện " + count + " lần trong chuỗi ");
    }
}
