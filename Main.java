package com.abdibrokhim;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        introduction();

        GFG.readFileNames();
        GFG.readFilePinCodes();
        GFG.readFileCardNums();
        GFG.readFileBalance();
//        GFG.writeFile();
//        Database.database();
        GFG.sentValue();
        Account.signIn();

    }

    public static void introduction() {
        System.out.println("WELCOME");
        System.out.println();
    }
}