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

        // for (long  : sales) {
        medi = sum / sales.length;

        return medi;
    }


    public long findMonthMax(long[] sales) {
        long max = findMax(sales);  //sales[0];
        long month = 0;
        for (long item : sales) {
            //month = item + 1;
            if (month == max) {
                month = item;
            }

        }
        return month;
    }

    public long findMonthMin(long[] sales) {
                                        //long min = findMin(sales); //sales[0];
        long month = 8;
        long count = 0;
        for (long item : sales) {
            if (month < findMin(sales)) {
                count = month;
                                      //month = sales.length - count;
            }
                                       // month = sales.length - min;//item
                                        //(month == min) {
            return count;
        }

    }

    public long LowMedi(long[] sales) {
        long count = 0;
        for (long item : sales) {
            if (item < findMedi(sales)) {
                count++;
            }
            return count;
        }
    }



    public long monthsHighMedi(long[] sales) {
        long count = 0;
        long months = 0;
        for (long item : sales) {
            if (item > months) {
                count++;
            }
        }
        return count;
    }
}























