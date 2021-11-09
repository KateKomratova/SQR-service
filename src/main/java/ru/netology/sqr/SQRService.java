package ru.netology.sqr;

public class SQRService {
    public int CalculateNumberSquares (int upperBorder, int bottomBorder) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= upperBorder && i * i <= bottomBorder) {
                counter++;
            }

        }
        return counter;

    }
}
