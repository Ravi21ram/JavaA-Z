package logical.one.test;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicatesInAnArray {

    public static void check(int[] num) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int pairCount = 0;

        // Count the frequency of each element
        for (int value : num) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        // Calculate pairs for each unique element
        for (int count : frequencyMap.values()) {
            pairCount += count / 2; // Each pair consists of two identical elements
        }

        System.out.println("Total pairs: " + pairCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] n = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }

        check(n);
        sc.close();
    }
}
