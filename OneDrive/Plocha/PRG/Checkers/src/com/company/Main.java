package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fuj = 0;
        int[][] pole = {
                {1, 2, 1, 2, 1, 2, 1, 2},
                {2, 1, 2, 1, 2, 1, 2, 1},
                {1, 2, 1, 2, 1, 2, 1, 2},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {3, 1, 3, 1, 3, 1, 3, 1},
                {1, 3, 1, 3, 1, 3, 1, 3},
                {3, 1, 3, 1, 3, 1, 3, 1},
        };

        for (int[] board : pole) {
            for (int board2 : board) {

                if (board2 == 1) {
                    System.out.print("⬛");
                }
                if (board2 == 2) {
                    System.out.print("◉");
                }
                if (board2 == 3) {
                    System.out.print("⚫");
                }

            }
            System.out.println();
        }
        System.out.println("Checkers");
        System.out.println("--------");
        System.out.println("Black Start!");
        System.out.println("------------");
        System.out.println("Pro ukončení napiš: 420");
        System.out.println("------------");


        while (fuj == 0) {
            while (fuj == 0) {

                System.out.println("Černá Hraje:Vyber postavičku");
                int x1 = sc.nextInt();
                if (x1 == 420) {
                    System.exit(0);
                }

                int y1 = sc.nextInt();
                if (y1 == 420) {
                    System.exit(0);
                }

                if (pole[x1][y1] == 2) {
                    System.out.println("Černá Hraje:Zadej kam se chceš pohnout");
                    System.out.println("1) Doprava ");
                    System.out.println("2) Doleva ");
                    int input = sc.nextInt();
                    if (input == 1) {
                        if (pole[x1 + 1][y1 + 1] == 3 && pole[x1 + 2][y1 + 2] == 1) {
                            pole[x1][y1] = 1;
                            pole[x1 + 1][y1 + 1] = 1;
                            pole[x1 + 2][y1 + 2] = 2;
                        } else {
                            pole[x1][y1] = 1;
                            pole[x1 + 1][y1 + 1] = 2;
                        }

                    }

                    if (input == 2) {
                        if (pole[x1 + 1][y1 - 1] == 3 && pole[x1 + 2][y1 - 2] == 1) {
                            pole[x1][y1] = 1;
                            pole[x1 + 1][y1 - 1] = 1;
                            pole[x1 + 2][y1 - 2] = 2;
                        } else {
                            pole[x1][y1] = 1;
                            pole[x1 + 1][y1 - 1] = 2;
                        }

                    }


                    System.out.println();
                    for (int[] board : pole) {
                        for (int board2 : board) {

                            if (board2 == 1) {
                                System.out.print("⬛");
                            }
                            if (board2 == 2) {
                                System.out.print("◉");
                            }
                            if (board2 == 3) {
                                System.out.print("⚫");
                            }

                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Neplatný vstup");
                    break;
                }

                System.out.println("Bílá Hraje:Vyber postavičku");
                int x2 = sc.nextInt();
                if (x2 == 420) {
                    System.exit(0);
                }

                int y2 = sc.nextInt();
                if (y2 == 420) {
                    System.exit(0);
                }

                if (pole[x2][y2] == 3) {
                    System.out.println("Bílá Hraje:Zadej kam se chceš pohnout");
                    System.out.println("1) Doprava");
                    System.out.println("2) Doleva");
                    int input = sc.nextInt();
                    if (input == 1) {
                        if (pole[x2 - 1][y2 + 1] == 2 && pole[x2 - 2][y2 + 2] == 1) {
                            pole[x2][y2] = 1;
                            pole[x2 - 1][y2 + 1] = 1;
                            pole[x2 - 2][y2 + 2] = 3;
                        } else {
                            pole[x2 - 1][y2 + 1] = 3;
                            pole[x2][y2] = 1;
                        }
                    }
                    if (input == 2) {
                        if (pole[x2 - 1][y2 + 1] == 2 && pole[x2 - 2][y2 - 2] == 1) {
                            pole[x2][y2] = 1;
                            pole[x2 - 1][y2 - 1] = 1;
                            pole[x2 - 2][y2 - 2] = 3;

                        } else {
                            pole[x2 - 1][y2 - 1] = 3;
                            pole[x2][y2] = 1;
                        }
                    }


                    System.out.println();

                    for (int[] board : pole) {
                        for (int board2 : board) {

                            if (board2 == 1) {
                                System.out.print("⬛");
                            }
                            if (board2 == 2) {
                                System.out.print("◉");
                            }
                            if (board2 == 3) {
                                System.out.print("⚫");
                            }

                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Neplatný vstup");
                    break;
                }

            }
        }
    }
}



