public class RepetedElement {
    public static void findDuplicates(int[] arr) {
        System.out.print("Repeted elements: ");
        boolean duplicatesExist = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    duplicatesExist = true;
                    break;  // To avoid printing the same element multiple times
                }
            }
        }

        if (!duplicatesExist) {
            System.out.print("None");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8};
        findDuplicates(arr);
    }
}