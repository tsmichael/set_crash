package com.softset;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        HashMap<String,String> myHashMap=new HashMap<String, String>();
        InputStreamReader streamreader=new InputStreamReader(System.in);
        BufferedReader keyboard= new BufferedReader(streamreader);
        String id;
        String name;

        System.out.println("Input number of pairs ");
        int quantity=Integer.parseInt(keyboard.readLine());
        for(int i=0;i<quantity;i++){
            System.out.println("Input ID : ");
            id=keyboard.readLine();
            System.out.println("Input name : ");
            name=keyboard.readLine();
            myHashMap.put(id,name);
        }
        for(Map.Entry<String, String> entry: myHashMap.entrySet())
            System.out.println(entry.getKey() + " - " + entry.getValue());

        System.out.println("Dear User(Nazar) please find person name by ID ");
        id=keyboard.readLine();
        if(myHashMap.containsKey(id)) {
            System.out.println("The value for " + id + "  is " + myHashMap.get(id));
        }else {
            System.out.println("You can`t find this ID !");
        }
	}
}
