package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner askLengthFeet = new Scanner(System.in);
        System.out.println("What is the length of the room in feet? ");

        String inputLengthFeetS = askLengthFeet.nextLine();
        if(inputLengthFeetS.isEmpty()) {
            System.out.println("Length of the room is required!");
        }
        else {
            int inputLengthFeet = parseInt(inputLengthFeetS);
            Scanner askWidthFeet = new Scanner(System.in);
            System.out.println("What is the width of the room in feet? ");
            String inputWidthFeetS = askWidthFeet.nextLine();
            if(inputWidthFeetS.isEmpty()) {
                System.out.println("Width of the room is required!");
            }
            else {
                int inputWidthFeet = parseInt(inputWidthFeetS);
                double areaFeet = inputLengthFeet * inputWidthFeet;
                final double conversionFactor = 0.09290304;
                double areaMeters = areaFeet * conversionFactor;
                System.out.println("You entered dimensions of " + inputLengthFeet + " feet by " + inputWidthFeet + " feet.\nThe area is\n" + areaFeet + " square feet\n" + areaMeters + " square meters");
            }
        }
    }
}
