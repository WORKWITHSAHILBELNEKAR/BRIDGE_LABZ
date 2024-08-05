import java.util.Scanner;

public class DigitToNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single digit number (0-9): ");
        int number = scanner.nextInt();

        String word = convertDigitToWord(number);
        if (word != null) {
            System.out.println("The number in words is: " + word);
        } else {
            System.out.println("Invalid input. Please enter a single digit number (0-9).");
        }
    }

    public static String convertDigitToWord(int digit) {
        switch (digit) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return null;
        }
    }
}
