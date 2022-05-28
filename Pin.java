package com.abdibrokhim;

import java.io.IOException;
import java.util.Objects;

import static com.abdibrokhim.Account.clientsName;
import static com.abdibrokhim.Main.sc;

public class Pin {
    static int tries = 0;
    public static void changePin() throws IOException, InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nINPUT NEW PIN CODE");
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
        GFG.writeFilePin(GFG.clPins);
    }

    public static void validClient() throws InterruptedException, IOException {
        boolean end = false;
        Thread.sleep(1000);
        System.out.println("\nINPUT CARD HOLDER'S NAME");
        System.out.print("[****] -> ");
        String name = sc.next();
        for(int i = 0; i < 10; i++)
        {
            if (Objects.equals(clientsName.get(i), name) && Integer.toString(i).equals(Account.client.get(4)))
            {
                end = true;
                changePin();
                break;
            }
        }
        if (!end)
        {
            if(tries >= 2){
                Thread.sleep(2000);
                System.out.println("\nYOUR CARD WAS BLOCKED\n");
                Handle.exit();
            }
            Thread.sleep(2000);
            System.out.println("\nINVALID CARD HOLDER'S NAME\n");
            tries++;
            validClient();
        }

    }
}
