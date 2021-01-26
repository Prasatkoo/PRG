package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

        bw.write("Hello World");
        bw.newLine();
        bw.write("Hello World");
        bw.newLine();
        bw.write("Hello World");
        bw.newLine();

        bw.close();
    }

    public static void main2(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        for (int i = 0; i < 100 ; i++) {
            bw.write("Hello World");
            bw.newLine();
        }
        bw.close();
    }
}
