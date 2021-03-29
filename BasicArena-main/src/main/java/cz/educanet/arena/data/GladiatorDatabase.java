package cz.educanet.arena.data;

import cz.educanet.arena.logic.Gladiator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Utils class that saves and loads gladiators.
 */
public class GladiatorDatabase {

    /**
     * @param filename path to the gladiator file.
     * @return loaded Gladiator
     */
    public static Gladiator loadGladiator(String filename) {
        // TODO:
        Gladiator gladiator = new Gladiator();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            gladiator.setName(br.readLine());
            gladiator.setHp(Integer.parseInt(br.readLine()));
            gladiator.setMinDMG(Integer.parseInt(br.readLine()));
            gladiator.setMaxDMG(Integer.parseInt(br.readLine()));
            br.close();



        } catch (Exception e) {
            e.printStackTrace();
        }

     return gladiator;
    }

    /**
     * Saves the gladiator.
     * @param filename path to save too.
     * @param gladiator Gladiator to save.
     */
    public static void saveGladiator(String filename, Gladiator gladiator) {

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write(gladiator.getName());
            bw.newLine();
            bw.write(gladiator.getHp() + "");
            bw.newLine();
            bw.write(gladiator.getMinDMG() + "");
            bw.newLine();
            bw.write(gladiator.getMaxDMG() + "");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
