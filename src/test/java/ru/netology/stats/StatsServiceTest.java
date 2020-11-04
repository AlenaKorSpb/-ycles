package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    //1 сумма продаж
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);

    }
// 2 миним. сумма продаж
    @Test
    void findMin() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.findMin(sales);
        assertEquals(expected, actual);
    }

//3 максим.сумма продаж
    @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;
        long actual = service.findMax(sales);
        assertEquals(expected, actual);
    }

// 4 средняя сумма продаж
    @Test
    void findMedi() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.findMedi(sales);
        assertEquals(expected, actual);
    }

// 5 номер месяца с макс. суммой продаж
    @Test
    void findMonthMax () {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        //long expected = 7;
        long actual = service.findMonthMax(sales);
        assertEquals(expected, actual);
    }


// 6 номер месяца с мин.суммой продаж
    @Test
    void findMonthMin() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMonthMin(sales);
        assertEquals(expected, actual);
    }



// 7. кол-во месяцев ниже среднего ( ниже 15- 5 мес)
    @Test
    void LowMedi() {
    StatsService service = new StatsService();

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    long expected = 5;
    long actual = service.LowMedi(sales);
    assertEquals(expected, actual);
}


    // 8. кол-во месяцев выше среднего (выше 15 - 5 мес)
    @Test
    void monthsHighMedi() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthsHighMedi(sales);
        assertEquals(expected, actual);
    }
}







