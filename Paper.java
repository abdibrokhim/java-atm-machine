package com.abdibrokhim;

import java.io.IOException;
import java.util.Objects;

import static com.abdibrokhim.Main.sc;

public class Paper {
    public static void paper() throws IOException {
        System.out.println("\nName: " + Account.client.get(0));
        System.out.println("Card Number: " + Account.client.get(1));
        System.out.println("Card Pin: " + Account.client.get(2));
        System.out.println("Balance: " + Account.client.get(3));
        System.out.println("Operation: #0x01e0" + Account.client.get(4));
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

    public static void showBalance()
    {
        System.out.println("Balance: " + Account.client.get(3));
    }

    public static void connectSms() throws IOException {
        System.out.print("\nInput Phone Number: ");
        String phoneNum = sc.next();

        for(int i=0; i<10; i++)
        {
            if(Objects.equals(Account.client.get(4), Integer.toString(i)))
            {
                GFG.clPhone.set(i, phoneNum);
            }
        }
        GFG.writeFilePhone(GFG.clPhone);
    }

    public static void exit()
    {
        System.exit(0);
    }

}
