package test;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Lab1Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input date (yyyy-mm-dd): ");
        String date = sc.nextLine();

        try {
            LocalDate.parse(date);

            if (date.matches("\\d{4}-\\d{2}-\\d{2}")) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }

        } catch (DateTimeParseException e) {
            System.out.println("invalid");
        }

        sc.close();
    }
}