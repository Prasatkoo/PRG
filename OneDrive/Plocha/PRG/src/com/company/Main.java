package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TO DO APP");
        System.out.println("--------------");
        System.out.println("You can add up to 10tasks!");
        System.out.println("You have 0/10");
        System.out.println("--------------");
        System.out.println("1) Manege tasks");
        System.out.println("2) Exit");
        int option1 = sc.nextInt();

        if (2 == option1) {
            return;
        }
        if (1 == option1) {
            String[] pole = new String[10];
            System.out.println("----------" +
                    "Tasks management" +
                    "----------");

            System.out.println("1) Create a new task");
            System.out.println("2) Update a task");
            System.out.println("3) Destroy a task");
            System.out.println("4) Back to main menu");
            for (int i = 0; i <= 4; i++) {
                int input = sc.nextInt();

            }

        }
    }
}

