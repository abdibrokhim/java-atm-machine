package com.abdibrokhim;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {
        intro();

        GFG.readFileNames();
        GFG.readFilePinCodes();
        GFG.readFileCardNums();
        GFG.readFileBalance();
        GFG.readFilPhoneNums();
        GFG.sentValue();

        Account.signIn();
    }

    public static void intro()
    {
        System.out.println("\nWELCOME\n");
    }
}