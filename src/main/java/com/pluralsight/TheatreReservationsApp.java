package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TheatreReservationsApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String fullName;
        while (true) {
            System.out.print("Please enter your name ✩: ");
            fullName = keyboard.nextLine().trim();

            if (fullName.contains(" ") && fullName.split(" ").length >= 2) {
                break;
            } else {
                System.out.println("Please enter first and last name .✦ ݁˖");
            }
        }

        String[] parts = fullName.split(" ");
        String firstName = parts[0];
        String lastName = parts[parts.length - 1];

        LocalDate date = null;
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        while (date == null) {
            System.out.print("What date will you be arriving? ₍^. .^₎⟆ (MM/dd/yyyy): ");
            String dateInput = keyboard.nextLine().trim();

            try {
                date = LocalDate.parse(dateInput, inputFormat);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid Date! T-T\nPlease use MM/dd/yyyy.");
            }
        }




    }
}
