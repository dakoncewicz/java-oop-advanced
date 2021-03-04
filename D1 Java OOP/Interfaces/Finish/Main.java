package com.dkoncewicz;
/* Interferes i Dependency Injection */

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2020(100_000);
        var report2020 = new TaxReport(calculator);
        report2020.show();
    }

}
