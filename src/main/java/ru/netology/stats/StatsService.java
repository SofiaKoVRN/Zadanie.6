package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int allSales = 0;
        for (int i = 0; i < sales.length; i++) {
            allSales += sales[i];
        }
        return allSales;
    }

    public long average(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMin]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public long salesBelowAverage(int[] sales) {
        int counter = 0;
        long averageSales;
        averageSales = average(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public long salesAboveAverage(int[] sales) {
        int counterTwo = 0;
        long averageSales;
        averageSales = average(sales);
        for (long sale : sales) {
            if (averageSales <= sale) {
                counterTwo++;
            }
        }
        return counterTwo;
    }
}