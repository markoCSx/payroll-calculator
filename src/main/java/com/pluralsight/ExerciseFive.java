package com.pluralsight;

import java.util.Scanner;

public class ExerciseFive {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        //Declaring name variables
        String firstName;
        String lastName;

        //Collecting users names
        System.out.print("First name: ");
        firstName = userInput.next();
        System.out.print("Last name: ");
        lastName = userInput.next();

        //Declaring floating point variables
        double hoursWorked;
        double payRate;
        double grossPay;

        //Collecting data for gross pay
        System.out.print("Hours worked this week: ");
        hoursWorked = userInput.nextInt();
        System.out.print("Pay per hour: ");
        payRate = userInput.nextInt();

        //Gross pay math
        grossPay = hoursWorked * payRate;

        //Displaying users name and gross pay
        System.out.println("\n------ Employee Info ------");
        System.out.printf("Employee name: %s %s\nGross pay: %.2f%n", firstName, lastName, grossPay);

        userInput.close();
    }

}
