package com.abdibrokhim;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import static com.abdibrokhim.Main.sc;

public class Account
{
    static int tries = 0;
    static ArrayList<String> clientsName;
    private static ArrayList<String> clientsCardNum;
    private static ArrayList<String> clientsCardPinCode;
    private static ArrayList<String> clientsBalance;
    static ArrayList<String> client = new ArrayList<>();

    public Account(ArrayList<String> clName, ArrayList<String> clNums, ArrayList<String> clPin, ArrayList<String> clCash)
    {
        clientsName = clName;
        clientsCardNum = clNums;
        clientsCardPinCode = clPin;
        clientsBalance = clCash;

    }

    public static void signIn() throws IOException, InterruptedException {
        boolean end = false;
        Thread.sleep(1000);
        System.out.println("INPUT CARD NUMBER");
        System.out.print("[****] -> ");
        String userInputCardNum = sc.nextLine();
        Thread.sleep(1000);
        System.out.println("\nINPUT PIN CODE: ");
        System.out.print("[****] -> ");
        String userInputPinCode = sc.nextLine();

        for(int i = 0; i < 10; i++)
        {
            if (Objects.equals(clientsCardNum.get(i), userInputCardNum) && Objects.equals(clientsCardPinCode.get(i), userInputPinCode))
            {
                client.add(clientsName.get(i));
                client.add(clientsCardNum.get(i));
                client.add(clientsCardPinCode.get(i));
                client.add(clientsBalance.get(i));
                client.add(Integer.toString(i));
                end = true;
                Menu.mainMenu();
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
            System.out.println("\nINVALID CARD NUMBER OR PIN CODE\n");
            tries++;
            signIn();
        }
    }
}