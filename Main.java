package com.abdibrokhim;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {
        intro();

        GFG.readFileNames();
        GFG.readFilePinCodes();
        GFG.readFileCardNums();
        GFG.readFileBalance();
        GFG.readFilPhoneNums();
        GFG.sentValue();

        Account.signIn();
    }

    public static void intro() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("\nWELCOME\n");
    }
}