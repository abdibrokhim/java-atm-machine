package com.abdibrokhim;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Objects;

import static com.abdibrokhim.Main.sc;

class Account {

    private static ArrayList<String> clientsName;
    private static ArrayList<String> clientsCardNum;
    private static ArrayList<String> clientsCardPinCode;
    private static ArrayList<String> clientsBalance;

    static ArrayList<String> client = new ArrayList<>();

    public Account(ArrayList<String> clName, ArrayList<String> clNums, ArrayList<String> clPin, ArrayList<String> clCash) {
        clientsName = clName;
        clientsCardNum = clNums;
        clientsCardPinCode = clPin;
        clientsBalance = clCash;

    }

//    public static void setClientsName(ArrayList<String> clNames) {
//        clientsName = clNames;
//    }
//
//    public static ArrayList<String> getClientsName() {
//        return clientsName;
//    }
//
//    public static void setClientsCardNum(ArrayList<String> clientsCardNum) {
//        Account.clientsCardNum = clientsCardNum;
//    }
//
//    public ArrayList<String> getClientsCardNum() {
//        return clientsCardNum;
//    }
//
//    public static void setClientsCardPinCode(ArrayList<String> clientsCardPinCode) {
//        Account.clientsCardPinCode = clientsCardPinCode;
//    }
//
//    public ArrayList<String> getClientsCardPinCode() {
//        return clientsCardPinCode;
//    }
//
//    public static void setClientsBalance(ArrayList<String> clientsBalance) {
//        Account.clientsBalance = clientsBalance;
//    }
//
//    public static ArrayList<String> getClientsBalance() {
//        return clientsBalance;
//    }

    public static void signIn() throws IOException {
        boolean end = false;

        System.out.print("\nInput Name: ");
        String userInputName = sc.nextLine();
        System.out.print("\nInput Card: ");
        String userInputCardNum = sc.nextLine();
        for(int i = 0; i < 10; i++){
            if (Objects.equals(clientsName.get(i), userInputName) && Objects.equals(clientsCardNum.get(i), userInputCardNum)) {
                client.add(clientsName.get(i));
                client.add(clientsCardNum.get(i));
                client.add(clientsCardPinCode.get(i));
                client.add(clientsBalance.get(i));
                client.add(Integer.toString(i));
                Menu.mainMenu();
                end = true;
                break;
            }
        }
        if (!end)
        {
            System.out.println("Invalid");
            signIn();
        }
    }
}