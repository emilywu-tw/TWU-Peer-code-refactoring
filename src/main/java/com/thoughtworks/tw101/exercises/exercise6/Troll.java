package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {

    private double hitpoints;
    private String name;

    Troll(String name){
        this.name = name;
        hitpoints = 40;
    }

    public String getName(){
        return name;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public void takeDamage(int amount){
        hitpoints = hitpoints - (amount/2.0);

    }

    public void reportStatus(){

        System.out.print("Name: " + getName() + ",");
        System.out.printf(" Damage: %5.2f \n", getHitpoints());
    }
}
