package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
     public static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {
    //  ask the user to give you the teams and scores in the Home:Visitor|21:9 format - example

        System.out.println("Enter the game score in this format (Home:Visitor|score:score)");
       // after this I need to store the users input
        String scoreInput = theScanner.nextLine();  // I am getting the input in here

        // after asking for the information you have to split the strings
        String[] parts = scoreInput.split("\\|");
        // I am splitting the  input into parts

        // printing out the split parts I did  this to help me check my work.
       // System.out.println(parts[0]);
        //System.out.println(parts[1]);

        // what you now need to split it into smaller pieces
        String[] teams = parts[0].split(":"); // still confused on how to add this part
       // System.out.println(teams[0]);
        //System.out.println(teams[1]);



        String[] scores = parts[1].split(":");
       //  System.out.println(scores[0]);
         //System.out.println(scores[1]);

         // we are comparing the teams score and printing out the winner
        // because we are comparing two numbers it will be int
        // stuck in why
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);


        // we will be using the if statement (I think)
       if(score1 > score2) {
           System.out.println("Winner: " + teams[0]);
       }else
           System.out.println("Winner is " + teams[1]);




        }





    }

