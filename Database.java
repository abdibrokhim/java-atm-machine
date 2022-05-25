package com.abdibrokhim;

import java.util.ArrayList;

public class Database {

    public static void database() {
        ArrayList<String> clientsName = new ArrayList<>() {};
        ArrayList<String> clientsCardNum = new ArrayList<>() {};
        ArrayList<String> clientsCardPinCode = new ArrayList<>() {};
        ArrayList<String> clientsBalance = new ArrayList<>() {};

        clientsName.add("Kodak");
        clientsCardNum.add("8600860086008601");
        clientsCardPinCode.add("1111");
        clientsBalance.add("1000000");

        clientsName.add("Travis");
        clientsCardNum.add("8600860086008602");
        clientsCardPinCode.add("2222");
        clientsBalance.add("2000000");

        clientsName.add("Future");
        clientsCardNum.add("8600860086008603");
        clientsCardPinCode.add("3333");
        clientsBalance.add("1000000");

        clientsName.add("lil");
        clientsCardNum.add("8600860086008604");
        clientsCardPinCode.add("4444");
        clientsBalance.add("2000000");
        
        for (String client : clientsName) {
            System.out.println(client);
        }
        for (String clientCardNum : clientsCardNum) {
            System.out.println(clientCardNum);
        }
        for (String clientCardPinCode : clientsCardPinCode) {
            System.out.println(clientCardPinCode);
        }
        for (String clientBalance : clientsBalance) {
            System.out.println(clientBalance);
        }

        new Account(clientsName, clientsCardNum, clientsCardPinCode, clientsBalance);

        Account.setClientsName(clientsName);
        Account.setClientsCardNum(clientsCardNum);
        Account.setClientsCardPinCode(clientsCardPinCode);
        Account.setClientsBalance(clientsBalance);
    }
}
