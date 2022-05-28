package com.abdibrokhim;

import java.io.IOException;
import static com.abdibrokhim.Main.sc;

public class Menu {
    public static void mainMenu() throws IOException, InterruptedException {
        Thread.sleep(2000);
        System.out.println("\nCHOOSE AN OPTION\n");
        Thread.sleep(1000);
        System.out.println("[1] -> PIN");
        System.out.println("[2] -> SMS");
        System.out.println("[3] -> BALANCE");
        System.out.println("[4] -> WITHDRAW");
        System.out.println("[5] -> EXIT");
        Thread.sleep(1000);
        System.out.print("\n[?] -> ");

        option();
    }

    public static void option() throws IOException, InterruptedException {
        int option = sc.nextInt();

        switch (option) {
            case 1 -> Pin.validClient();
            case 2 -> SMS.connectSms();
            case 3 -> Withdraw.showBalance();
            case 4 -> Withdraw.withdrawCash();
            case 5 -> Handle.exit();
            default -> Handle.error();
        }
    }
}