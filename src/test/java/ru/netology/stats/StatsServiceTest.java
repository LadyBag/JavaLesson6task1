package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    private StatsService service=new StatsService();
   private int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSum() {
        int expected = 180;
        int actual = service.sum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {
        int expected = 15;
        int actual = service.average(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shoulReturnMonthNumberWithMax() {
        int expected = 8;
        int actual = service.monthWithMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shoulReturnMonthNumberWithMin() {
        int expected = 9;
        int actual = service.monthWithMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shoulReturnMonthCountWithLessThenAverage() {
        assertEquals( 5, service.monthCountWithLessThenAverage(purchases));
    }

    @Test
    void shoulReturnMonthCountWithMoreThenAverage() {
        assertEquals( 5, service.monthCountWithMoreThenAverage(purchases));
    }

}
