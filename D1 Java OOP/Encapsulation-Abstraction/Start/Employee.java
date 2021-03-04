package com.dkoncewicz;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public  int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
