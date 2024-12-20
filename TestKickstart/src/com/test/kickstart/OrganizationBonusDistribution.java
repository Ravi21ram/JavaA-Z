package com.test.kickstart;

import java.util.*;

class SalesExecutive {
    String id;
    int sales;
    List<SalesExecutive> subordinates;

    public SalesExecutive(String id, int sales) {
        this.id = id;
        this.sales = sales;
        this.subordinates = new ArrayList<>();
    }
}

public class OrganizationBonusDistribution {

    public static void main(String[] args) {
        SalesExecutive se1 = new SalesExecutive("SE1", 10);
        SalesExecutive se2 = new SalesExecutive("SE2", 12);
        SalesExecutive se3 = new SalesExecutive("SE3", 7);
        SalesExecutive se4 = new SalesExecutive("SE4", 4);
        SalesExecutive se5 = new SalesExecutive("SE5", 17);
        SalesExecutive se6 = new SalesExecutive("SE6", 6);
        SalesExecutive se7 = new SalesExecutive("SE7", 3);
        SalesExecutive se8 = new SalesExecutive("SE8", 9);
        SalesExecutive se9 = new SalesExecutive("SE9", 10);
        SalesExecutive se10 = new SalesExecutive("SE10", 11);
        SalesExecutive se11 = new SalesExecutive("SE11", 18);
        SalesExecutive se12 = new SalesExecutive("SE12", 2);
        SalesExecutive se13 = new SalesExecutive("SE13", 13);
        SalesExecutive se14 = new SalesExecutive("SE14", 15);
        SalesExecutive se15 = new SalesExecutive("SE15", 20);
        SalesExecutive se16 = new SalesExecutive("SE16", 8);
        SalesExecutive se17 = new SalesExecutive("SE17", 18);

        se1.subordinates.add(se2);
        se1.subordinates.add(se3);

        se2.subordinates.add(se4);
        se2.subordinates.add(se5);

        se3.subordinates.add(se6);
        se3.subordinates.add(se7);

        se5.subordinates.add(se9);
        se9.subordinates.add(se16);
        se16.subordinates.add(se17);

        lineWithHighestSales(se1, 3000000);
    }

    public static void lineWithHighestSales(SalesExecutive root, double totalBonus) {
        List<SalesExecutive> bestLine = findBestSalesLine(root);

        double budgetBonus = totalBonus * 0.25;
        double salesBonus = totalBonus * 0.75;

        int totalSubordinates = bestLine.stream().mapToInt(executive -> executive.subordinates.size()).sum();
        int totalSales = bestLine.stream().mapToInt(executive -> executive.sales).sum();

        System.out.println("Employee ID\t\tBonus");

        for (SalesExecutive executive : bestLine) {
            int subordinates = executive.subordinates.size();
            double subBonus = (subordinates / (double) totalSubordinates) * budgetBonus;

            double salesProportion = (executive.sales / (double) totalSales) * salesBonus;

            double totalExecutiveBonus = subBonus + salesProportion;

            System.out.println(executive.id + "\t\t\t" + (int) totalExecutiveBonus);
        }
    }

    private static List<SalesExecutive> findBestSalesLine(SalesExecutive executive) {
        List<SalesExecutive> bestLine = new ArrayList<>();
        bestLine.add(executive);

        if (executive.subordinates.isEmpty()) {
            return bestLine;
        }

        List<SalesExecutive> bestSubordinateLine = null;
        int maxSales = Integer.MIN_VALUE;

        for (SalesExecutive subordinate : executive.subordinates) {
            List<SalesExecutive> currentLine = findBestSalesLine(subordinate);
            int currentLineSales = currentLine.stream().mapToInt(e -> e.sales).sum();

            if (currentLineSales > maxSales) {
                maxSales = currentLineSales;
                bestSubordinateLine = currentLine;
            }
        }

        bestLine.addAll(bestSubordinateLine);
        return bestLine;
    }
}
