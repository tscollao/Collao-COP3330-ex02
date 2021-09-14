/*
 * UCF COP 3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Tristan Collao
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String word = "";
        System.out.println( "What is the input string?" );
        Scanner input = new Scanner(System.in);
        word = input.next();
        int length = word.length();
        System.out.println(word + " has " + length + " characters." );

    }
}
