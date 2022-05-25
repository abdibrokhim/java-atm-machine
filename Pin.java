package com.abdibrokhim;

import static com.abdibrokhim.Main.sc;

class Pin extends Menu {
    public static void changePin()
    {
        System.out.println("Input new PIN");
        String pin = sc.nextLine();

        Account.client.add(2, pin);

    }
}
