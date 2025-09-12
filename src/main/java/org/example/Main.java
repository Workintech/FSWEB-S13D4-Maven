package org.example;

public class Main {
    public static void main(String[] args) {
        //point

        Point p = new Point(0,0);
        Point p2 = new Point(6,8);
        System.out.println(p.distance(3,4));
        System.out.println(p2.distance(p));

        //player

        Player player1 = new Player("Haluk", 200, Weapon.SWORD);
        player1.losehealth(100);
        System.out.println(player1.healthRemaining());
    }
}