/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Brooke Fuller
 */

import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;


public class Exercise12 {
    public static void main(String[] args) {

        System.out.println("Enter the principal: ");
        Scanner input = new Scanner(in);
        String principal = input.nextLine();
        double x = Double.parseDouble(principal);

        System.out.println("Enter the rate of interest: ");
        Scanner input2 = new Scanner(in);
        String interest_rate = input2.nextLine();
        double y = Double.parseDouble(interest_rate);

        System.out.println("Enter the number of years: ");
        Scanner input3 = new Scanner(in);
        String years = input3.nextLine();
        int z = Integer.parseInt(years);

        double p_interest = x * (1 + ((y * 0.01) * z));
        double interest_rounded = Math.round(p_interest * 100.0) / 100.0;



        System.out.println("After " + z + " years at " + y + "%, the investment will be worth " + interest_rounded);
    }
}