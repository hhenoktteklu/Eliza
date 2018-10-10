package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ElizaClass eliza = new ElizaClass();
        eliza.change("i Henok Abezer am you me my");
    }
        // write your code here
        /*Scanner input = new Scanner(System.in);
        boolean quit = true;

        ElizaClass eliza = new ElizaClass();


        do {
            String in = input.nextLine();
            if (in.equalsIgnoreCase("q")) {
                System.out.println(eliza.end());
                break;
            } else {
                eliza.setRespond(in);
                System.out.print(eliza.getRespond());
            }
        } while (quit);
    }*/
}
