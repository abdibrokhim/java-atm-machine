package com.abdibrokhim;

import java.io.IOException;
import java.util.Objects;

public class Paper {
    public static void paper() throws IOException {
        System.out.println("\nName: " + Account.client.get(0));
        System.out.println("Card Number: " + Account.client.get(1));
        System.out.println("Card Pin: " + Account.client.get(2));
        System.out.println("Balance: " + Account.client.get(3));
        System.out.println("Operation: #0x0100" + Account.client.get(4));
        System.out.println("\nReminder: " + Account.client.get(5));
        System.out.println("\n");

        System.out.println(Account.client);

        System.out.println(GFG.clCash);

        for(int i=0; i<10; i++)
        {
            if(Objects.equals(Account.client.get(4), Integer.toString(i)))
            {
                GFG.clCash.set(i, Account.client.get(5));
            }
        }

        Account.client.remove(3);
        Account.client.remove(3);
        System.out.println(Account.client);
        System.out.println(GFG.clCash);
        GFG.writeFileBalance(GFG.clCash);
    }

}
