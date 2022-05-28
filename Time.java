package com.abdibrokhim;

public class Time {
    public static void time() throws InterruptedException {
        for(int i=0; i<3; i++){
            Thread.sleep(600);
            System.out.print(".");
        }
    }
}
