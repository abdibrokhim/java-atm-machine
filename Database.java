package com.abdibrokhim;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

public class Database {


    private final ArrayList clientsName;
    private final ArrayList clientsCardNum;

    public Database(ArrayList clientsName, ArrayList clientsCardNum) {

        this.clientsName = clientsName;
        this.clientsCardNum = clientsCardNum;
    }

//    public static void main(String[] args) {
//
//        //===== Demo =====//
//        System.out.println("Session Started");
//        System.out.print("\n");
//
//        //===== Creating Dictionary =====//
//        Dictionary client00 = new Hashtable();
//        Dictionary client01 = new Hashtable();
//        Dictionary client02 = new Hashtable();
//        Dictionary client03 = new Hashtable();
//
//
//        //===== Putting Values into Dictionary =====//
//        client00.put("cardHolName", "John");
//        client00.put("cardNum", "8600860086008600");
//        client00.put("cardPinCode", "0000");
//
//
//        client01.put("cardHolName", "Kodack");
//        client01.put("cardNum", "8600860086008601");
//        client01.put("cardPinCode", "0001");
//
//
//        client02.put("cardHolName", "Travis");
//        client02.put("cardNum", "8600860086008602");
//        client02.put("cardPinCode", "0002");
//
//
//        client03.put("cardHolName", "Future");
//        client03.put("cardNum", "8600860086008603");
//        client03.put("cardPinCode", "0003");
//
//
//        //===== Example: Simple Update Dictionary Values =====//
//        // client01.put("cardHolName", "Khalifa");
//        // client03.put("cardPinCode", "0004");
//
//
//        //===== Creating Array List =====//
//        ArrayList clientsName = new ArrayList();
//        ArrayList clientsCardNum = new ArrayList();
//        ArrayList clientsCardPinCode = new ArrayList();
//
//
//        //===== Putting Values into Array List =====//
//        clientsName.add(client00.get("cardHolName"));
//        clientsCardNum.add(client00.get("cardNum"));
//        clientsCardPinCode.add(client00.get("cardPinCode"));
//
//        clientsName.add(client01.get("cardHolName"));
//        clientsCardNum.add(client01.get("cardNum"));
//        clientsCardPinCode.add(client01.get("cardPinCode"));
//
//        clientsName.add(client02.get("cardHolName"));
//        clientsCardNum.add(client02.get("cardNum"));
//        clientsCardPinCode.add(client02.get("cardPinCode"));
//
//        clientsName.add(client03.get("cardHolName"));
//        clientsCardNum.add(client03.get("cardNum"));
//        clientsCardPinCode.add(client03.get("cardPinCode"));
//
//        //===== Printing All Values Array List Format =====//
//        System.out.println("Name List: " + clientsName);
//        System.out.println("Card Num List: " + clientsCardNum);
//        System.out.println("Card Pin List: " + clientsCardPinCode);
//
//        System.out.print("\n");
//
//
//
//
//    }
//    public Database(String clientsName, String clientsCardNum){
//        this.clientsName = clientsName;
//        this.clientsCardNum = clientsCardNum;
//    }

    public void go() {
        Account account = new Account();

        account.signIn(clientsName, clientsCardNum);

    }


    //===== Printing All Values TABLE Format =====//
//    public void showAllAccount(ArrayList clientsName, ArrayList clientsCardNum, ArrayList clientsCardPinCode) {
//        for (int i = 0; i < clientsName.size(); i++) {
//            System.out.println(clientsName.get(i) + "\t" + clientsCardNum.get(i) + "\t" + clientsCardPinCode.get(i));
//        }
//    }
}
