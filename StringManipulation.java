import java.util.Scanner;

public class StringManipulator {

    public static void toBlockLetters(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                str.setCharAt(i, (char) (c - ('a' - 'A')));
            }
        }
    }

    public static void reverseAndShift(StringBuilder str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            char temp = str.charAt(i);
            str.setCharAt(i, str.charAt(len - i - 1));
            str.setCharAt(len - i - 1, temp);
        }
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c < 'z') || (c >= 'A' && c < 'Z')) {
                str.setCharAt(i, (char) (c + 1));
            } else if (c == 'z') {
                str.setCharAt(i, 'a');
            } else if (c == 'Z') {
                str.setCharAt(i, 'A');
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);
        System.out.println("\nChoose an operation:");
        System.out.println("1. Convert to Block Letters");
        System.out.println("2. Reverse and Shift Alphabets");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                toBlockLetters(str);
                System.out.println("\nBlock Letters: " + str);
                break;
            case 2:
                reverseAndShift(str);
                System.out.println("\nReverse + Shift: " + str);
                break;
            default:
                System.out.println("\nInvalid choice!");
        }
        sc.close();
    }
}
