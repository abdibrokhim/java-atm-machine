package com.abdibrokhim;

import java.io.IOException;
import java.util.Objects;

public class Paper {
    public static void paper() throws IOException {
        System.out.println("\nATM");
        System.out.println("\nNAME: " + Account.client.get(0));
        System.out.println("CARD NUMBER: " + Account.client.get(1));
        System.out.println("CARD PIN CODE: " + Account.client.get(2));
        System.out.println("BALANCE: " + Account.client.get(3));
        System.out.println("OPERATION: #0x01e0" + Account.client.get(4));
        System.out.println("\nWITHDRAW: " + (Integer.parseInt(Account.client.get(3)) - Integer.parseInt(Account.client.get(5))));
        System.out.println("REMINDER: " + Account.client.get(5));
        System.out.println("\n");

        for(int i=0; i<10; i++)
        {
            if(Objects.equals(Account.client.get(4), Integer.toString(i)))
            {
                GFG.clCash.set(i, Account.client.get(5));
            }
        }
        Account.client.remove(3);
        Account.client.remove(3);
        GFG.writeFileBalance(GFG.clCash);
    }
}
