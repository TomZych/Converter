package org.example;

public class Converter {
    public String toPoundsAndOunces(int totalOunces){
        int pounds = totalOunces / 16;
        int ounces = totalOunces % 16;
        String unitslbs = pounds == 1 ? "lb" : "lbs";
        String unitsOz = "oz";
        return String.format("%d %s and %d %s", pounds, unitslbs, ounces, unitsOz);
    }
    public String toPounds(int totalOunces){
        double pounds = totalOunces / 16.0;
        return String.format("%.3f lbs", pounds);
    }
}

