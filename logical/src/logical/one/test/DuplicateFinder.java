package logical.one.test;

import java.util.HashSet;

public class DuplicateFinder {
	public static void main(String[] args) {
		int[] array = {4, 5, 6, 7, 5, 9, 6}; // Example array with duplicates

		System.out.println("Duplicate elements in the array:");
		findDuplicates(array);
	}

	public static void findDuplicates(int[] array) {
		boolean hasDuplicate = false; // Flag to track if duplicates exist
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i]);
					hasDuplicate = true;
					break; // Avoid printing the same duplicate multiple times
				}
			}
		}
		if (!hasDuplicate) {
			System.out.println("No duplicate elements found.");
		}
	}

}
