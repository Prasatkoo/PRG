package com.company;

import java.io.*;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            int count = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Vítej v Globálním chatu!");
            System.out.println("-------------------------");
            System.out.println("Zde si můžeš psát s kým chceš!");
            System.out.println("-------------------------");
            System.out.println("Zadej  své jméno:");
            String nickname = sc.nextLine();
            try {
                BufferedReader br = new BufferedReader(new FileReader("data.txt"));
                BufferedReader pocet = new BufferedReader(new FileReader("pocet.txt"));
                String kontent = "";
                String pocetmsg = pocet.readLine();
                if (pocetmsg != null) {
                    System.out.println("V Chatu máš " + pocetmsg + "  nepřečtené zprávy:");
                    System.out.println("--------------------------");
                    String nextline = br.readLine();
                    while (nextline != null) {
                        System.out.println(nextline);
                        kontent += nextline;
                        nextline = br.readLine();
                    }
                    System.out.println("---------------------");
                } else if (!pocetmsg.equals("0")) {
                    System.out.println("V Chatu máš " + pocetmsg + "  nepřečtené zprávy:");
                    System.out.println("--------------------------");
                    String nextline = br.readLine();
                    while (nextline != null) {
                        System.out.println(nextline);
                        kontent += nextline;
                        nextline = br.readLine();
                    }
                    System.out.println("---------------------");
                } else {
                    System.out.println("Předešlé Zprávy: 0");
                }
                BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
                BufferedWriter bwpocet = new BufferedWriter(new FileWriter("pocet.txt"));
                System.out.println("Pro ukončení psaní napiš `!konec`");
                while (true){
                    String message = sc.nextLine();
                    if (message.equals("!konec")) {
                        String conversion = Integer.toString(count);
                        bwpocet.write(conversion);
                        bw.close();
                        bwpocet.close();
                        System.exit(0);
                    }
                    count++;
                    bw.write(nickname + "; " + message);
                    System.out.println(nickname + ": " + message);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



