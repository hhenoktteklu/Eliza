package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ElizaClass {
    private String response;

    public ElizaClass() {
        System.out.print("Good day. What is your problem? Enter your response here or Q to quit: ");
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

    public String change(String string) {
        String[] strArray = string.split(" ");
        HashMap<String, String> map = new HashMap<>();
        ArrayList<String> list = new ArrayList();

        map.put("i", "you");
        map.put("me", "you");
        map.put("my", "your");
        map.put("am", "are");

            for (String str : strArray) {
                if(map.containsKey(str))
                    list.add(map.get(str));
                else
                    list.add(str);
                }

        for (String arr: list) {
          System.out.print(arr +" ");
        }
        return "";

    }
}
