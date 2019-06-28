package main.java;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        Integer t = scanner.nextInt();
        scanner.close();
        Account account= new Account();
        account.money(t);
    }
}
