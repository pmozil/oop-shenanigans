package ua.edu.ucu.apps.lotr;

import ua.edu.ucu.apps.kick.CryKick;
import ua.edu.ucu.apps.kick.KickStrategy;

public class Hobbit extends Character{
    public Hobbit() {
        super(3, 0, (KickStrategy) new CryKick());
    }
}
