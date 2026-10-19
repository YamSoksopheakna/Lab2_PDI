package test;

import java.util.Scanner;

public class Lab1Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int math, english, physics, programming;

        System.out.print("Input your scores of 4 subjects (Math, English, Physics, and Programming): ");

        math = sc.nextInt();
        english = sc.nextInt();
        physics = sc.nextInt();
        programming = sc.nextInt();

        int max = math;
        int min = math;

        if (english > max)
            max = english;
        if (physics > max)
            max = physics;
        if (programming > max)
            max = programming;

        if (english < min)
            min = english;
        if (physics < min)
            min = physics;
        if (programming < min)
            min = programming;

        System.out.print("\nOutput:\n");
        System.out.print("Max score is: " + max + " (");

        boolean first = true;

        if (math == max) {
            System.out.print("Math");
            first = false;
        }
        if (english == max) {
            if (!first) System.out.print(" and ");
            System.out.print("English");
            first = false;
        }
        if (physics == max) {
            if (!first) System.out.print(" and ");
            System.out.print("Physics");
            first = false;
        }
        if (programming == max) {
            if (!first) System.out.print(" and ");
            System.out.print("Programming");
        }

        System.out.println(" courses).");

        System.out.print("Min score is: " + min + " (");

        first = true;

        if (math == min) {
            System.out.print("Math");
            first = false;
        }
        if (english == min) {
            if (!first) System.out.print(" and ");
            System.out.print("English");
            first = false;
        }
        if (physics == min) {
            if (!first) System.out.print(" and ");
            System.out.print("Physics");
            first = false;
        }
        if (programming == min) {
            if (!first) System.out.print(" and ");
            System.out.print("Programming");
        }

        System.out.println(" course).");

        double average = (math + english + physics + programming) / 4.0;

        System.out.println("Average score of this student: " + average);

        sc.close();
    }
}

