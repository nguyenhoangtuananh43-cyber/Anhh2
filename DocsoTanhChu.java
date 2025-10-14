import java.util.Scanner;

class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên (0-999): ");
        int num = sc.nextInt();

        if(num < 0 || num > 999) {
            System.out.println("Chỉ nhận số từ 0 đến 999");
        } else {
            System.out.println(docSo(num));
        }

        sc.close();
    }

    public static String docSo(int num) {
        String result = "";

        // Hàng trăm
        if(num >= 100) {
            int hundreds = num / 100;
            result += docDonVi(hundreds) + " hundred";
            num = num % 100;
            if(num != 0) {
                result += " and ";
            }
        }

        // Hàng chục và đơn vị
        if(num >= 20) {
            int tens = num / 10;
            switch(tens) {
                case 2: result += "twenty"; break;
                case 3: result += "thirty"; break;
                case 4: result += "forty"; break;
                case 5: result += "fifty"; break;
                case 6: result += "sixty"; break;
                case 7: result += "seventy"; break;
                case 8: result += "eighty"; break;
                case 9: result += "ninety"; break;
            }
            int units = num % 10;
            if(units != 0) {
                result += " " + docDonVi(units);
            }
        } else if(num > 0) {
            result += docDonVi(num); // số từ 1-19
        } else if(result.isEmpty()) {
            result = "zero";
        }

        return result;
    }

    public static String docDonVi(int num) {
        switch(num) {
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }
}
