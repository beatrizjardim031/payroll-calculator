package com.pluralsight;

import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*  Create a Java application named payroll-calculator
    that prompts the user to enter: */

//  Ask for user to enter their name and projects into string variable
        System.out.println("Enter your name: ");
        String name = input.nextLine();

/*  Ask for user to enter how many hours they worked and projects into double variable
    I chose to use double in this case because float is too limited
 */
        System.out.println("How many hours per week did you work?");
        double hoursWorked = input.nextDouble();

//  Ask for user to input their pay rate
        System.out.println("What is your pay rate?");
        double payRate = input.nextDouble();

//  Prints the person's name and how much they are getting paid per week
        System.out.printf("%s, your gross pay per week is: $%.2f", name, (hoursWorked * payRate));

    }
}
