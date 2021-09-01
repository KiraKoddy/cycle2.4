package ru.netology.stats;

public class StatsService {

    public long sum(long[] items) {
        long result = 0;
        for (long item : items) {
            result += item;
        }
        return result;
    }

    public long avg(long[] items) {
        long sum = sum(items);
        return sum / items.length;
    }

    public int montnWithMax(long[] items) {
        long max = items[0];
        for (long item : items) {
            if (item > max) {
                max = item;
            }
        }
        int month = 0;
        int monthWithMax = 0;
        for (long item : items) {
            month += 1;
            if (item == max) {
                monthWithMax = month;
            }
        }
        return monthWithMax;
    }

    public long montnWithMin(long[] items) {
        long min = min(items);
        int monthCounter = 0;
        int montWithMin = 0;
        for (long item : items) {
            monthCounter++;
            if (item == min) {
                montWithMin = monthCounter;
            }
        }
        return montWithMin;
    }

    public long min(long[] items) {
        long min = items [0];
        for (long item : items) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public int moreThenAvg(long[] items) {
        long avg = avg(items);
        int monthCount = 0;
        for (long item : items) {
            if (item > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int lessThenAvg(long[] items) {
        long avg = avg(items);
        int monthCount = 0;
        for (long item : items) {
            if (item < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }
}