package ru.netology.sqr;

public class SQRService {

    public int findSquar(int lowLimit, int upLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowLimit && i * i <= upLimit) counter++;

        }
        return counter;
    }

}

