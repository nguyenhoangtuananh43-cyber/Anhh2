import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"christian", "michael", "camila", "sienna", "tanya", "connor", "zachariah", "mallory", "zoe", "emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name =  scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + input_name + "in the list");

        }

    }
}
