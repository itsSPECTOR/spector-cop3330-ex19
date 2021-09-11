package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 19 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    static double CONSTANT = 703;

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        //variables
        double height = 0, weight = 0, bmi;
        int flag= 0;
        String strWeight, strHeight;

            //get height
            while (flag == 0) {
                System.out.print("Enter your height in inches: ");
                strHeight = input.nextLine();
                try {
                    height = Double.parseDouble(strHeight);
                    flag = 1;
                }
                catch (NumberFormatException ex) {}
            } flag = 0; //reset flag

            //get weight
            while (flag == 0) {
                System.out.print("Enter your weight in pounds: ");
                strWeight = input.nextLine();
                try {
                    weight = Double.parseDouble(strWeight);
                    flag = 1;
                }
                catch (NumberFormatException ex) {}
            }

        //math
        bmi = (weight / (height * height)) * CONSTANT;
        bmi = Math.round(bmi * 100.0) / 100.0; //round
        System.out.print("Your BMI is " + bmi + ". \n");

        //display result if unhealthy
        if (bmi > 25 || bmi < 19.5){
            if (bmi > 25){ System.out.print("You are overweight. You should see your doctor.\n"); }
            if(bmi < 19.5){ System.out.print("You are underweight. You should see your doctor.\n"); }
        } else { System.out.print("You are within the ideal weight range.\n"); }

    }
}
