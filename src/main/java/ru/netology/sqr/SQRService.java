package ru.netology.sqr;

public class SQRService {

    public int findSquar(int lowlimit, int uplimit) {
        int counter = 0;
        int hassquar;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowlimit && i * i <= uplimit) {
                hassquar = 1;
            } else {
                hassquar = 0;
            }
            counter += hassquar;
        }
        return counter;
    }

}
