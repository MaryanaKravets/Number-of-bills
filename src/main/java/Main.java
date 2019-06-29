package main.java;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Account account = new Account();
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        try {
            Integer t = scanner.nextInt();
            System.out.println("You entered: " + t);
            scanner.close();
            if (t >= 24565 && t <= 35789) {
                long startTime = System.currentTimeMillis();
                account.money(t);
                long endTime = System.currentTimeMillis();
                long totalTime = endTime - startTime;
                System.out.println("Execution time is: " + totalTime+ "" + " milliseconds");
            } else account.money(t);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("You entered incorrect data!");
        }


    }
}
