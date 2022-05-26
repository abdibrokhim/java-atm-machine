package com.abdibrokhim;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//import static com.abdibrokhim.Main.sc;

public class GFG {
    static ArrayList<String> clNames = new ArrayList<>() {};
    static ArrayList<String> clPins = new ArrayList<>() {};
    static ArrayList<String> clNums = new ArrayList<>() {};
    static ArrayList<String> clCash = new ArrayList<>() {};
    static ArrayList<String> clPhone = new ArrayList<>() {};
    public static void readFileNames() throws FileNotFoundException {
        File file = new File("/Users/abdibrokhim/IdeaProjects/App/src/com/abdibrokhim/names.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clNames.add(data);
//            System.out.println(clNames);
        }
        sc.close();
        System.out.println("\n");
        System.out.println(clNames);
    }

    public static void readFileCardNums() throws FileNotFoundException {
        File file = new File("/Users/abdibrokhim/IdeaProjects/App/src/com/abdibrokhim/cardnums.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clNums.add(data);
//            System.out.println(clNames);
        }
        sc.close();
        System.out.println("\n");
        System.out.println(clNums);
    }

    public static void readFilePinCodes() throws FileNotFoundException {
        File file = new File("/Users/abdibrokhim/IdeaProjects/App/src/com/abdibrokhim/pincode.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clPins.add(data);
//            System.out.println(clNames);
        }
        sc.close();
        System.out.println("\n");
        System.out.println(clPins);
    }

    public static void readFileBalance() throws FileNotFoundException {
        File file = new File("/Users/abdibrokhim/IdeaProjects/App/src/com/abdibrokhim/balance.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clCash.add(data);
//            System.out.println(clNames);
        }
        sc.close();
        System.out.println("\n");
        System.out.println(clCash);
    }

    public static void readFilPhoneNums() throws FileNotFoundException {
        File file = new File("/Users/abdibrokhim/IdeaProjects/App/src/com/abdibrokhim/phonenums.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            clPhone.add(data);
//            System.out.println(clPhone);
        }
        sc.close();
        System.out.println("\n");
        System.out.println(clPhone);
    }


    public static void writeFileBalance(ArrayList<String> clCash) throws IOException {
        FileWriter wr = new FileWriter("/Users/abdibrokhim/IdeaProjects/App/src/com/abdibrokhim/balance.txt");
        for (String cash : clCash) {
            wr.write(String.valueOf(cash));
            wr.write("\n");
        }
        wr.close();
        System.out.println("\nSuccessfully wrote to the file");
    }
    public static void writeFilePin(ArrayList<String> clPins) throws IOException {
        FileWriter wr = new FileWriter("/Users/abdibrokhim/IdeaProjects/App/src/com/abdibrokhim/pincode.txt");
        for (String pin : clPins) {
            wr.write(String.valueOf(pin));
            wr.write("\n");
        }
        wr.close();
        System.out.println("\nSuccessfully wrote to the file");
    }
    public static void writeFilePhone(ArrayList<String> clPhone) throws IOException {
        FileWriter wr = new FileWriter("/Users/abdibrokhim/IdeaProjects/App/src/com/abdibrokhim/phonenums.txt");
        for (String phNum : clPhone) {
            wr.write(String.valueOf(phNum));
            wr.write("\n");
        }
        wr.close();
        System.out.println("\nSuccessfully wrote to the file");
    }
    public static void sentValue()
    {
        Account account = new Account(clNames, clNums, clPins, clCash);
    }

}
