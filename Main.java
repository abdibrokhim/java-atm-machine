package com.abdibrokhim;

import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        introduction();
        Database.database();
        Account.signIn();

    }

    public static void introduction() {
        System.out.println("WELCOME");
        System.out.println();
    }
}