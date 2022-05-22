package com.abdibrokhim;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class Main
{
    public static void main(String[] args) {

        //===== Demo =====//
        System.out.println("Session Started");
        System.out.print("\n");

        //===== Creating Dictionary =====//
        Dictionary client00 = new Hashtable();
        Dictionary client01 = new Hashtable();
        Dictionary client02 = new Hashtable();
        Dictionary client03 = new Hashtable();


        //===== Putting Values into Dictionary =====//
        client00.put("cardHolName", "John");
        client00.put("cardNum", "8600860086008600");
        client00.put("cardPinCode", "0000");
        client00.put("balance", 100000);


        client01.put("cardHolName", "Kodak");
        client01.put("cardNum", "8600860086008601");
        client01.put("cardPinCode", "0001");
        client01.put("balance", 100000);

        client02.put("cardHolName", "Travis");
        client02.put("cardNum", "8600860086008602");
        client02.put("cardPinCode", "0002");
        client02.put("balance", 100000);


        client03.put("cardHolName", "Future");
        client03.put("cardNum", "8600860086008603");
        client03.put("cardPinCode", "0003");
        client03.put("balance", 100000);


        //===== Example: Simple Update Dictionary Values =====//
        // client01.put("cardHolName", "Khalifa");
        // client03.put("cardPinCode", "0004");


        //===== Creating Array List =====//
        ArrayList clientsName = new ArrayList();
        ArrayList clientsCardNum = new ArrayList();
        ArrayList clientsCardPinCode = new ArrayList();
        ArrayList clientsBalance = new ArrayList();


        //===== Putting Values into Array List =====//
        clientsName.add(client00.get("cardHolName"));
        clientsCardNum.add(client00.get("cardNum"));
        clientsCardPinCode.add(client00.get("cardPinCode"));
        clientsBalance.add(client00.get("balance"));

        clientsName.add(client01.get("cardHolName"));
        clientsCardNum.add(client01.get("cardNum"));
        clientsCardPinCode.add(client01.get("cardPinCode"));
        clientsBalance.add(client01.get("balance"));

        clientsName.add(client02.get("cardHolName"));
        clientsCardNum.add(client02.get("cardNum"));
        clientsCardPinCode.add(client02.get("cardPinCode"));
        clientsBalance.add(client02.get("balance"));

        clientsName.add(client03.get("cardHolName"));
        clientsCardNum.add(client03.get("cardNum"));
        clientsCardPinCode.add(client03.get("cardPinCode"));
        clientsBalance.add(client03.get("balance"));


        String userInputName = "Travis";
        String userInputCardNum = "8600860086008602";
//        int userBalance = 200000;

//        Object result = "";

//        String clientsName = "Travis";
//        String clientsCardNum = "8600860086008602";

        Database db = new Database(clientsName, clientsCardNum);
//        Account account = new Account(clientsName, clientsCardNum, clientsCardPinCode, clientsBalance);
//        Account account = new Account(userInputName, userInputCardNum);

        introduction();
//        account.signIn(userInputCardNum, userInputName);
//        account.signIn();
//        account.signIn();
        db.go();
    }
    public static void introduction() {
        System.out.println("WELCOME");
    }
}