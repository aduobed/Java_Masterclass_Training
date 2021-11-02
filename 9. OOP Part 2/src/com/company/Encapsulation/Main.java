package com.company.Encapsulation;

public class Main {

    public static void main(String[] args) {
        //Bad Code or bad Encapsulation example
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "gun";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        //Better Encapsulation Example
        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "sword");
        System.out.println("Initial Health is " + player.getHealth());
    }
}
