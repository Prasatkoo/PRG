package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> array = new ArrayList<>();
            ArrayList<Object> num = new ArrayList<>();
            ArrayList<String> arr = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));
            String content = "";
            String countting = "";
            String counting4 = "";
            String nextline = br.readLine();
            int count = 0;
            int ahojky = 0;
            //První úkol
            while (nextline != null) {
                content = nextline;
                array.add(content);
                nextline = br.readLine();
                count++;
            }

            br.close();
            br = new BufferedReader(new FileReader("functions.txt"));
            nextline = br.readLine();

            //Druhý úkol
            while (nextline != null) {
                String str = nextline;
                int indeX = str.indexOf("x");
                String[] raw = nextline.split(" ");
                Object objekt = new Object();
                objekt.number = Integer.parseInt(str.substring(indeX - 1, indeX));
                objekt.second = Integer.parseInt(raw[4]);
                num.add(objekt);
                nextline = br.readLine();
            }

            for (int i = 0; i < num.size(); i++) {
                System.out.println(num.get(i).number + " " + num.get(i).second);
            }


            //Třetí úkol
            BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
            countting = countting + count;
            bw.write(countting);
            bw.close();


            //Čtvrtý úkol
            BufferedWriter bv = new BufferedWriter(new FileWriter("count_distinct.txt"));
            for(int i = 0; i < array.size(); i++) {
                String element = array.get(i);
                if((!element.equals("d")) && (!arr.contains(element))) {
                    arr.add(element);
                }
            }

            for (int i = 0; i < arr.size(); i++) {
                ahojky++;
            }
            counting4 = counting4 + ahojky;
            bv.write(counting4);
            bv.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
