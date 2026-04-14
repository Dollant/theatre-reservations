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



    }
}
