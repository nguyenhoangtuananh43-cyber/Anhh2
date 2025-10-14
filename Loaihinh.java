import java.util.Scanner;

public class Loaihinh {
    public static void main(String[] args) {
        int choice = 1;
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        while (choice != 0){
            System.out.println(" MENU");
            System.out.println("1. print the rectangle");
            System.out.println("2. print the square triangle");
            System.out.println("3. print isosceles triangle");
            System.out.println("4. EXit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Nhập chều rộng");
                    int width = sc.nextInt();
                    System.out.print("Nập chiều dài");
                    int height = sc.nextInt();
                    for (int i = 1; i <= width; i++){
                        for (int j = 1; j <= height; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Tam giác vuông bên dưới trái");
                    for ( int i =1;i <= 5;i++){
                        for (int j = 1; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Tam giác vuông dưới phải");
                    for  ( int i = 1; i <= 5; i++){
                        for (int j = i; j < 5; j++){
                            System.out.print(" ");
                            }
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println(" Tam giác vuông trên trái ");
                    for  ( int i = 5; i >= 1; i--){
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("Tam giác vuông trên phải ");
                    for (int i = 5; i >=1; i--){
                        for (int j = 5; j > i; j--){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Tam giác cân");
                    for  ( int i = 1; i <= 5; i++){
                        for (int j = i; j < 5; j++){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                    default:
                        System.out.println("No choice");
            }

        }
    }
}
