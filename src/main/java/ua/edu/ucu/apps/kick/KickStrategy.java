package ua.edu.ucu.apps.kick;

import ua.edu.ucu.apps.lotr.Character;

public interface KickStrategy {
    public abstract void kick(Character kicker, Character kicked);
}
