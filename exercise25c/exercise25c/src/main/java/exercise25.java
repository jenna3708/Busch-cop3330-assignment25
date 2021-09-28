/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.Scanner;
import java.util.Arrays;

public class exercise25 {

    static int passwordValidator(String password){
        int strength;
        //strength is valued 1-4

        if(password.length()< 8 && password.matches(("[0-9]+")))
        {
            strength = 1;
            System.out.println("The password \""+password+"\" is a very weak password");
            return strength;
        }
        else if(password.length()<8 && password.matches(("[a-z]+")))
        {
            strength = 2;
            System.out.println("The password \""+password+"\" is a weak password");
            return strength;
        }
        else if(password.length()>=8 && password.matches(("^[A-Za-z0-9]*$")))
        {
            strength = 3;
            System.out.println("The password \""+password+"\" is a strong password");
            return strength;
        }
        else
        {
            strength = 4;
            System.out.println("The password \""+password+"\" is a very strong password");
            return strength;
        }

    }

    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your password:");
        String password = input.next();

        passwordValidator(password);

    }
}


//else if(password.length()>=8 && password.matches(("[a-z]+")) && password.matches(("[0-9]+")))