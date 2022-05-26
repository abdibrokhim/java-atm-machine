package com.abdibrokhim;

import java.io.IOException;

import static com.abdibrokhim.Main.sc;

public class Menu {

    public static void mainMenu() throws IOException {

        System.out.println("\nChoose an option");
        System.out.println("[1] -> PIN");
        System.out.println("[2] -> SMS");
        System.out.println("[3] -> Balance");
        System.out.println("[4] -> Withdraw");
        System.out.println("[5] -> Exit");
        System.out.print("\n[?] -> ");

        option();
    }

    public static void option() throws IOException {
        int option = sc.nextInt();

        switch (option) {
            case 1 -> Pin.changePin();
            case 2 -> Paper.connectSms();
            case 3 -> Paper.showBalance();
            case 4 -> Withdraw.withdrawCash();
            case 5 -> Paper.exit();
            default -> System.out.println("\nInvalid Choice");
        }
    }
}