package ua.edu.ucu.apps.lotr;

import ua.edu.ucu.apps.kick.ElfKick;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElfKick());
    }
}
