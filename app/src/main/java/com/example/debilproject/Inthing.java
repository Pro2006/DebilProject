package com.example.debilproject;

public class Inthing {
    int CalculationOfMonth(float thing, float account, float scholarship, float percent) {
        int month = 0;
        while (thing > account) {
            account = (account + scholarship) * (1 + percent);
            month += 1;
        }
        return month;
    }
}
