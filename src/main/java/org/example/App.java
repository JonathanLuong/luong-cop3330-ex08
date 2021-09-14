package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in); // Creates reader



        System.out.println( "How many people? " );
        String people = reader.nextLine();

        System.out.println( "How many pizzas do you have?" );
        String pizza = reader.nextLine();

        System.out.println( "How many slices per pizza?" );
        String slices = reader.nextLine();

        int ppl = Integer.parseInt(people);
        int pz = Integer.parseInt(pizza);
        int totalSlices = Integer.parseInt(slices) * pz;
        int slicePerPerson = totalSlices/ppl;
        int leftover = totalSlices%ppl;

        System.out.println(ppl + " people with " + pz + " pizzas (" + totalSlices + " slices)");
        System.out.printf("Each person gets %d pieces of pizza.", slicePerPerson);
        System.out.printf("\nThere are %d leftover pieces.", leftover);

    }
}