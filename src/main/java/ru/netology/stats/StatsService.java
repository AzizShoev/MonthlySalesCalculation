package ru.netology.stats;

public class StatsService {
    // метод для вычисления суммы всех продаж
    public long calculateTotalSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    // метод для вычисления средней суммы продаж в месяц
    public long calculateAverageSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    // метод вычесления месяца, в котором было минимум продаж
    public int findMinSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // метод для вычисления номера месяца, в котором был пик продаж
    public int findMaxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // метод для вычисления количества месяцев, в которых продажи были ниже среднего
    public int calculateBelowAverage(long[] sales) {
        long sum = 0;
        int average = 0;
        int count = 0;
        for (long sale : sales) {
            sum = sum + sale;
            average = (int) (sum / sales.length);
        }
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    //метод для вычисления количества месяцев, в которых продажи были выше среднего
    public int calculateUpperAverage(long[] sales) {
        long sum = 0;
        int average = 0;
        int count = 0;
        for (long sale : sales) {
            sum = sum + sale;
            average = (int) (sum / sales.length);
        }
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
