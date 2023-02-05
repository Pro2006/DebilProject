package com.example.debilproject;

public class Algorithm {

    public Algorithm() {
    }

    public boolean isHappyTicket(String input) {
        int inputInt = Integer.parseInt(input);
        return isHappyTicket(inputInt);
    }

    public boolean isHappyTicket(int inputInt) {
        if (!(99_999 < inputInt && inputInt < 1_000_000)) {
        return false;
    }

    int s1 = 0, s2 = 0;
        for (int i = 0; i < 3; i++) {
        s1 += inputInt % 10;
        inputInt /= 10;
    }

        for (int i = 0; i < 3; i++) {
        s2 += inputInt % 10;
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
            if (isHappyTicket(String.valueOf(inputInt))) {
                return inputInt;
            } else {
                inputInt += 1;
            }
        }
        return -1;
    }

    public int countNumerics(String input) {
        int inputInt = Integer.parseInt(input);
        int counter = 0;
        while (inputInt  != 0) {
            inputInt /= 10;
            counter += 1;
        }
        return counter;
    }
}
