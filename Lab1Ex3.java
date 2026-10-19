package test;


import java.util.Scanner;

public class Lab1Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, min, max;

        System.out.println("Please input 5 numbers:");

        num = sc.nextInt();
        min = num;
        max = num;

        for (int i = 2; i <= 5; i++) {
            num = sc.nextInt();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Among all the five input numbers, \nmin is "
                + min + " and max is " + max + ".");

        sc.close();
    }
}
