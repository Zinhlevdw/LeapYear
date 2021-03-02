package com.Zinhle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean leap=true;
        //reads data from terminal window System.in
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any year: ");
        //nextInt() passes only integer values
        int year = scan.nextInt();
        //closes the scanner
        scan.close();
        // checks if the year is divisible by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}





