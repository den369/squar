package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void showThreeSquares() {
        SQRService sqrService = new SQRService();
        int lowLimit = 200;
        int upLimit = 300;
        int expected = 3;
        int actual = sqrService.findSquar(lowLimit, upLimit);
        assertEquals(expected, actual);
    }

    @Test
    void showEightSquares() {
        SQRService sqrService = new SQRService();
        int lowLimit = 100;
        int upLimit = 300;
        int expected = 8;
        int actual = sqrService.findSquar(lowLimit, upLimit);
        assertEquals(expected, actual);

    }
}