package com.abdibrokhim;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GFG {
    static ArrayList<String> clNames = new ArrayList<>() {};
    static ArrayList<String> clPins = new ArrayList<>() {};
    static ArrayList<String> clNums = new ArrayList<>() {};
    static ArrayList<String> clCash = new ArrayList<>() {};
    static ArrayList<String> clPhone = new ArrayList<>() {};
    static String pathfortxt = System.getProperty("user.dir");

    public static void readFileNames() throws FileNotFoundException {
        File file = new File(pathfortxt + "/names.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clNames.add(data);
        }
        sc.close();
    }

    public static void readFileCardNums() throws FileNotFoundException {
        File file = new File(pathfortxt + "/cardnums.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clNums.add(data);
        }
        sc.close();
    }

    public static void readFilePinCodes() throws FileNotFoundException {
        File file = new File(pathfortxt + "/pincode.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clPins.add(data);
        }
        sc.close();
    }

    public static void readFileBalance() throws FileNotFoundException {
        File file = new File(pathfortxt + "/balance.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clCash.add(data);
        }
        sc.close();
    }

    public static void readFilPhoneNums() throws FileNotFoundException {
        File file = new File(pathfortxt + "/phonenums.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clPhone.add(data);
        }
        sc.close();
    }

    public static void writeFileBalance(ArrayList<String> clCash) throws IOException {
        FileWriter wr = new FileWriter(pathfortxt + "/balance.txt");
        for (String cash : clCash) {
            wr.write(String.valueOf(cash));
            wr.write("\n");
        }
        wr.close();
        Handle.success();
    }

    public static void writeFilePin(ArrayList<String> clPins) throws IOException {
        FileWriter wr = new FileWriter(pathfortxt + "/pincode.txt");
        for (String pin : clPins) {
            wr.write(String.valueOf(pin));
            wr.write("\n");
        }
        wr.close();
        Handle.success();
    }

    public static void writeFilePhone(ArrayList<String> clPhone) throws IOException {
        FileWriter wr = new FileWriter(pathfortxt + "/phonenums.txt");
        for (String phNum : clPhone) {
            wr.write(String.valueOf(phNum));
            wr.write("\n");
        }
        wr.close();
        Handle.success();
    }

    public static void sentValue()
    {
        Account account = new Account(clNames, clNums, clPins, clCash);
    }

}
