package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> pole = new ArrayList<>();
        ArrayList<Integer> pole2 = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 100 ; i++) {
            int a = ran.nextInt(100);
            pole.add(a);
        }
        for (int i = 0; i < 50 ; i++) {
            int a = ran.nextInt(100);
            pole2.add(a);
        }
        if (pole == pole2){
            System.out.println("Pole se Shodují");
        }
        else {
            System.out.println("Pole se neshodují");
        }

        for (int i = 99; i > 49; i--) {
            pole.remove(i);
        }
        for (int i = 0; i < 50; i++) {
            if (pole.get(i)!= pole2.get(i)){
                pole2.set(i, pole.get(i));
            }
        }
        System.out.println(pole + " " + pole2);
    }
}
