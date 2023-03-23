package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldCalculateTotalSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateTotalSum(sales);

        Assertions.assertEquals(180, actual);
    }

    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateAverageSum(sales);

        Assertions.assertEquals(15, actual);
    }

    @Test
    void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMinSalesMonth(sales);

        Assertions.assertEquals(9, actual);
    }

    @Test
    void shouldFindMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMaxSalesMonth(sales);

        Assertions.assertEquals(8, actual);
    }

    @Test
    void shouldcalculateBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateBelowAverage(sales);

        Assertions.assertEquals(5, actual);
    }

    @Test
    void shouldcalculateUpperAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateUpperAverage(sales);

        Assertions.assertEquals(5, actual);
    }
}
