package com.abdibrokhim;

public class Paper {
    public static void paper()
    {
        System.out.println("\nName: " + Account.client.get(0));
        System.out.println("Card Number: " + Account.client.get(1));
        System.out.println("Balance: " + Account.client.get(3));
        System.out.println("\nReminder: " + Account.client.get(4));


        Account.client.add(4, Account.client.get(4));
    }

}
