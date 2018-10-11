package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean quit = true;

        ElizaClass eliza = new ElizaClass();

        do {
            String in = input.nextLine();
            if (in.equalsIgnoreCase("q")||in.equalsIgnoreCase("I am feeling great")) {
                System.out.println(eliza.end());
                break;
            }
                else if(in.equalsIgnoreCase("history")) {
                eliza.history();
                break;
            }
                {
                System.out.println(eliza.rendomResponse(in)+"?"+"\nEnter your response here or Q to quit: ");
            }
        } while (quit);
    }
}

