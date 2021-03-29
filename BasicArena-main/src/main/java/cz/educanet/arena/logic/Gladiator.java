package cz.educanet.arena.logic;

import java.util.Random;

public class Gladiator {
    /**
     * Name of the gladiator
     */
    private String name;
    private int hp;
    private int minDMG;
    private int maxDMG;
    // TODO: Add the rest of the properties
    // TODO: Generate/create getters and setters for these properties


    public boolean isDead() {
        return this.hp <= 0;
    }

    public void dealDamage(Gladiator enemy) {
        // TODO:
        Random random = new Random();
        int damage = random.nextInt(maxDMG-minDMG) + minDMG;
        int FinHealth = enemy.getHp() - damage;
        enemy.setHp(FinHealth);

    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxDMG() {
        return maxDMG;
    }

    public void setMaxDMG(int maxDMG) {
        this.maxDMG = maxDMG;
    }

    public int getMinDMG() {
        return minDMG;
    }

    public void setMinDMG(int minDMG) {
        this.minDMG = minDMG;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
