package com.test.sample;

import java.util.Scanner;

public class Sample {

    public static String stringmethod(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            // Check if the next character is the same as the current one
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                // Append the character and its count if greater than 1
                result.append(input.charAt(i - 1));
                if (count > 1) {
                    result.append(count);
                }
                count = 1; // Reset count
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scan.nextLine();
        System.out.println("Output: " + stringmethod(input));
        scan.close();
    }
}
