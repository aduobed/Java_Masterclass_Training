package com.company.Encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        //Reduce number of lives remaining for the player
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
