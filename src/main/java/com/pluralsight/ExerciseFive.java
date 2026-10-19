package com.pluralsight;

import java.util.Scanner;

public class ExerciseFive {

    //Scanner
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        //Employee Name
        String fullName = getNames();

        //Employee Data
        double hoursWorked = getHoursWorked();
        double payRate = getPayRate();
        double overTimePay = getOverTimePay(hoursWorked);
        double grossPay = getGrossPay(hoursWorked, payRate, overTimePay);
        printEmployeeInfo(fullName, grossPay);

        //Preventing resource leaking from Scanner
        userInput.close();
    }/*Main END*/

    public static String getNames() {
        String firstName;
        String lastName;

        System.out.print("First name: ");
        firstName = userInput.next();
        System.out.print("Last name: ");
        lastName = userInput.next();
        return firstName + " " + lastName;
    }/*getNames END*/

    public static double getHoursWorked() {
        double hoursWorked;
        System.out.print("Hours worked this week: ");
        return hoursWorked = userInput.nextDouble();
    }/*getHoursWorked END*/

    public static double getPayRate() {
        double payRate;
        System.out.print("Pay per hour: ");
        return payRate = userInput.nextDouble();
    }/*getPayRate END*/

    public static double getGrossPay(double hoursWorked, double payRate, double overTimePay) {
        double grossPay;
        return grossPay = (hoursWorked * payRate) + overTimePay;
    }/*getGrossPay END*/

    public static double getOverTimePay(double hoursWorked) {
        double overTimePay;
        double overTimeRate = 1.5;
        if (hoursWorked > 40) {
            return overTimePay = (hoursWorked - 40) * 1.5;
        } else {
            return overTimePay = 0;
        }
    }/*getOverTimePay END*/

    public static void printEmployeeInfo(String fullName, double grossPay){
        System.out.println("\n------ Employee Info ------");
        System.out.printf("Employee name: %s\nGross pay: %.2f%n", fullName, grossPay);
    }/*printEmployeeInfo END*/
}
