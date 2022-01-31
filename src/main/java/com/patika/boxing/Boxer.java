package com.patika.boxing;

public class Boxer {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Boxer (String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Boxer foe) {
        System.out.println("----------");
        System.out.println(this.name + " hits " + foe.name + ". Damage: "+this.damage);

        if (foe.isDodge()) {
            System.out.println(foe.name + " dodges.");
            return foe.health;
        }
    
        if (foe.health - this.damage < 0)
            return 0;
    
        return foe.health - this.damage;
    }

    public boolean isDodge() {
        double randomValue = Math.random () * 100;
        return randomValue <= this.dodge;
    }

}
