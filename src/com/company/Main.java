package com.company;

import java.awt.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Task1_2();
//        Task3();
//        Task4();
//        Task5();
//        Task6();
//        Task7();
        Task8();
    }

    static void Task1_2() {
        // Task 1 & 2

        int num;
        System.out.println("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("Entered number is even");
        } else {
            System.out.println("Entered number is odd");
        }
    }

    static void Task3() {
        int var;
        System.out.println("Please enter variable: ");
        Scanner scanner = new Scanner(System.in);
        var = scanner.nextInt();
        if (var > 0) {
            System.out.println("Entered variable is greater than zero");
        } else if (var == 0) {
            System.out.println("Entered variable is equal to zero");
        } else {
            System.out.println("Entered variable is less than zero");

        }
    }

    static void Task4() {
        int height;
        float weight;
        System.out.println("Please enter your height in cm");
        Scanner scanner = new Scanner(System.in);
        height = scanner.nextInt();
        System.out.println("Please enter your weight in kg");
        weight = scanner.nextFloat();
        if (height > 150 && weight < 180) {
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I'm sorry you can't go!");
        }
    }

    static void Task5() {
        float tempInCelsius;
        System.out.println("Please enter temperature in Celsius");
        Scanner scanner = new Scanner(System.in);
        tempInCelsius = scanner.nextFloat();

        System.out.println("Temperature in Fahrenheit: " + (1.8 * tempInCelsius + 32));
    }

    static void Task6() {
        double income;
        System.out.println("Please enter your income:");
        Scanner scanner = new Scanner(System.in);
        income = scanner.nextDouble();
        if (income < 85528) {
            System.out.println("Your taxes: " + (income * 0.18 - 556.02));
        } else {
            System.out.println("Your taxes: " + (14839.02 + ((income - 85528) * 0.32)));
        }
    }

    static void Task7() {
        double loan;
        int numberOfInstallments;
        System.out.println("Please enter loan amount: ");
        Scanner scanner = new Scanner(System.in);
        loan = scanner.nextDouble();

        if (loan > 10000) {
            loan = 5000;
        } else if (loan < 100) {
            System.out.println("Minimum loan is 100");
        }

        System.out.println("Please enter number of installments: ");
        numberOfInstallments = scanner.nextInt();

        if (numberOfInstallments < 6) {
            System.out.println("Minimum number of installments is 6");
        } else if (numberOfInstallments <= 12) {
            System.out.println("Calculated monthly loan instalment: " + (loan / numberOfInstallments + (loan / numberOfInstallments * 0.025)));
        } else if (numberOfInstallments <= 24) {
            System.out.println("Calculated monthly loan installment: " + (loan / numberOfInstallments + (loan / numberOfInstallments * 0.05)));
        } else if (numberOfInstallments <= 48) {
            System.out.println("Calculated monthly loan installment: " + (loan / numberOfInstallments + (loan / numberOfInstallments * 0.1)));
        } else {
            System.out.println("Calculated monthly loan installment: " + (loan / 36 + (loan / 36 * 0.1)));
        }

    }

    static void Task8() {
        int year;
        int month;
        int days;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter year:");
        year = scanner.nextInt();

        System.out.println("Please enter month:");
        month = scanner.nextInt();

        System.out.println("Please enter days:");
        days = scanner.nextInt();

        System.out.println("Date for validation: " + year + "-" + month + "-" + days);

        if (month >= 1 && month <= 12) {
            System.out.println("\u001B[32m" + "Month entered is valid" + "\u001B[0m");
            } else {
            System.out.println("\u001B[31m" + "Month is not valid! Please reenter" + "\u001B[0m");
        }

        if (year >= 1000 && year <= 1999) {
            System.out.println("\u001B[32m" + "Year entered is valid" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Year is not valid! Please reenter." + "\u001B[0m");
            return;
        }

        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Entered year is leap year");
        } else {
            System.out.println("The year is not leap year");
            }
        }
    }