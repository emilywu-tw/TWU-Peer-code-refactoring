package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {

    private double hitpoints;
    private String name;

    Orc(String name){
        this.name = name;
        hitpoints = 20;

    }
    public String getName(){
        return name;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public void takeDamage(int amount){
        hitpoints = hitpoints - amount;
    }

    public void reportStatus(){
        System.out.print("Name: " + getName() + ",");
        System.out.printf(" Damage: %5.2f \n", getHitpoints());
    }

}
