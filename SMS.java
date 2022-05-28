package com.abdibrokhim;

import java.io.IOException;
import java.util.Objects;

import static com.abdibrokhim.Main.sc;

public class SMS {
    public static void connectSms() throws IOException, InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nINPUT PHONE NUMBER");
        System.out.print("[****] -> ");
        String phoneNum = sc.next();

        for(int i = 0; i < 10; i++)
        {
            if(Objects.equals(Account.client.get(4), Integer.toString(i)))
            {
                GFG.clPhone.set(i, phoneNum);
            }
        }
        GFG.writeFilePhone(GFG.clPhone);
    }
}
