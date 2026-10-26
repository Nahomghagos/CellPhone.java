package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

/*
 * CellPhoneApplication holds main(), the starting point of the program.
 * It tests the CellPhone class: it creates one empty phone, asks the user
 * for the phone's details, stores them with the setters, then prints them
 * back with the getters.
 */
    public class CellPhoneApplication {
     public static void main(String[] args) {
        // Create a new instance of CellPhone.
        // The parameterless constructor runs, so every property starts at its default (0 or "").
        CellPhone cellPhone1 = new CellPhone();

        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for cell phone information and set the properties.
        // Each answer is read into a local variable, then handed to the matching setter.
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read integer value
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline: nextInt() leaves the Enter key in the buffer,
        // and without this line the next nextLine() would read an empty answer

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();  // Read entire line till newline (keeps spaces, ex: iPhone 15 Pro Max)
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);

        // Close the scanner: we are done reading input


        // Display the properties of the phone using getters.
        // The getters read the values back out of the object, proving the setters stored them.
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());






         CellPhone cellPhone2 = new CellPhone();

        // Create a scanner object to read user input


        // Prompt user for cell phone information and set the properties.
        // Each answer is read into a local variable, then handed to the matching setter.
        System.out.print("What is the serial number? ");
          // Read integer value
        cellPhone2.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline: nextInt() leaves the Enter key in the buffer,
        // and without this line the next nextLine() would read an empty answer

        System.out.print("What model is the phone? ");
          // Read entire line till newline (keeps spaces, ex: iPhone 15 Pro Max)
        cellPhone2.setModel(model);

        System.out.print("Who is the carrier? ");

        cellPhone2.setCarrier(carrier);

        System.out.print("What is the phone number? ");

        cellPhone2.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");

        cellPhone2.setOwner(owner);


        CellPhone cellPhone3 = new CellPhone(1234567,"iphone 15", "At&t", "555-444-3333", "Nahom Hagos" );





        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone1.dial(cellPhone3.getPhoneNumber());
        cellPhone1.dial(cellPhone3);


        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);





    }
    public static void display(CellPhone phone) {
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }


}