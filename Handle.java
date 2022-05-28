package com.abdibrokhim;

public class Handle {
    public static void exit() throws InterruptedException {
        Thread.sleep(1000);
        System.exit(0);
    }

    public static void error() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nERROR\n");
        Thread.sleep(1000);
    }

    public static void success() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nSUCCESS\n");
        Thread.sleep(1000);
    }

}
