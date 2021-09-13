package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 05 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used
        String num1; //number 1
        String num2; //number 2

        System.out.println("What is the first number? "); //prompt first number input
        num1 = userInput.nextLine(); //scan the input
        System.out.println( "What is the second number? " ); //prompt second number input
        num2 = userInput.nextLine();

        int num1int = Integer.parseInt(num1);
        int num2int = Integer.parseInt(num2);

        int sum1 = num1int + num2int; //sum
        int subst1 = num1int - num2int; //substraction
        int multi1 = num1int * num2int; //multiplication
        int div1 = num1int / num2int; //division

        //print output
        System.out.println("\n" + num1 + " + " + num2 + " = " + sum1 + "\n" + num1 + " - " + num2 + " = " + subst1 + "\n" + num1 + " * " + num2 + " = " + multi1 + "\n" + num1 + " / " + num2 + " = " + div1);
    }
}
