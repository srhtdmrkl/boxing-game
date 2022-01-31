package com.patika.boxing;

public class Ring {
    
    Boxer b1;
    Boxer b2;
    int minWeight;
    int maxWeight;

    public Ring(Boxer b1, Boxer b2, int minWeight, int maxWeight) {
        this.b1 = b1;
        this.b2 = b2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        
        if (checkWeight()) {
            while (b1.health > 0 && b2.health > 0) {
                System.out.println("----- NEW ROUND -----");
                
                //Decides who is gonna hit first. Boxer 1 or Boxer 2.
                double firstHit = Math.floor(Math.random() * 2 + 1);

                if (firstHit==1) {
                    b2.health = b1.hit(b2);
                    if (isWin()) {
                    break;
                    }
                }
                if (firstHit==2) {
                    b1.health = b2.hit(b1);
                    if (isWin()) {
                        break;
                    }
                }
                printScore();
            }
        } else {
            System.out.println("Boxers are in different weight class.");
        }
    }
    
    public boolean checkWeight() {
        return (b1.weight >= minWeight && b1.weight <= maxWeight) && (b2.weight >= minWeight && b2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (b1.health == 0) {
            System.out.println("Winner: " + b2.name);
            return true;
        } else if (b2.health == 0) {
            System.out.println("Winner: " + b1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("----------");
        System.out.println(b1.name + "(Health: " + b1.health + ")");
        System.out.println(b2.name + "(Health: " + b2.health + ")");
    }
}
