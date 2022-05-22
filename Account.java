package com.abdibrokhim;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Account {
    private ArrayList userInputCardNum;
    private ArrayList userInputName;
    Scanner sc = new Scanner(System.in);
    
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    private ArrayList clientsName = new ArrayList() {};
    private ArrayList clientsCardNum = new ArrayList() {};
    private ArrayList clientsCardPinCode = new ArrayList() {};

    private ArrayList clientsBalance = new ArrayList() {};

    Account(){}

//    public Account(ArrayList clientsName, ArrayList clientsCardNum, ArrayList clientsCardPinCode) {
//        this.clientsName = clientsName;
//        this.clientsCardNum = clientsCardNum;
//        this.clientsCardPinCode = clientsCardPinCode;
////        this.clientsBalance = clientsBalance;
//    }

//    public Account(String userInputName, String userInputCardNum) {
//        this.userInputName = clientsName;
//        this.userInputCardNum = clientsCardNum;
//}
    static Object result = null;

    Menu menu = new Menu();
    public void signIn(ArrayList clientsName, ArrayList clientsCardNum) {
//        for (int i = 0; i < clientsName.size(); i++)
        int i=0;
        boolean end = false;
        while(!end) {
            try {
                System.out.print("\nInput Name: ");
                String userInputName = sc.nextLine();
                System.out.print("\nInput Card: ");
                String userInputCardNum = sc.nextLine();
                while(i < 3) {
                    if (clientsName.get(i) == userInputName && clientsCardNum.get(i) == userInputCardNum) {
//                    if (clientsName.contains(userInputName) && clientsCardNum.contains(userInputCardNum)) {
                        result = clientsCardPinCode.get(i);
                        menu.mainMenu(result);
                        end = true;
                        break;
                    }
                    i++;
                }
                if (!end) {
                    System.out.println("Error");
//                    end = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error Error");
            }
//        System.out.println("Fail");
        }
    }
}

//    public ArrayList getClientsName() {
//        return clientsName;
//    }
//
//    public void setClientsName(ArrayList clientsName) {
//        this.clientsName = clientsName;
//    }
//
//    public ArrayList getClientsCardNum() {
//        return clientsCardNum;
//    }
//
//    public void setClientsCardNum(ArrayList clientsCardNum) {
//        this.clientsCardNum = clientsCardNum;
//    }
//
//    public ArrayList getClientsCardPinCode() {
//        return clientsCardPinCode;
//    }
//
//    public void setClientsCardPinCode(ArrayList clientsCardPinCode) {
//        this.clientsCardPinCode = clientsCardPinCode;
//    }