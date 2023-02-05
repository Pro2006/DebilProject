package com.example.debilproject;

public class PiterAlgorithm {
    public PiterAlgorithm() {
    }

    public boolean isHappyTicketPiter(String input) {
        int inputInt = Integer.parseInt(input);
        return isHappyTicketPiter(inputInt);
    }

    public boolean isHappyTicketPiter(int inputInt) {
        if (!(99_999 < inputInt && inputInt < 1_000_000)) {
            return false;
        }

        int s1 = 0, s2 = 0, numb = 0;
        for (int i = 0; i < 6; i++) {
            numb = inputInt % 10;
            if (numb % 2 == 0) {
                s1 += numb;
            } else {
                s2 += numb;
            }
            inputInt /= 10;
        }

        return s1 == s2;
    }

    public int nextHappyInt(String input) {
        int inputInt = Integer.parseInt(input);

        if (!(99_999 < inputInt && inputInt < 1_000_000)) {
            return -1;
        }

        while (inputInt <= 999_999) {
            if (isHappyTicketPiter(String.valueOf(inputInt))) {
                return inputInt;
            } else {
                inputInt += 1;
            }
        }
        return -1;
    }
}
