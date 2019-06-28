package main.java;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        try {
            Integer t = scanner.nextInt();
            System.out.println("You entered: " + t);
            scanner.close();
            Account account = new Account();
            account.money(t);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("You entered incorrect data!");
        }

    }
}
