package ua.edu.ucu.apps.lotr;

import java.util.Random;

import ua.edu.ucu.apps.kick.NobleKick;

public class Noble extends Character {
    private int min;
    private int max;
    private static Random rand = new Random();

    public Noble(int min, int max) {
        super(random(min, max), random(min, max), new NobleKick());
        this.min = min;
        this.max = max;
    }
    
    
    private static int random(int min ,int max) {
        return rand.nextInt(max - min) + min;
    }

    public int random() {
        return rand.nextInt(max - min) + min;
    }
}
