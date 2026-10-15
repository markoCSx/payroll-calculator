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

        System.out.print("\rLast name: ");
        lastName = userInput.next();

        //Declaring floating point variables
        double hoursWorked;
        double payRate;

        userInput.close();
    }

}
