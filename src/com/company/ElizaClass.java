package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ElizaClass {
    private String response;
    ArrayList<String> userHistory = new ArrayList();
    ArrayList<String> elisaHistory = new ArrayList();

    public ElizaClass() {
        System.out.print(greeting()+" What is your problem? Enter your response here or Q to quit: ");
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
        String stringReturn = "";

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
               stringReturn += arr+" ";
        }
        return stringReturn.trim();

    }
    public String greeting(){
        Random random = new Random();
        int x = random.nextInt(3);
        String[] strings = {
                "Good Morning!",
                "Good Afternoon!",
                "Good Evening!" };
        return strings[x];
    }

    public String hedges(){
        Random random = new Random();
        int x = random.nextInt(3);
        String[] strings = {
                "Please tell me more",
                "Many of my patients tell me the same thing",
                "It is getting late, maybe we had better quit" };
        return strings[x];
    }
    public String qualifier(){
        Random random = new Random();
        int x = random.nextInt(3);
        String[] strings = {
                "Why do you say that? ",
                "You seem to think that, ",
                "So, you are concerned that? " };
        return strings[x];
    }
    public String rendomResponse(String string){
        Random random = new Random();
        int x = random.nextInt(2);
        userHistory.add(string);
        String[] resA ={
                qualifier() + change(string),
                hedges()
        };
        String resp = resA[x];
        elisaHistory.add(resp);
        return resp;
    }

    public void history(){
     for(int i=0; i<userHistory.size(); i++){
         System.out.println("USER: "+userHistory.get(i));
         System.out.println("--> ELISA: "+elisaHistory.get(i));
     }
    }
}
