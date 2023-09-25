package ua.edu.ucu.apps.lotr;

import java.util.Random;

import lombok.SneakyThrows;

public class CharacterFactory {
    private static Random rand = new Random();

    @SneakyThrows
    public static Character createCharacter() {
        int idx = rand.nextInt(4);

        switch(idx) {
            default:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new Knight();
            case 3:
                return new King();
        }
    }
}
