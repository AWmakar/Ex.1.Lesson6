package ru.netology.stats;
public class StatsService {

    // Номер месяца, в котором был минимум продаж;
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // номер месяца с максимальными продажами;
    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    // Сумма всех продаж;
    public int sumSalesAllMonth(int[] sales) {
        int sumSale = 0;  //
        for (int sale : sales) {
            sumSale = sumSale + sale;
        }
        return sumSale;
    }

    //  Сумма средних продаж в месяц;
    public int averageSalesAllMonth(int[] sales) {
        int averageSales = sumSalesAllMonth(sales) / sales.length;

        return averageSales;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int monthsSaleBelowAverage(int[] sales) {
        int average = averageSalesAllMonth(sales);
        int monthBelowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average)
                monthBelowAverage++;

        }
        return monthBelowAverage;
    }

    // Количество месяцев, в которых продажи были выше среднего

    public int monthSaleAboveAverage(int[] sales) {
        int average = averageSalesAllMonth(sales);
        int monthAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average)
                monthAboveAverage++;
        }
        return monthAboveAverage;
    }
}


