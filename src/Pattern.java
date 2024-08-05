class Pattern {
    public static void main(String[] args) {
        int num = 3; // Starting number
        for (int i = 1; i <= 4; i++) { // Loop for the number of lines
            for (int j = 0; j < i; j++) { // Loop for the number of elements in each line
                System.out.print(num + j + " ");
            }
            num += i; // Increment the starting number for the next line
            System.out.println(); // Move to the next line
        }
    }
}