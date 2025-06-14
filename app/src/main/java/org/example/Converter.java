package org.example;

public class Converter {
  public String toPounds(int ounces) {
    double pounds = ounces / 16.0;//finds pounds from ounces
    return String.format("%.4f %s", pounds, (pounds == 1.0 ? "lb" : "lbs"));//condition ? : if true : if false
  }// returns pounds with 4 decimal places and either lb or lbs
  public String toPoundsAndOunces(int ounces) {//finds pounds and makes remainder ounces
    int pounds = ounces / 16;// truncates pounds
    int remainingOunces = ounces % 16;//modulus for ounces
    return String.format("%d %s %d oz", pounds, (pounds == 1.0 ? "lb" : "lbs"), remainingOunces);
  }
  
}
