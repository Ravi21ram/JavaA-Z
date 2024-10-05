package com.test.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class StockTracker {
    private static Map<String, int[]> stockVolume = new HashMap<>();

    static void addStock(String stock, int[] dailyVol) {
        stockVolume.put(stock, dailyVol);
    }

    static void printStockVolumes() {
        for (Map.Entry<String, int[]> entry : stockVolume.entrySet()) {
            System.out.println("Stock: " + entry.getKey() + ", Volumes: " + Arrays.toString(entry.getValue()));
        }
    }

    public static void main(String[] args) {
        addStock("ONGC", new int[]{125504, 227808, 418706, 518706, 618706});
        addStock("ICICI", new int[]{642675, 505563, 655457, 555457, 645457});
        addStock("TCS", new int[]{314534, 416543, 213766, 313766, 237667});
        addStock("HDFC", new int[]{161907, 262122, 359839, 459839, 379839});

        printStockVolumes();
    }
}