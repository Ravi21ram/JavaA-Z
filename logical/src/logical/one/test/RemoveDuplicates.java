package logical.one.test;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 5, 9, 6}; // Example array with duplicates

        int uniqueCount = 0; // To track the position of unique elements

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Check if the element already exists in the unique portion
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, move it to the unique portion
            if (!isDuplicate) {
                array[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Print the unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
