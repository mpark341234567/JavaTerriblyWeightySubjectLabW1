package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Ounce Conversion Program!");
    System.out.println("\nHow many ounces do you have? ");
    int ounces = input.nextInt();
    input.close();
    Converter converter = new Converter(); 
    System.out.println(converter.toPoundsAndOunces(ounces));
    System.out.println(converter.toPounds(ounces));
    System.out.println("\nThank you for using the OCP!");
  }
}
