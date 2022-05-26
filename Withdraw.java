package com.abdibrokhim;

import java.io.IOException;
import static com.abdibrokhim.Main.sc;

public class Withdraw {
    public static void withdrawCash() throws IOException
    {

        System.out.println("\nCHOOSE AN OPTION\n");
        System.out.println("[1] -> 50 000");
        System.out.println("[2] -> 100 000");
        System.out.println("[3] -> 200 000");
        System.out.println("[4] -> 300 000");
        System.out.println("[5] -> 400 000");
        System.out.println("[6] -> 500 000");
        System.out.print("\n[?] -> ");

        option();
    }

    public static void option() throws IOException {
        int option = sc.nextInt();
        int initialAmount = 50000;
        int remindCash;
        String currentCash = Account.client.get(3);

        switch (option) {
            case 1 -> {
                remindCash = Integer.parseInt(currentCash) - initialAmount;
                if (remindCash > 0) {
                    String remindCashStr = Integer.toString(remindCash);
                    Account.client.add(remindCashStr);
                    Paper.paper();
                } else {
                    lack();
                }
            }
            case 2 -> {
                remindCash = Integer.parseInt(currentCash) - (initialAmount * 2);
                if (remindCash > 0) {
                    String remindCashStr = Integer.toString(remindCash);
                    Account.client.add(remindCashStr);
                    Paper.paper();
                } else {
                    lack();
                }
            }
            case 3 -> {
                remindCash = Integer.parseInt(currentCash) - (initialAmount * 4);
                if (remindCash > 0) {
                    String remindCashStr = Integer.toString(remindCash);
                    Account.client.add(remindCashStr);
                    Paper.paper();
                } else {
                    lack();
                }
            }
            case 4 -> {
                remindCash = Integer.parseInt(currentCash) - (initialAmount * 6);
                if (remindCash > 0) {
                    String remindCashStr = Integer.toString(remindCash);
                    Account.client.add(remindCashStr);
                    Paper.paper();
                } else {
                    lack();
                }
            }
            case 5 -> {
                remindCash = Integer.parseInt(currentCash) - (initialAmount * 8);
                if (remindCash > 0) {
                    String remindCashStr = Integer.toString(remindCash);
                    Account.client.add(remindCashStr);
                    Paper.paper();
                } else {
                    lack();
                }
            }
            case 6 -> {
                remindCash = Integer.parseInt(currentCash) - (initialAmount * 10);
                if (remindCash > 0) {
                    String remindCashStr = Integer.toString(remindCash);
                    Account.client.add(remindCashStr);
                    Paper.paper();
                } else {
                    lack();
                }
            }
            default -> Handle.error();
        }
    }

    public static void showBalance()
    {
        System.out.println("\nBALANCE: " + Account.client.get(3));
    }

    public static void lack()
    {
        System.out.println("\nINSUFFICIENT BALANCE\n");
    }
}
