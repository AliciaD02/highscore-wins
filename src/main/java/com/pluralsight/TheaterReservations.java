package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static Scanner theScanner =new Scanner(System.in);

    public static void main(String[] args) {
        // ask user for his name
        System.out.println("Enter your name:");
        // after you need to store the users input
        String name = theScanner.nextLine();

         // ask user for date
        System.out.println("Enter date:(MM/dd/yyyy)");
        String date = theScanner.nextLine();


        // ask for the number of tickets aka numbers
        System.out.println("How many tickets:");
        int tickets = theScanner.nextInt();
        // because it wants to be special and use the "s" when multiple tickets we have to do an if statement
        String word;
        if(tickets ==1){
            word="ticket";
        }else {
            word = "tickets";
        }

        // after this we need to split
        //# ticket(s) reserved for (date) under (LastName, FirstName)

        String[] parts = name.split(" "); // make sure to leave a space if not it will split the letters

        // after this split it from first and last name
        String firstName = parts[0];
        String lastName = parts [1];
        // print out the format
        System.out.println(tickets + " " + word + " reserved for " + date + " " +"under" + " " + lastName  + ", " + firstName);






    }
}
