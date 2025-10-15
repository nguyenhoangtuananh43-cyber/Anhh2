import java.util.Scanner;

public class XoaPhantuCuaMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 4, 6, 7, 8,0,};
        int n = a.length;
        System.out.print("Nhập phần tử cần xoá: ");
        int x= sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == x){
                index = i;
                break;
            }

        }
        if (index == -1){
            System.out.println("Không  tìm thấy "  + x);
        }else {
            for (int i = index; i < n - 1; i++){
                a[i] = a[i + 1];
            }
            n--;
            System.out.print("Mảng sau khi xoá: ");
            for (int i=0; i<n; i++){
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
