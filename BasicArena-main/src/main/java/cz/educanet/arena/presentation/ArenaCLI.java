package cz.educanet.arena.presentation;

import cz.educanet.arena.data.GladiatorDatabase;
import cz.educanet.arena.logic.Arena;
import cz.educanet.arena.logic.Gladiator;

import java.util.Scanner;

public class ArenaCLI {

    private Arena logic;
    private Scanner sc;

    /**
     * Initialize all variables that are needed.
     */
    public void init() {
        logic = new Arena();
        sc = new Scanner(System.in);
    }


    public void renderLandingPage() {
        System.out.println("     /\\                         \n" +
                "    /  \\   _ __ ___ _ __   __ _ \n" +
                "   / /\\ \\ | '__/ _ \\ '_ \\ / _` |\n" +
                "  / ____ \\| | |  __/ | | | (_| |\n" +
                " /_/    \\_\\_|  \\___|_| |_|\\__,_|");
        System.out.println("---------------------------------");
    }

    public void renderGladiatorPicker() {
        Gladiator valecnik1 = new Gladiator();
        Gladiator valecnik2 = new Gladiator();
        System.out.println("Zvol si jméno pro prvního Gladiátora:");
        valecnik1.setName(sc.nextLine());
        System.out.println("---------------------------------------");
        System.out.println("Zvol si jméno pro druhého Gladiátora:");
        valecnik2.setName(sc.nextLine());
        System.out.println("-----------------------------------------");
        System.out.println("Zvol si maximální životy pro tvého prního Gladiátora:");
        valecnik1.setHp(Integer.parseInt(sc.nextLine()));
        System.out.println("-----------------------------------------");
        System.out.println("Zvol si maximální životy pro tvého druhého Gladiátora:");
        valecnik2.setHp(Integer.parseInt(sc.nextLine()));
        System.out.println("-----------------------------------------");
        System.out.println("Zvol si minimální a poté maximální damage pro prvního Gladiátora:");
        valecnik1.setMinDMG(Integer.parseInt(sc.nextLine()));
        valecnik1.setMaxDMG(Integer.parseInt(sc.nextLine()));
        System.out.println("------------------------------------------");
        System.out.println("Zvol si minimální a poté maximální damage pro druhého Gladiátora:");
        valecnik2.setMinDMG(Integer.parseInt(sc.nextLine()));
        valecnik2.setMaxDMG(Integer.parseInt(sc.nextLine()));

        GladiatorDatabase.saveGladiator(valecnik1.getName() + ".txt", valecnik1);
        GladiatorDatabase.saveGladiator(valecnik2.getName() + ".txt", valecnik2);

        System.out.println("Pick your fighter #1 (enter the path of the saved file):");
        String gladiator1File = sc.nextLine();
        System.out.println("Pick your fighter #2 (enter the path of the saved file):");
        String gladiator2File = sc.nextLine();

        Gladiator gladiator1 = GladiatorDatabase.loadGladiator(gladiator1File);
        Gladiator gladiator2 = GladiatorDatabase.loadGladiator(gladiator2File);
        logic.setGladiator1(gladiator1);
        logic.setGladiator2(gladiator2);
    }

    /**
     * Fight until one gladiator dies, or surrenders.
     */
    public void renderEntireFight() {
        Gladiator gladiator1 = logic.getGladiator1();
        Gladiator gladiator2 = logic.getGladiator2();
        int kolo = 0;
        System.out.println("Match Starts!");
        while (logic.getWinner() == null) {
            kolo++;
            logic.fight();
            System.out.println("------- " + kolo + " round " +" -------");
            if (gladiator1.isDead()){
                gladiator1.setHp(0);
                System.out.println(gladiator1.getName() + " is left with " + gladiator1.getHp() + " HP ");
                System.out.println("----------------------");
            }
            if (gladiator1.isDead()){
                System.out.println(gladiator1.getName() + " Died");
                System.out.println("----------------------------");
                System.out.println("Winner of this match is " + gladiator2.getName() + " !");
                break;
            }
            else {
                System.out.println(gladiator1.getName() + " is attacking " + gladiator2.getName());
                System.out.println(gladiator1.getName() + " deals damage to " + gladiator2.getName());
                System.out.println("----------------------");
            }
            if (gladiator2.isDead()){
                gladiator2.setHp(0);
                System.out.println(gladiator2.getName() + " is left with " + gladiator2.getHp() + " HP ");
                System.out.println("----------------------");
            }
            if (gladiator2.isDead()){
                System.out.println(gladiator2.getName() + " Died");
                System.out.println("---------------");
                System.out.println("Winner of this match is " + gladiator1.getName() + " !");
                break;
            }
            else {
                System.out.println(gladiator2.getName() + "  fights back " + gladiator1.getName());
                System.out.println(gladiator1.getName() + " is left with " + gladiator1.getHp() + " HP ");
                System.out.println(gladiator2.getName() + " is left with " + gladiator2.getHp() + " HP");
            }



        }

    }

}
