package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void showThreeSquares() {
        SQRService sqrService = new SQRService();
        int lowlimit = 200;
        int uplimit = 300;
        int expected = 3;
        int actual = sqrService.findSquar(lowlimit, uplimit);
        assertEquals(expected, actual);
    }

    @Test
    void showEightSquares() {
        SQRService sqrService = new SQRService();
        int lowlimit = 100;
        int uplimit = 300;
        int expected = 8;
        int actual = sqrService.findSquar(lowlimit, uplimit);
        assertEquals(expected, actual);

    }
}