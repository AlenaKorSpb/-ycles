package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long iten : sales) {
            sum += iten;
        }
        return sum;
    }

    public long findMin(long[] sales) {
        long min = sales[0];
        for (long item : sales) {
            if (min > item) {
                min = item;
            }
        }
        return min;
    }


    public long findMax(long[] sales) {
        long max = sales[0];
        for (long item : sales) {
            if (max < item) {
                max = item;
            }
        }
        return max;
    }

    public long findMedi(long[] sales) {
        long sum = calculateSum(sales);
        long medi;
        medi = sum / sales.length;

        return medi;
    }

    public long findMonthMax(long[] sales) {
        long month = sales[0];
        long count = 0;
        long number = 0;

        for (long item : sales) {
            count++;

            if (item == findMax(sales)) {
                number = count;
            }
        }
        return number;
    }

    public long findMonthMin(long[] sales) {

        long month = sales[0];
        long count = 0;
        long number = 0;

        for (long item : sales) {
            count++;
            if (item == findMin(sales)) {

                number = count;
            }
        }
        return number;
    }

    public long lowMedi(long[] sales) {
        long count = 0;
        for (long item : sales) {

            if (item < findMedi(sales)) {
                count++;
            }
        }
        return count;
    }

    public long monthsHighMedi(long[] sales) {
        long count = 0;

        for (long item : sales) {
            if (item > findMedi(sales)) {
                count++;
            }
        }
        return count;
    }

}























