package com.company;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
        double height = scan.nextDouble();
        System.out.print("Enter your weight in pounds: ");
        double weight = scan.nextDouble();

        double BMI = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " +String.format("%.2f", BMI));

        if(BMI >= 18.5 && BMI <= 25) {
            System.out.println("You are within the ideal weight range.");
        }
        else if(BMI > 25) {
            System.out.println("You are overweight, you should see a doctor.");
        }
        else if(BMI < 18.5) {
            System.out.println("You are underweight, you should see a doctor.");
        }
    }
}
