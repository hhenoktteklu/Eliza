package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ElizaClass {
    private String response;

    public ElizaClass() {
        System.out.print("Good day. What is your problem? Enter your response here or Q to quit: \n");
    }

    public void setRespond(String respond) {
        this.response = respond;
    }

    public String getRespond() {
        return response + "\nEnter your response here or Q to quit: ";
    }

    public String end() {
        return "////THANKS BYE////";
    }

    public String change(String str) {
        String[] strArray = str.split(" ");
        ArrayList<String> comp = new ArrayList<>();
        boolean check = true;
        HashMap<String, String> map = new HashMap<>();

        map.put("i", "you");
        map.put("me", "you");
        map.put("my", "your");
        map.put("am", "are");





        for (int i=0;i<strArray.length;i++) {

              //  System.out.println("the spitted words :" + strArray[i]);

                do {
                     for (Map.Entry<String, String> entry :map.entrySet()) {

                         if (strArray[i].equalsIgnoreCase(entry.getKey())) {
                             comp.add(entry.getValue());
                             check = false;

                         }
                     }


                    comp.add( strArray[i]);
                } while (check);



            }

        System.out.println("the size "+comp.size());

        return "";

    }
}
