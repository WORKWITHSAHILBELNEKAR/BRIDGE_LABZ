public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        int number = 1020304;
        System.out.println("After replacing 0's with 1's in " + number + ": " + replaceZeros(number));
    }

    public static int replaceZeros(int num) {
        if (num == 0) return 1;
        int result = 0;
        int multiplier = 1;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) digit = 1;
            result += digit * multiplier;
            multiplier *= 10;
            num /= 10;
        }
        return result;
    }
}