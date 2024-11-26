package logical.one.test;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Call the isAnagram function to check if the strings are anagrams
        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    // Function to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert both strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths of the two strings are different
        if (str1.length() != str2.length()) {
            return false; // If lengths differ, they cannot be anagrams
        }

        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
