package ua.edu.ucu.apps.kick;

import ua.edu.ucu.apps.lotr.Character;

public class CryKick implements KickStrategy{
    @Override
    public void kick(Character kicker, Character kicked) {
        System.out.println("😢😢😢");
    }
}
