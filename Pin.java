package com.abdibrokhim;

import java.io.IOException;
import java.util.Objects;

import static com.abdibrokhim.Main.sc;

public class Pin {
    public static void changePin() throws IOException {
        System.out.println(Account.client);

        System.out.println("Input new PIN");
        System.out.print("[****] -> ");
        String pin = sc.next();

        for(int i=0; i<10; i++)
        {
            if(Objects.equals(Account.client.get(4), Integer.toString(i)))
            {
                GFG.clPins.set(i, pin);
            }
        }

        Account.client.remove(3);
        Account.client.remove(3);
        System.out.println(Account.client);
        GFG.writeFilePin(GFG.clPins);
    }
}
