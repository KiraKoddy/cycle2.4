package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void shouldAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.avg(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthWithMax() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.montnWithMax(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    void shouldMonthWithMin() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.montnWithMin(sales);
        long expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void shouldMonthCountMoreThenAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.moreThenAvg(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    void shouldMonthCountLessThenAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.lessThenAvg(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
}