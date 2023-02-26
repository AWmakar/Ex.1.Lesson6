package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectMonth = 9;
        long actualMonth = (service.minSales(sales));

        Assertions.assertEquals(expectMonth, actualMonth);


    }

    @Test
    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectMonth = 8;
        long actualMonth = (service.maxSales(sales));

        Assertions.assertEquals(expectMonth, actualMonth);

    }

    @Test
    public void shouldFindSumSalesAllMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectSumSales = 180;
        int actualSumSales = (service.sumSalesAllMonth(sales));

        Assertions.assertEquals(expectSumSales, actualSumSales);

    }

    @Test
    public void shouldFindAverageSalesAllMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectAverageSales = 15;
        int actualAverageSales = (service.averageSalesAllMonth(sales));

        Assertions.assertEquals(expectAverageSales, actualAverageSales);
    }

    @Test
    public void shouldFindMonthsSaleBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = (service.monthsSaleBelowAverage(sales));

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindMonthSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = (service.monthSaleAboveAverage(sales));

        Assertions.assertEquals(actual, expected);
    }
}
