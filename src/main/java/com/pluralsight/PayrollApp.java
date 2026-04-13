package com.pluralsight;

import java.util.Scanner;

public class PayrollApp {
/*  Ask for user to enter how many hours they worked and projects into double variable
I chose to use double in this case because float is too limited */

    public static double hoursWorked (Scanner input) {
        System.out.println("How many hours per week did you work?");
        return input.nextDouble();

    }
//  Ask for user to input their pay rate
    public static double payRate (Scanner input) {
        System.out.println("What is your pay rate?");
        return input.nextDouble();
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//  Ask for user to enter their name and projects into string variable
        System.out.println("Enter your name: ");
        String name = input.nextLine();

//  Prints the person's name and how much they are getting paid per week
        System.out.printf("%s, your gross pay per week is: $%.2f", name, (hoursWorked(input) * payRate(input)));

    }
}
