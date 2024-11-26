package com.test.one;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DiwaliSaleBOGO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();

        List<Integer> productPrices = new ArrayList<>();

        System.out.println("Enter the prices of the products:");
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.print("Price of product " + (i + 1) + ": ");
            productPrices.add(scanner.nextInt());
        }
        scanner.close();
        calculateBOGO(productPrices);
    }

    public static void calculateBOGO(List<Integer> prices) {
        Collections.sort(prices, Collections.reverseOrder());

        List<Integer> payableItems = new ArrayList<>();
        List<Integer> freeItems = new ArrayList<>();
        for (int i = 0; i < prices.size(); i++) {
            if (i % 2 == 0) {
            	
                payableItems.add(prices.get(i));
            } else {

            	freeItems.add(prices.get(i));
            }
        }

        System.out.println("Payable Items: " + payableItems);
        System.out.println("Discounted Items (Free): " + freeItems);
        System.out.println();
    }
}
