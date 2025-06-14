package org.example;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Ounce Conversion Program!\n");
    int ounces = 0; // Initialize ounces to avoid compilation error
    boolean valid = false; // Flag to check if input is valid
    while (!valid){
    System.out.println("How many ounces do you have? ");//prompt user
    String line = input.nextLine().trim();//read input and remove blank spaces
    if (line.isEmpty()) {//checks if input is nothing
        System.out.println("\nInput cannot be blank. Please enter a whole number of ounces less than 2,147,483,647.");
        continue;
    }
    try {
        ounces = Integer.parseInt(line);//checks if input is an int
        if (ounces < 0) {//checks if input is negative
            System.out.println("\nInvalid negative input. Please enter a whole number of ounces less than 2,147,483,647.");
        } else {//if valid, change bool
            valid = true;
        }
    } catch (NumberFormatException e) {//if input is not an int
        System.out.println("\nInvalid input. Please enter a whole number of ounces less than 2,147,483,647.");
    }
  }
    input.close();//close scanner
    Converter converter = new Converter();//create converter  
    System.out.println(converter.toPoundsAndOunces(ounces));
    System.out.println(converter.toPounds(ounces));
    System.out.println("\nThank you for using the OCP!");
  }
}
